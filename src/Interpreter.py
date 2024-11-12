from Pdraw2Parser import Pdraw2Parser
from Pdraw2Visitor import Pdraw2Visitor
from Pen import Pen

class Interpreter(Pdraw2Visitor):
    def __init__(self):
        self.pen = Pen()
        self.variables = {}  # Dictionary to store variable values

    def execute(self, content):
        from antlr4 import InputStream, CommonTokenStream
        from Pdraw2Lexer import Pdraw2Lexer
        from Pdraw2Parser import Pdraw2Parser

        input_stream = InputStream(content)
        lexer = Pdraw2Lexer(input_stream)
        stream = CommonTokenStream(lexer)
        parser = Pdraw2Parser(stream)
        tree = parser.program()
        self.visit(tree)

    def visitProgram(self, ctx: Pdraw2Parser.ProgramContext):
        return self.visitChildren(ctx)

    def visitStatement(self, ctx: Pdraw2Parser.StatementContext):
        return self.visitChildren(ctx)

    def visitCommand(self, ctx: Pdraw2Parser.CommandContext):
        return self.visitChildren(ctx)

    def visitPosition_command(self, ctx: Pdraw2Parser.Position_commandContext):
        x = self.visitExpression(ctx.expression(0))
        y = self.visitExpression(ctx.expression(1))
        self.pen.setPosition(x, y)
        return None


    def visitPen_control(self, ctx: Pdraw2Parser.Pen_controlContext):
        if ctx.getText() == "down":
            self.pen.setDown(True)
        elif ctx.getText() == "up":
            self.pen.setDown(False)
        return None

    def visitMove_command(self, ctx: Pdraw2Parser.Move_commandContext):
        distance = float(ctx.expression().getText())
        if ctx.getText().startswith("forward"):
            self.pen.moveForward(distance)
        elif ctx.getText().startswith("backward"):
            self.pen.moveBackward(distance)
        return None

    def visitTurn_command(self, ctx: Pdraw2Parser.Turn_commandContext):
        angle = float(ctx.expression().getText().replace("º", ""))
        if ctx.getText().startswith("left"):
            self.pen.turnLeft(angle)
        elif ctx.getText().startswith("right"):
            self.pen.turnRight(angle)
        return None

    def visitDefine_command(self, ctx: Pdraw2Parser.Define_commandContext):
        # Not implemented yet
        return None

    def visitPen_attribute(self, ctx: Pdraw2Parser.Pen_attributeContext):
        attribute = ctx.getChild(0).getText()
        value = ctx.getChild(2).getText()
        if attribute == "color":
            self.pen.setColor(value)
        elif attribute == "position":
            x = float(ctx.expression(0).getText())
            y = float(ctx.expression(1).getText())
            self.pen.setPosition(x, y)
        elif attribute == "orientation":
            orientation = float(value.replace("º", ""))
            self.pen.turnRight(orientation)
        elif attribute == "thickness":
            self.pen.setThickness(float(value))
        elif attribute == "pressure":
            self.pen.setPressure(float(value))
        elif attribute == "label":
            self.pen.setLabel(value.replace("\"", ""))
        return None

    def visitVariable_declaration(self, ctx: Pdraw2Parser.Variable_declarationContext):
        var_name = ctx.ID().getText()
        value = self.visitExpression(ctx.expression())
        self.variables[var_name] = value
        return None

    def visitAssignment(self, ctx: Pdraw2Parser.AssignmentContext):
        var_name = ctx.ID().getText()
        value = self.visitExpression(ctx.expression())
        self.variables[var_name] = value
        return None

    def visitExpression(self, ctx: Pdraw2Parser.ExpressionContext):
        if ctx.NUMBER():
            return float(ctx.NUMBER().getText())
        elif ctx.ID():
            var_name = ctx.ID().getText()
            if var_name in self.variables:
                return self.variables[var_name]
            else:
                raise ValueError(f"Variable '{var_name}' not defined.")
        elif ctx.getChildCount() == 3:
            left = self.visitExpression(ctx.expression(0))
            right = self.visitExpression(ctx.expression(1))
            operator = ctx.getChild(1).getText()
            if operator == '+':
                return left + right
            elif operator == '-':
                return left - right
            elif operator == '*':
                return left * right
            elif operator == '/':
                return left / right



    def visitWhile_loop(self, ctx: Pdraw2Parser.While_loopContext):
        condition = self.visitCondition(ctx.condition())
        while condition:
            for statement in ctx.statement():
                self.visit(statement)
            condition = self.visitCondition(ctx.condition())
        return None

    def visitCondition(self, ctx: Pdraw2Parser.ConditionContext):
        left = self.visitExpression(ctx.expression(0))
        right = self.visitExpression(ctx.expression(1))
        operator = ctx.getChild(1).getText()
        if operator == '==':
            return left == right
        elif operator == '!=':
            return left != right
        elif operator == '<':
            return left < right
        elif operator == '<=':
            return left <= right
        elif operator == '>':
            return left > right
        elif operator == '>=':
            return left >= right
