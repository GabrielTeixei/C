# Generated from Pdraw2.g4 by ANTLR 4.13.1
from antlr4 import *
if "." in __name__:
    from .Pdraw2Parser import Pdraw2Parser
else:
    from Pdraw2Parser import Pdraw2Parser

# This class defines a complete listener for a parse tree produced by Pdraw2Parser.
class Pdraw2Listener(ParseTreeListener):

    # Enter a parse tree produced by Pdraw2Parser#program.
    def enterProgram(self, ctx:Pdraw2Parser.ProgramContext):
        pass

    # Exit a parse tree produced by Pdraw2Parser#program.
    def exitProgram(self, ctx:Pdraw2Parser.ProgramContext):
        pass


    # Enter a parse tree produced by Pdraw2Parser#statement.
    def enterStatement(self, ctx:Pdraw2Parser.StatementContext):
        pass

    # Exit a parse tree produced by Pdraw2Parser#statement.
    def exitStatement(self, ctx:Pdraw2Parser.StatementContext):
        pass


    # Enter a parse tree produced by Pdraw2Parser#command.
    def enterCommand(self, ctx:Pdraw2Parser.CommandContext):
        pass

    # Exit a parse tree produced by Pdraw2Parser#command.
    def exitCommand(self, ctx:Pdraw2Parser.CommandContext):
        pass


    # Enter a parse tree produced by Pdraw2Parser#position_command.
    def enterPosition_command(self, ctx:Pdraw2Parser.Position_commandContext):
        pass

    # Exit a parse tree produced by Pdraw2Parser#position_command.
    def exitPosition_command(self, ctx:Pdraw2Parser.Position_commandContext):
        pass


    # Enter a parse tree produced by Pdraw2Parser#pen_control.
    def enterPen_control(self, ctx:Pdraw2Parser.Pen_controlContext):
        pass

    # Exit a parse tree produced by Pdraw2Parser#pen_control.
    def exitPen_control(self, ctx:Pdraw2Parser.Pen_controlContext):
        pass


    # Enter a parse tree produced by Pdraw2Parser#move_command.
    def enterMove_command(self, ctx:Pdraw2Parser.Move_commandContext):
        pass

    # Exit a parse tree produced by Pdraw2Parser#move_command.
    def exitMove_command(self, ctx:Pdraw2Parser.Move_commandContext):
        pass


    # Enter a parse tree produced by Pdraw2Parser#turn_command.
    def enterTurn_command(self, ctx:Pdraw2Parser.Turn_commandContext):
        pass

    # Exit a parse tree produced by Pdraw2Parser#turn_command.
    def exitTurn_command(self, ctx:Pdraw2Parser.Turn_commandContext):
        pass


    # Enter a parse tree produced by Pdraw2Parser#define_command.
    def enterDefine_command(self, ctx:Pdraw2Parser.Define_commandContext):
        pass

    # Exit a parse tree produced by Pdraw2Parser#define_command.
    def exitDefine_command(self, ctx:Pdraw2Parser.Define_commandContext):
        pass


    # Enter a parse tree produced by Pdraw2Parser#pen_attribute.
    def enterPen_attribute(self, ctx:Pdraw2Parser.Pen_attributeContext):
        pass

    # Exit a parse tree produced by Pdraw2Parser#pen_attribute.
    def exitPen_attribute(self, ctx:Pdraw2Parser.Pen_attributeContext):
        pass


    # Enter a parse tree produced by Pdraw2Parser#variable_declaration.
    def enterVariable_declaration(self, ctx:Pdraw2Parser.Variable_declarationContext):
        pass

    # Exit a parse tree produced by Pdraw2Parser#variable_declaration.
    def exitVariable_declaration(self, ctx:Pdraw2Parser.Variable_declarationContext):
        pass


    # Enter a parse tree produced by Pdraw2Parser#assignment.
    def enterAssignment(self, ctx:Pdraw2Parser.AssignmentContext):
        pass

    # Exit a parse tree produced by Pdraw2Parser#assignment.
    def exitAssignment(self, ctx:Pdraw2Parser.AssignmentContext):
        pass


    # Enter a parse tree produced by Pdraw2Parser#expression.
    def enterExpression(self, ctx:Pdraw2Parser.ExpressionContext):
        pass

    # Exit a parse tree produced by Pdraw2Parser#expression.
    def exitExpression(self, ctx:Pdraw2Parser.ExpressionContext):
        pass


    # Enter a parse tree produced by Pdraw2Parser#while_loop.
    def enterWhile_loop(self, ctx:Pdraw2Parser.While_loopContext):
        pass

    # Exit a parse tree produced by Pdraw2Parser#while_loop.
    def exitWhile_loop(self, ctx:Pdraw2Parser.While_loopContext):
        pass


    # Enter a parse tree produced by Pdraw2Parser#condition.
    def enterCondition(self, ctx:Pdraw2Parser.ConditionContext):
        pass

    # Exit a parse tree produced by Pdraw2Parser#condition.
    def exitCondition(self, ctx:Pdraw2Parser.ConditionContext):
        pass



del Pdraw2Parser