# Generated from Pdraw2.g4 by ANTLR 4.13.1
from antlr4 import *
if "." in __name__:
    from .Pdraw2Parser import Pdraw2Parser
else:
    from Pdraw2Parser import Pdraw2Parser

# This class defines a complete generic visitor for a parse tree produced by Pdraw2Parser.

class Pdraw2Visitor(ParseTreeVisitor):

    # Visit a parse tree produced by Pdraw2Parser#program.
    def visitProgram(self, ctx:Pdraw2Parser.ProgramContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by Pdraw2Parser#statement.
    def visitStatement(self, ctx:Pdraw2Parser.StatementContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by Pdraw2Parser#command.
    def visitCommand(self, ctx:Pdraw2Parser.CommandContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by Pdraw2Parser#position_command.
    def visitPosition_command(self, ctx:Pdraw2Parser.Position_commandContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by Pdraw2Parser#pen_control.
    def visitPen_control(self, ctx:Pdraw2Parser.Pen_controlContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by Pdraw2Parser#move_command.
    def visitMove_command(self, ctx:Pdraw2Parser.Move_commandContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by Pdraw2Parser#turn_command.
    def visitTurn_command(self, ctx:Pdraw2Parser.Turn_commandContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by Pdraw2Parser#define_command.
    def visitDefine_command(self, ctx:Pdraw2Parser.Define_commandContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by Pdraw2Parser#pen_attribute.
    def visitPen_attribute(self, ctx:Pdraw2Parser.Pen_attributeContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by Pdraw2Parser#variable_declaration.
    def visitVariable_declaration(self, ctx:Pdraw2Parser.Variable_declarationContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by Pdraw2Parser#assignment.
    def visitAssignment(self, ctx:Pdraw2Parser.AssignmentContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by Pdraw2Parser#expression.
    def visitExpression(self, ctx:Pdraw2Parser.ExpressionContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by Pdraw2Parser#while_loop.
    def visitWhile_loop(self, ctx:Pdraw2Parser.While_loopContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by Pdraw2Parser#condition.
    def visitCondition(self, ctx:Pdraw2Parser.ConditionContext):
        return self.visitChildren(ctx)



del Pdraw2Parser