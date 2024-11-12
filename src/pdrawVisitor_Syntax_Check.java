
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


@SuppressWarnings("CheckReturnValue")
public class pdrawVisitor_Syntax_Check extends PdrawBaseVisitor<Object> {

   // =========================================================================================================================
   //  [ SETS GENERATION ] :
   // --------------------------------------------------
   // Save definitions of [PEN], [CANVAS] e [VARIABLES]:
   private Set<String> penDefinitions = new HashSet<>();
   private Set<String> variableDefinitions = new HashSet<>();
   private Set<String> canvasDefinitions = new HashSet<>();

   // ------------------------------
   // Save: Valid Types & Atributes:
   private Set<String> validPenTypes = Set.of("int", "real", "string", "bool");
   private static final Set<String> validDataTypes = Set.of("int", "real", "string", "bool");
   private static final Set<String> validPenAttributes = Set.of("color", "position", "orientation", "thickness", "pressure");

   // =========================================================================================================================
   //  [ PROGRAMA ] : VISITAR Contexto e todos os seus filhos
   @Override
   public Object visitProgram(PdrawParser.ProgramContext ctx) {
      for (PdrawParser.StatementContext statement : ctx.statement()) {
         visit(statement);
      }
      return null;
   }

   // =========================================================================================================================
   // [ STATEMENT ] : VISITAR e lidar com vários tipos diferentes
   @Override
   public Object visitStatement(PdrawParser.StatementContext ctx) {
      if (ctx.penDefinition() != null)        { visit(ctx.penDefinition()); }
      if (ctx.penDeclaration() != null)       { visit(ctx.penDeclaration()); }
      if (ctx.command() != null)              { visit(ctx.command()); }
      if (ctx.loop() != null)                 { visit(ctx.loop()); }
      if (ctx.conditional() != null)          { visit(ctx.conditional()); }
      if (ctx.outputCommand() != null)        { visit(ctx.outputCommand()); }
      if (ctx.inputCommand() != null)         { visit(ctx.inputCommand()); }
      if (ctx.assignment() != null)           { visit(ctx.assignment()); }
      if (ctx.canvasDefinition() != null)     { visit(ctx.canvasDefinition()); }
      if (ctx.variableDeclaration() != null)  { visit(ctx.variableDeclaration()); }
      if (ctx.expressionStatement() != null)  { visit(ctx.expressionStatement()); }
      return null;
   }

   // =========================================================================================================================
   // 1.) [ PEN ] : 
   // ------------------------- 
   // ----- Basic definitions : 
   //
   @Override
   public Object visitPenDefinition(PdrawParser.PenDefinitionContext ctx) {
      String penDefined = ctx.ID().getText();
      if (!penDefinitions.add(penDefined)) {
         throw new IllegalStateException("SYNTAX ERROR: Pen " + penDefined + " is already defined!");
      } else {
         return visitChildren(ctx);
      }
   }
   // ------------------
   // ----- Attributes :
   //
   @Override
   public Object visitPenAttributes(PdrawParser.PenAttributesContext ctx) {
      for (PdrawParser.PenAttributeContext attributeContext : ctx.penAttribute()) {
         visit(attributeContext);
      }
      return null;
   }

   @Override
   public Object visitPenAttribute(PdrawParser.PenAttributeContext ctx) {
      String attribute = ctx.getChild(0).getText();
      if (!validPenAttributes.contains(attribute)) {
         throw new IllegalStateException("SYNTAX ERROR: Pen attribute " + attribute + " is invalid !");
      }

      switch (attribute) {
         case "color":
            validateColorAttribute(ctx);
            break;
         case "position":
            validatePositionAttribute(ctx);
            break;
         case "orientation":
            validateOrientationAttribute(ctx);
            break;
         case "thickness":
            validateThicknessAttribute(ctx);
            break;
         case "pressure":
            validatePressureAttribute(ctx);
            break;
      }
      return null;
   }
   // --------------------------------
   // ----- METHOD: Attribute (Color)
   //
   private void validateColorAttribute(PdrawParser.PenAttributeContext ctx) {
      String colorValue = ctx.getChild(2).getText();
      if (!validColorValue(colorValue)) {
         throw new IllegalStateException("SYNTAX ERROR: Invalid color value format: " + colorValue);
      }
   }

   private boolean validColorValue(String colorValue) {
      // System.out.println(colorValue);
      switch (colorValue) {
         case "green":
         case "blue":
         case "red":
         case "yellow":
         case "orange":
         case "purple":
         case "pink":
         case "brown":
         case "black":
         case "white":
            return true;
         default:
            // Verify if the value matches the hexadecimal format
            return colorValue.matches("#[0-9a-fA-F]{6}");
      }
   }
   // ----------------------------------
   // ----- METHOD: Attribute (Position)
   //
   private void validatePositionAttribute(PdrawParser.PenAttributeContext ctx) {
      String positionValue = extractPositionValue(ctx.getText());
      // System.out.println(positionValue);
      if (!validPositionValue(positionValue)) {
         throw new IllegalStateException("SYNTAX ERROR: Invalid position value format: " + positionValue);
      }
   }

   private String extractPositionValue(String text) {
      // Adjusted pattern to match both complex expressions and numeric tuples
      Pattern pattern = Pattern.compile("=\\s*\\((int\\([^\\)]+\\)\\s*//\\s*\\d+\\s*,\\s*int\\([^\\)]+\\)\\s*//\\s*\\d+|\\d+\\s*,\\s*\\d+)\\)");
      Matcher matcher = pattern.matcher(text);

      if (matcher.find()) {
         // DEBUG
         // System.out.println("Matched 1 : " + matcher.group(1));
         // Extract the values within parentheses
         String positionValue = matcher.group(1);
         if (positionValue != null) {
            return positionValue;
         }
      }
      throw new IllegalStateException("SYNTAX ERROR: Position value not found in the context!");
   }

   private boolean validPositionValue(String positionValue) {
      // Regular expression to match either numeric values or expressions involving variables
      String regexNumeric = "\\d+\\s*,\\s*\\d+";
      String regexExpression = "int\\(\\s*\\w+\\s*\\)\\s*//\\s*\\d+\\s*,\\s*int\\(\\s*\\w+\\s*\\)\\s*//\\s*\\d+";

      return positionValue.matches(regexNumeric) || positionValue.matches(regexExpression);
   }

   // -------------------------------------
   // ----- METHOD: Attribute (Orientation)
   // 
   private void validateOrientationAttribute(PdrawParser.PenAttributeContext ctx) {
      String orientationValue = extractOrientationValue(ctx.getText());
      // System.out.println(orientationValue);
      if (!validOrientationValue(orientationValue)) {
         throw new IllegalStateException("SYNTAX ERROR: Invalid orientation value format: " + orientationValue);
      }
   }

   private String extractOrientationValue(String text) {
      // Regular expression to match the value after "=" and any leading/trailing whitespace
      Pattern pattern = Pattern.compile("=.*?(\\d+º)");
      Matcher matcher = pattern.matcher(text);
      if (matcher.find()) {
         return matcher.group(1); // Extracts the first capturing group which is the orientation value
      }
      throw new IllegalStateException("SYNTAX ERROR: Orientation value not found in the context!");
   }

   private boolean validOrientationValue(String orientationValue) {
      return orientationValue.matches("(0º|45º|90º|180º|270º|360º)");
   }
   // -----------------------------------
   // ----- METHOD: Attribute (Thickness)
   // 
   private void validateThicknessAttribute(PdrawParser.PenAttributeContext ctx) {
      String thicknessValue = extractThicknessValue(ctx.getText());
      if (!validThicknessValue(thicknessValue)) {
         throw new IllegalStateException("SYNTAX ERROR: Invalid thickness value format: " + thicknessValue);
      }
   }

   private String extractThicknessValue(String text) {
      Pattern pattern = Pattern.compile("=.*?(\\d+)");
      Matcher matcher = pattern.matcher(text);
      if (matcher.find()) {
         return matcher.group(1);
      }
      throw new IllegalStateException("SYNTAX ERROR: Thickness value not found in the context!");
   }

   private boolean validThicknessValue(String thicknessValue) {
      try {
         int value = Integer.parseInt(thicknessValue);
         return value > 0;
      } catch (NumberFormatException e) {
         return false;
      }
   }
   // ----------------------------------
   // ----- METHOD: Attribute (Pressure)
   //
   private void validatePressureAttribute(PdrawParser.PenAttributeContext ctx) {
      String pressureValue = extractPressureValue(ctx.getText());
      if (!validPressureValue(pressureValue)) {
         throw new IllegalStateException("SYNTAX ERROR: Invalid pressure value format: " + pressureValue);
      }
   }

   private String extractPressureValue(String text) {
      Pattern pattern = Pattern.compile("=.*?([-]?\\d+(/\\d+)?|\\d*\\.\\d+)");
      Matcher matcher = pattern.matcher(text);
      if (matcher.find()) {
         return matcher.group(1);
      }
      throw new IllegalStateException("SYNTAX ERROR: Pressure value not found in the context!");
   }

   private boolean validPressureValue(String pressureValue) {
      try {
         // Check Fraction format (Ex.: "1/3")
         if (pressureValue.contains("/")) {
            String[] parts = pressureValue.split("/");
            int numerator = Integer.parseInt(parts[0]);
            int denominator = Integer.parseInt(parts[1]);
            return denominator != 0 && numerator >= 0 && (double) numerator / denominator <= 1;
         }
         // Check Decimal format: (Ex.: "0.5")
         if (pressureValue.contains(".")) {
            double value = Double.parseDouble(pressureValue);
            return value >= 0 && value <= 1;
         }
         // Check Integer format
         int value = Integer.parseInt(pressureValue);
         return value >= -1 && value <= 1;
      } catch (NumberFormatException e) {
         return false;
      }
   }
   // =========================================================================================================================
   // 2.) [ PEN DECLARATION ] : 
   // ------------------------- 
   // ----- Visit declaration : 
   //
   @Override
   public Object visitPenDeclaration(PdrawParser.PenDeclarationContext ctx) {
      // System.out.println(ctx.ID());
      String penDeclare = ctx.ID(0).getText();
      // System.out.println("pendclare "+penDeclare);

      if (variableDefinitions.contains(penDeclare)) {
         throw new IllegalStateException("SYNTAX ERROR: Pen " + penDeclare + " has already been defined!");
      }

      penDefinitions.add(penDeclare);
      variableDefinitions.add(penDeclare);

      if (ctx.ID().size() == 2) {
         String penType = ctx.ID(1).getText();
      } else if (ctx.ID().size() == 1) {
      } else {
         throw new IllegalStateException("SYNTAX ERROR: Invalid pen declaration syntax!");
      }
      return null;
   }
   // =========================================================================================================================
   // 3.) [ PEN EXECUTION ] : 
   // ---------------------------
   // ----- Visit Pen Execution : 
   //
   @Override public Object visitPenExecution(PdrawParser.PenExecutionContext ctx) {
      Object res = null;
      return visitChildren(ctx);
      //return res;
   }
   // =========================================================================================================================
   // 4.) [ COMMANDS ] :
   // -----------------------------------
   // ----- Visit commands and validate : 
   //
   @Override
   public Object visitCommand(PdrawParser.CommandContext ctx) {
      if (ctx.penCommand() != null) {
         return visit(ctx.penCommand());
      } else if (ctx.drawCommand() != null) {
         return visit(ctx.drawCommand());
      } else if (ctx.getChild(0).getText().equals("pause")) {
         if (ctx.expression() == null) {
            throw new IllegalStateException("SYNTAX ERROR: 'pause' command requires an expression!");
         }
         return visit(ctx.expression());
      } else if (isValidDirection(ctx.getChild(0).getText())) {
         if (ctx.expression() == null) {
            throw new IllegalStateException("SYNTAX ERROR: Direction command requires an expression!");
         }
         return visit(ctx.expression());
      } else {
         throw new IllegalStateException("SYNTAX ERROR: Invalid command!");
      }
   }

   @Override
   public Object visitPenCommand(PdrawParser.PenCommandContext ctx) {
      String penId = ctx.ID().getText();
      if (!penDefinitions.contains(penId)) {
         throw new IllegalStateException("SYNTAX ERROR: Pen ID " + penId + " not defined!");
      }

      String penAction = ctx.getChild(1).getText();
      if (!penAction.equals("down") && !penAction.equals("up")) {
         throw new IllegalStateException("SYNTAX ERROR: Pen command has to be 'down' or 'up'!");
      }
      return null;
   }

   @Override
   public Object visitDrawCommand(PdrawParser.DrawCommandContext ctx) {
      String penId = ctx.ID().getText();
      if (!penDefinitions.contains(penId)) {
         throw new IllegalStateException("SYNTAX ERROR: Pen ID " + penId + " not defined!");
      }

      String direction = ctx.getChild(1).getText();
      if (!isValidDirection(direction)) {
         throw new IllegalStateException("SYNTAX ERROR: Invalid drawing direction: " + direction);
      }

      if (ctx.expression() == null) {
         throw new IllegalStateException("SYNTAX ERROR: Draw command requires an expression!");
      }
      return visit(ctx.expression());
   }
   // -------------------------------------------
   // ----- METHOD: Draw Command (Valid Direction)
   //
   private boolean isValidDirection(String direction) {
      return direction.equals("forward") || direction.equals("backward")
              || direction.equals("left") || direction.equals("right");
   }
   // =========================================================================================================================
   // 5.) [ LOOP ] :
   // --------------
   @Override
   public Object visitLoop(PdrawParser.LoopContext ctx) {
      if (ctx.variableDeclaration() != null) {
         visit(ctx.variableDeclaration());
      }

      visit(ctx.expression(0));
      if (ctx.expression().size() > 1) {
         visit(ctx.expression(1));
      }

      if (ctx.variableDeclaration() == null) {
         return visitChildren(ctx);
      }
      return null;
   }
   // =========================================================================================================================   
   // 6.) [ CONDITIONAL ] :
   // ---------------------
   @Override
   public Object visitConditional(PdrawParser.ConditionalContext ctx) {
      // Verificar se tem 'if'
      if (!ctx.getStart().getText().equals("if")) {
         throw new IllegalStateException("SYNTAX ERROR: 'if' keyword is missing!");
      }

      // Verificar '('
      if (!ctx.getChild(1).getText().equals("(")) {
         throw new IllegalStateException("SYNTAX ERROR: expected '(' .");
      }

      // Visitar expression dentro dos parentises
      visit(ctx.expression());

      // Verificar ')'
      if (!ctx.getChild(3).getText().equals(")")) {
         throw new IllegalStateException("SYNTAX ERROR: expected ')' .");
      }

      // Verificar '{'
      if (!ctx.getChild(4).getText().equals("{")) {
         throw new IllegalStateException("SYNTAX ERROR: expected '{' .");
      }

      // Verificar statement entre { }
      for (PdrawParser.StatementContext statementCtx : ctx.statement()) {
         visit(statementCtx);
      }

      // Verificar '}'
      if (!ctx.getChild(ctx.getChildCount() - 1).getText().equals("}")) {
         throw new IllegalStateException("SYNTAX ERROR: expected '}' .");
      }

      return null;
   }
   // =========================================================================================================================   
   // 7.) [ OUTPUT COMMAND ] :  
   // ------------------------
   @Override
   public Object visitOutputCommand(PdrawParser.OutputCommandContext ctx) {
      // Visitar expression para validar
      visit(ctx.expression());

      // Verificar se ';' termina
      if (!ctx.getChild(ctx.getChildCount() - 1).getText().equals(";")) {
         throw new IllegalStateException("SYNTAX ERROR: Output command is missing ';' at the end!");
      }
      return null;
   }
   // =========================================================================================================================   
   // 8.) [ INPUT COMMAND ] :
   // -----------------------
   @Override
   public Object visitInputCommand(PdrawParser.InputCommandContext ctx) {
      String variableName = ctx.ID().getText();
      if (!variableDefinitions.contains(variableName)) {
         throw new IllegalStateException("SYNTAX ERROR: Variable '" + variableName + "' is not declared!");
      }
      return null;
   }
   // =========================================================================================================================   
   // 9.) [ ASSIGNMENT ] :
   // --------------------
   @Override
   public Object visitAssignment(PdrawParser.AssignmentContext ctx) {
      String variable = ctx.ID().getText();
      // System.out.println("\nvar  : "+variable);
      // System.out.println("\nPen defs   : "+variableDefinitions);
      if (!variableDefinitions.contains(variable)) {
         throw new IllegalStateException("ERROR: Variable '" + variable + "' is not declared!");
      }
      return visitChildren(ctx);
   }

   @Override public Object visitAttributeAssign(PdrawParser.AttributeAssignContext ctx) {
      Object res = null;
      return visitChildren(ctx);
      //return res;
   }
   // =========================================================================================================================   
   // 10.) [ CANVAS DEFINITION ] :
   // ----------------------------
   @Override public Object visitCanvasDefinition(PdrawParser.CanvasDefinitionContext ctx) {
      String canvasDefined = ctx.ID().getText();
      if (!canvasDefinitions.add(canvasDefined)) {
         throw new IllegalStateException("SYNTAX ERROR: Canvas " + canvasDefined + " is already defined!");
      }
      return null;
   }
   // ========================================================================================================================= 
   // 11.) [ VARIABLE DECLARATION ] :
   // -------------------------------
   @Override
   public Object visitVariableDeclaration(PdrawParser.VariableDeclarationContext ctx) {
      // Verifica se há algum dataType
      String dataType = ctx.dataType() != null && !ctx.dataType().isEmpty() ? ctx.dataType().get(0).getText() : null;

      // Itera sobre todas as variáveis declaradas
      for (int i = 0; i < ctx.ID().size(); i++) {
         String variableDeclare = ctx.ID().get(i).getText();
         if (!variableDefinitions.contains(variableDeclare)) {
            variableDefinitions.add(variableDeclare);
         }
      }

      // System.out.println("vars : " + variableDefinitions);

      return visitChildren(ctx);
   }

   @Override public Object visitDataType(PdrawParser.DataTypeContext ctx) {
      Object res = null;
      return visitChildren(ctx);
      //return res;
   }
   // ========================================================================================================================= 
   // 12.) [ EXPRESSION STATEMENT ] :
   // -------------------------------
   @Override public Object visitExpressionStatement(PdrawParser.ExpressionStatementContext ctx) {
      Object res = null;
      return visitChildren(ctx);
      //return res;
   }

   // ========================================================================================================================= 
   // 13.) [ END STATEMENT ] :
   // ------------------------
   @Override public Object visitEndStatement(PdrawParser.EndStatementContext ctx) {
      Object res = null;
      return visitChildren(ctx);
      //return res;
   }
   // ========================================================================================================================= 
   // [ EXPRESSIONS ] : 
   // ------------------------
   @Override public Object visitArithmetic(PdrawParser.ArithmeticContext ctx) {
      Object res = null;
      return visitChildren(ctx);
      //return res;
   }

   @Override public Object visitUnary(PdrawParser.UnaryContext ctx) {
      Object res = null;
      return visitChildren(ctx);
      //return res;
   }

   @Override public Object visitGrouping(PdrawParser.GroupingContext ctx) {
      Object res = null;
      return visitChildren(ctx);
      //return res;
   }
   
   @Override public Object visitTuple(PdrawParser.TupleContext ctx) {
      Object res = null;
      return visitChildren(ctx);
      //return res;
   }

   @Override public Object visitConcatenation(PdrawParser.ConcatenationContext ctx) {
      Object res = null;
      return visitChildren(ctx);
      //return res;
   }

   @Override public Object visitComparation(PdrawParser.ComparationContext ctx) {
      Object res = null;
      return visitChildren(ctx);
      //return res;
   }

   @Override public Object visitEquality(PdrawParser.EqualityContext ctx) {
      Object res = null;
      return visitChildren(ctx);
      //return res;
   }

   @Override public Object visitDegree(PdrawParser.DegreeContext ctx) {
      Object res = null;
      return visitChildren(ctx);
      //return res;
   }

   @Override public Object visitPlain(PdrawParser.PlainContext ctx) {
      Object res = null;
      return visitChildren(ctx);
      //return res;
   }

   @Override public Object visitStrings(PdrawParser.StringsContext ctx) {
      Object res = null;
      return visitChildren(ctx);
      //return res;
   }

   @Override public Object visitBooleans(PdrawParser.BooleansContext ctx) {
      Object res = null;
      return visitChildren(ctx);
      //return res;
   }

   @Override public Object visitFunction(PdrawParser.FunctionContext ctx) {
      Object res = null;
      return visitChildren(ctx);
      //return res;
   }

   @Override public Object visitAttribute(PdrawParser.AttributeContext ctx) {
      Object res = null;
      return visitChildren(ctx);
      //return res;
   }

   @Override public Object visitVariable(PdrawParser.VariableContext ctx) {
      Object res = null;
      return visitChildren(ctx);
      //return res;
   }

   @Override public Object visitInput(PdrawParser.InputContext ctx) {
      Object res = null;
      return visitChildren(ctx);
      //return res;
   }

   @Override public Object visitType(PdrawParser.TypeContext ctx) {
      Object res = null;
      return visitChildren(ctx);
      //return res;
   }

   @Override public Object visitData(PdrawParser.DataContext ctx) {
      Object res = null;
      return visitChildren(ctx);
      //return res;
   }
   // ========================================================================================================================= 
   // R1.) [ TYPE CAST ] : 
   // --------------------
   @Override public Object visitTypeCast(PdrawParser.TypeCastContext ctx) {
      Object res = null;
      return visitChildren(ctx);
      //return res;
   }
   // ========================================================================================================================= 
   // R2.)  [ FUNCTION CALL ] :
   // -------------------------
   @Override public Object visitFunctionCall(PdrawParser.FunctionCallContext ctx) {
      Object res = null;
      return visitChildren(ctx);
      //return res;
   }
   // ========================================================================================================================= 
   // R3.) [ DEGREE EXPRESSION ] :
   // ----------------------------
   @Override public Object visitDegreeExpression(PdrawParser.DegreeExpressionContext ctx) {
      Object res = null;
      return visitChildren(ctx);
      //return res;
   }
   // ========================================================================================================================= 
   // R4.) [ ARGUMENT LIST ] : 
   // ------------------------
   @Override public Object visitArgumentList(PdrawParser.ArgumentListContext ctx) {
      Object res = null;
      return visitChildren(ctx);
      //return res;
   }
   // ========================================================================================================================= 
   // R5.) [ COLOR EXPRESSION ] :
   // ---------------------------
   @Override public Object visitColorExpression(PdrawParser.ColorExpressionContext ctx) {
      Object res = null;
      return visitChildren(ctx);
      //return res;
   }
   // ========================================================================================================================= 
   // R6.) [ VALUE ] :
   // ----------------
   @Override public Object visitValue(PdrawParser.ValueContext ctx) {
      Object res = null;
      return visitChildren(ctx);
      //return res;
   }
}