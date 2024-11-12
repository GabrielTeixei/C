import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import org.stringtemplate.v4.*;

import java.util.HashMap;
import java.util.Map;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@SuppressWarnings("CheckReturnValue")
public class NewSemantyc extends PdrawBaseVisitor<Object> {
   private Set<String> penTypes = new HashSet<>();
   private Map<String, String> penDefinitions = new HashMap<>();
   private Set<String> variableDefinitions = new HashSet<>();
   private STGroup group;
   private ST program;

   public NewSemantyc() {
      group = new STGroupFile("template.stg");
      program = group.getInstanceOf("program");
   }

   @Override
   public Object visitProgram(PdrawParser.ProgramContext ctx) {
      visitChildren(ctx);
      System.out.println(program.render());
      return null;
   }

   @Override
   public Object visitStatement(PdrawParser.StatementContext ctx) {
      return visitChildren(ctx);
   }

   @Override
   public Object visitPenDefinition(PdrawParser.PenDefinitionContext ctx) {
      String penType = ctx.ID().getText();
      if (penTypes.contains(penType)) {
         throw new RuntimeException("Pen type " + penType + " already defined");
      }
      penTypes.add(penType);
      ST penDef = group.getInstanceOf("penDefinition");
      penDef.add("penType", penType);
      penDef.add("penAttributes", visit(ctx.penAttributes()));
      program.add("statements", penDef);
      return null;
   }

   @Override
   public Object visitPenAttributes(PdrawParser.PenAttributesContext ctx) {
      ST penAttributes = group.getInstanceOf("penAttributes");
      for (PdrawParser.PenAttributeContext attributeContext : ctx.penAttribute()) {
         penAttributes.add("attributes", visit(attributeContext));
      }
      return penAttributes.render();
   }

   @Override
   public Object visitPenAttribute(PdrawParser.PenAttributeContext ctx) {
      String attrName = ctx.start.getText();
      String attrValue;

      switch (attrName) {
         case "color":
            String color = visitColorExpression(ctx.colorExpression());
            attrValue = color;
            break;
         case "orientation":
            String orientation = visitDegreeExpression(ctx.degreeExpression());
            attrValue = orientation;
            break;
         case "position":
            String posX = ctx.expression(0).getText();
            String posY = ctx.expression(1).getText();
            attrValue = "(" + posX + ", " + posY + ")";
            break;
         case "thickness":
            String thickness = ctx.expression(0).getText();
            attrValue = thickness;
            break;
         case "pressure":
            String pressure = ctx.expression(0).getText();
            attrValue = pressure;
            break;
         default:
            attrValue = "";
            break;
      }
      ST penAttribute = group.getInstanceOf("penAttribute");
      penAttribute.add("attrName", attrName);
      penAttribute.add("attrValue", attrValue);
      return penAttribute.render();
   }

   @Override
   public Object visitPenDeclaration(PdrawParser.PenDeclarationContext ctx) {

      String penName = ctx.ID().get(0).getText();
      String penType;
      if (ctx.ID().size() > 1) {
         penType = ctx.ID().get(1).getText();
         if (!penTypes.contains(penType)) {
            throw new RuntimeException("Pen type " + penType + " not defined");
         }
      } else {
         penType = "Pen";
      }

      ST penDeclaration = group.getInstanceOf("penDeclaration");
      penDeclaration.add("penName", penName);
      penDeclaration.add("penType", penType);
      penDefinitions.put(penName, penType);
      program.add("statements", penDeclaration);
      return null;
   }

   @Override
   public Object visitPenExecution(PdrawParser.PenExecutionContext ctx) {
      String penName = ctx.ID().getText();
      String scriptName = ctx.STRING().getText().replace("\"", "");
      if (!penDefinitions.containsKey(penName)) {
         throw new IllegalStateException("Pen " + penName + " is not defined.");
      }

      ST execute = group.getInstanceOf("executeScript");
      execute.add("scriptName", scriptName);
      program.add("statements", execute.render());

      return null;
   }

   @Override
   public Object visitCommand(PdrawParser.CommandContext ctx) {
      if (ctx.getChild(0) instanceof TerminalNode && ((TerminalNode) ctx.getChild(0)).getText().equals("pause")) {
         return visitPause(ctx);
      }
      return visitChildren(ctx);
   }

   @Override
   public Object visitPenCommand(PdrawParser.PenCommandContext ctx) {
      String penName = ctx.ID().getText();
      if (!penDefinitions.containsKey(penName)) {
         throw new IllegalStateException("Pen " + penName + " is not defined.");
      }
      String command = ctx.getChild(1).getText();
      ST penCmd = group.getInstanceOf("penCommand");
      penCmd.add("penName", penName);
      if (command.equals("down")) {
         penCmd.add("command", "pendown");
      } else {
         penCmd.add("command", "penup");
      }
      program.add("statements", penCmd.render());
      return null;
   }

   @Override
   public Object visitDrawCommand(PdrawParser.DrawCommandContext ctx) {
      String penName = ctx.ID().getText();
      if (!penDefinitions.containsKey(penName)) {
         throw new IllegalStateException("Pen " + penName + " is not defined.");
      }

      String direction = ctx.getChild(1).getText();
      String expression = ctx.expression().getText().replace("º", "");

      ST drawCmd = group.getInstanceOf("drawCommand");
      drawCmd.add("penName", penName);
      drawCmd.add("direction", direction);
      drawCmd.add("expression", expression);
      String result = drawCmd.render();
      program.add("statements", result);

      
      for (PdrawParser.CommandContext command : ctx.command()) {
         direction = command.getChild(0).getText();
         expression = command.expression().getText();
         if (direction.equals("forward") || direction.equals("backward")) {
               drawCmd = group.getInstanceOf("drawCommand");
               drawCmd.add("penName", penName);
               drawCmd.add("direction", direction);
               drawCmd.add("expression", expression);
               result = drawCmd.render();
               program.add("statements", result);
         } else if (direction.equals("right") || direction.equals("left")) {
               expression = expression.replace("º", "");
               drawCmd = group.getInstanceOf("drawCommand");
               drawCmd.add("penName", penName);
               drawCmd.add("direction", direction);
               drawCmd.add("expression", expression);
               result = drawCmd.render();
               program.add("statements", result);
         } else if (direction.equals("pause")) {
               ST pauseCmd = group.getInstanceOf("pause");
               pauseCmd.add("time", expression);
               result = pauseCmd.render();
               program.add("statements", result);
         }
      }

      return result;
   }

   @Override
   public Object visitLoop(PdrawParser.LoopContext ctx) {
      StringBuilder bodyBuilder = new StringBuilder();
      for (PdrawParser.StatementContext statementCtx : ctx.statement()) {
         Object command = visit(statementCtx);  
         if (command != null) {
               bodyBuilder.append(command.toString()).append("\n");
         } 

         
      }
      String body = bodyBuilder.toString();

      if (ctx.getStart().getText().equals("for")) {
         ST loop = group.getInstanceOf("forLoop");

         String[] initializationParts = ctx.variableDeclaration().getText().split("=");
         String loopVariable = initializationParts[0].trim();

         String[] conditionParts = ctx.expression(0).getText().split("<");
         String endValue = conditionParts[1].trim();

         loop.add("loopVariable", loopVariable);
         loop.add("endValue", endValue);
         loop.add("statements", body);

         program.add("statements", loop.render());
      } else if (ctx.getStart().getText().equals("until")) {
         ST loop = group.getInstanceOf("untilLoop");

         String condition = ctx.expression(0).getText();

         loop.add("condition", condition);
         loop.add("statements", body);

         program.add("statements", loop.render());
      }

      return body;  
   }

   @Override
   public Object visitConditional(PdrawParser.ConditionalContext ctx) {
      ST conditional = group.getInstanceOf("conditional");
      String condition = ctx.expression().getText();
      StringBuilder bodyBuilder = new StringBuilder();
      for (PdrawParser.StatementContext statementCtx : ctx.statement()) {
         bodyBuilder.append(visit(statementCtx)).append("\n");
      }
      String body = bodyBuilder.toString();

      conditional.add("condition", condition);
      conditional.add("statements", body);
      program.add("statements", conditional.render());
      return null;
   }

   @Override
   public Object visitOutputCommand(PdrawParser.OutputCommandContext ctx) {
      String expressionText = ctx.expression().getText();
      ST output = group.getInstanceOf("outputCommand");

      if (penDefinitions.containsKey(expressionText)) {
         output.add("expression", expressionText);
      } else if (variableDefinitions.contains(expressionText)) {
         output.add("expression", expressionText);
      } else if (expressionText.startsWith("\"") && expressionText.endsWith("\"")) {
         output.add("expression", expressionText);
      } else if (penTypes.contains(expressionText)) {
         output.add("expression", expressionText);
      } else {
         throw new IllegalStateException("Variable " + expressionText + " is not defined.");
      }
      program.add("statements", output.render());
      return null;
   }

   public class InputParser {
      public static String[] parseInput(String inputString) {
         Pattern pattern = Pattern.compile("\\((.*?)\\)");
         Matcher matcher = pattern.matcher(inputString);
         while (matcher.find()) {
            String match = matcher.group(1);
            inputString = inputString.replace(match, match.replace(",", "_comma_"));
         }
         String[] splitString = inputString.split(",");
         for (int i = 0; i < splitString.length; i++) {
            splitString[i] = splitString[i].replace("_comma_", ",");
         }
         return splitString;
      }
   }

   @Override
   public Object visitInputCommand(PdrawParser.InputCommandContext ctx) {
      String inputCommand = ctx.getText(); // Obtém a entrada completa
      String[] tokens = InputParser.parseInput(inputCommand);
      tokens = inputCommand.split("[;]");
      boolean flag = false;
      for (String token : tokens) {
         String[] parts = token.trim().split("\\s*=\\s*(?![^\\(]*\\))");
         if (flag) {
            
            flag = false;
         } else if (parts.length == 1) {
            String varName = parts[0];
            String type = "";
            ST input = group.getInstanceOf("inputCommand");
            input.add("var", varName);
            program.add("statements", input.render());
         } else if (parts.length == 2) {
            String variableName = parts[0];
            String value = parts[1];
            if (penDefinitions.containsKey(variableName)) {
               flag = true;
            } else {
               String type = value.substring(0, value.indexOf("(")).trim();
               ST input = group.getInstanceOf("inputCommand");
               input.add("var", variableName);
               input.add("type", type);
               program.add("statements", input.render());
            }
         }
      }

      return null;
   }

   @Override
   public Object visitAssignment(PdrawParser.AssignmentContext ctx) {
      String varName = ctx.ID().getText();
      String value = (String) visit(ctx.attributeAssign());
      ST assignment = group.getInstanceOf("assignment");
      assignment.add("varName", varName);
      assignment.add("value", value);
      String result = assignment.render();
      program.add("statements", result);
      return result;
   }

   @Override
   public Object visitAttributeAssign(PdrawParser.AttributeAssignContext ctx) {
      String attribute = ctx.start.getText();
      String value;

      if (attribute.equals("color")) {
         value = (String) visitColorExpression(ctx.colorExpression());
      } else if (attribute.equals("orientation")) {
         value = (String) visit(ctx.expression(0));
      } else if (attribute.equals("position")) {
         value = "(" + ctx.expression(0).getText() + ", " + ctx.expression(1).getText() + ")";
      } else if (attribute.equals("thickness")) {
         value = ctx.expression(0).getText();
      } else if (attribute.equals("pressure")) {
         value = ctx.expression(0).getText();
      } else {
         value = ctx.expression(0).getText();
      }

      return attribute + '(' + value + ')';
   }


   @Override
   public Object visitCanvasDefinition(PdrawParser.CanvasDefinitionContext ctx) {
      String title = ctx.STRING().getText();
      String width = "500";
      String height = "500";

      String canvasName = ctx.ID().getText();

      if (ctx.expression().size() > 0) {
         width = ctx.expression(0).getText();
         height = ctx.expression(1).getText();
      }

      ST canvasDef = group.getInstanceOf("canvasDefinition");
      canvasDef.add("canvasName", canvasName);
      canvasDef.add("title", title);
      canvasDef.add("width", width);
      canvasDef.add("height", height);
      program.add("statements", canvasDef.render());

      return null;
   }
   
   @Override
   public Object visitVariableDeclaration(PdrawParser.VariableDeclarationContext ctx) {
      StringBuilder resultBuilder = new StringBuilder();
      for (int i = 0; i < ctx.ID().size(); i++) {
         String varName = ctx.ID(i).getText();
         String type = ctx.dataType(i) == null ? "var" : ctx.dataType(i).getText();
         if (type.equals("real")) { 
               type = "float"; 
         }
         if (ctx.expression() != null && i < ctx.expression().size()) { 
               String value = ctx.expression(i).getText();
               if (value.contains("stdin")) {
                  value = type + "(input('" + varName + ": '))";
               }
               ST variableDeclaration = group.getInstanceOf("variableDeclaration");
               variableDeclaration.add("varName", varName);
               variableDeclaration.add("value", value);
               String result = variableDeclaration.render();
               program.add("statements", result);
               resultBuilder.append(result).append("\n");
         }
         variableDefinitions.add(varName);
      }
      return resultBuilder.toString();
   }

   @Override
   public Object visitDataType(PdrawParser.DataTypeContext ctx) {
      Object res = null;
      return visitChildren(ctx);
      // return res;
   }

   @Override
   public Object visitExpressionStatement(PdrawParser.ExpressionStatementContext ctx) {
   
      return visitChildren(ctx);
   }

   @Override
   public Object visitEndStatement(PdrawParser.EndStatementContext ctx) {
      Object res = null;
      return visitChildren(ctx);
      // return res;
   }

   @Override
   public Object visitVariable(PdrawParser.VariableContext ctx) {
      Object res = null;
      return visitChildren(ctx);
      // return res;
   }

   @Override
   public Object visitDegree(PdrawParser.DegreeContext ctx) {
      Object res = null;
      return visitChildren(ctx);
      // return res;
   }

   @Override
   public Object visitAttribute(PdrawParser.AttributeContext ctx) {
      Object res = null;
      return visitChildren(ctx);
      // return res;
   }

   @Override
   public Object visitBooleans(PdrawParser.BooleansContext ctx) {
      Object res = null;
      return visitChildren(ctx);
      // return res;
   }

   @Override
   public Object visitGrouping(PdrawParser.GroupingContext ctx) {
      Object res = null;
      return visitChildren(ctx);
      // return res;
   }

   @Override
   public Object visitData(PdrawParser.DataContext ctx) {
      Object res = null;
      return visitChildren(ctx);
      // return res;
   }

   @Override
   public Object visitStrings(PdrawParser.StringsContext ctx) {
      Object res = null;
      return visitChildren(ctx);
      // return res;
   }

   @Override
   public Object visitUnary(PdrawParser.UnaryContext ctx) {
      Object res = null;
      return visitChildren(ctx);
      // return res;
   }

   @Override
   public Object visitFunction(PdrawParser.FunctionContext ctx) {
      Object res = null;
      return visitChildren(ctx);
      // return res;
   }

   @Override
   public Object visitInput(PdrawParser.InputContext ctx) {
      Object res = null;
      return visitChildren(ctx);
      // return res;
   }

   @Override
   public Object visitType(PdrawParser.TypeContext ctx) {
      Object res = null;
      return visitChildren(ctx);
      // return res;
   }

   @Override
   public Object visitPlain(PdrawParser.PlainContext ctx) {
      Object res = null;
      return visitChildren(ctx);
      // return res;
   }

   @Override
   public Object visitConcatenation(PdrawParser.ConcatenationContext ctx) {
      Object res = null;
      return visitChildren(ctx);
      // return res;
   }

   @Override
   public Object visitEquality(PdrawParser.EqualityContext ctx) {
      Object res = null;
      return visitChildren(ctx);
      // return res;
   }

   @Override
   public Object visitTuple(PdrawParser.TupleContext ctx) {
      Object res = null;
      return visitChildren(ctx);
      // return res;
   }

   @Override
   public Object visitComparation(PdrawParser.ComparationContext ctx) {
      Object res = null;
      return visitChildren(ctx);
      // return res;
   }

   @Override
   public Object visitArithmetic(PdrawParser.ArithmeticContext ctx) {
      Object res = null;
      return visitChildren(ctx);
      // return res;
   }

   @Override
   public Object visitTypeCast(PdrawParser.TypeCastContext ctx) {
      Object res = null;
      return visitChildren(ctx);
      // return res;
   }

   @Override
   public Object visitFunctionCall(PdrawParser.FunctionCallContext ctx) {
      Object res = null;
      return visitChildren(ctx);
      // return res;
   }

   @Override
   public String visitDegreeExpression(PdrawParser.DegreeExpressionContext ctx) {
      return ctx.getText().replace("º", "");
   }

   @Override
   public Object visitArgumentList(PdrawParser.ArgumentListContext ctx) {
      Object res = null;
      return visitChildren(ctx);
      // return res;
   }

   @Override
   public String visitColorExpression(PdrawParser.ColorExpressionContext ctx) {
      String res = ctx.getText();
      if (res.charAt(0) == '#') {
         return res;
      }
      // transform to string in python
      return "'" + res + "'";
   }

   @Override
   public Object visitValue(PdrawParser.ValueContext ctx) {
      Object res = null;
      return visitChildren(ctx);
      // return res;
   }

   private Object visitPause(PdrawParser.CommandContext ctx) {
      String pauseTime = ctx.expression().getText();
      ST pauseCmd = group.getInstanceOf("pause");
      pauseCmd.add("time", pauseTime);
      program.add("statements", pauseCmd.render());
      return null;
   }
}
