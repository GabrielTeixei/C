from antlr4 import *
from Pdraw2Parser import Pdraw2Parser
from Pdraw2Listener import Pdraw2Listener

class pdrawInterpreter(Pdraw2Listener):
    def __init__(self):
        self.pen = Pen()

    def enterProgram(self, ctx:Pdraw2Parser.ProgramContext):
        print("""
                          ██▄
                  ██       ██       ██
                 ████      ██      ████
                 █████     ██     █████
                 ██████████████████████
                 ██████████████████████
                 ███▒▒▒▒▒▒████▒▒▒▒▒▒███
                 ███▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒███
                 ███▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒███
                 █████████▒▒▒▒█████████
                  ████████████████████
                  UNIVERSITY OF AVEIRO:
Departamento de Eletrónica, Telecomunicações e Informática
              Compiladores - 2023/2024
           Starting program ...
        """)

    def exitProgram(self, ctx:Pdraw2Parser.ProgramContext):
        print("Program finished...")
        print(self.pen)

    def enterPosition_command(self, ctx:Pdraw2Parser.Position_commandContext):
        x = float(ctx.number(0).getText())
        y = float(ctx.number(1).getText())
        self.pen.setPosition(x, y)

    def enterPen_control(self, ctx:Pdraw2Parser.Pen_controlContext):
        if ctx.getText() == "down":
            self.pen.setDown(True)
        elif ctx.getText() == "up":
            self.pen.setDown(False)

    def enterMove_command(self, ctx:Pdraw2Parser.Move_commandContext):
        distance = float(ctx.distance().number().getText())
        if ctx.getText().startswith("forward"):
            self.pen.moveForward(distance)
        elif ctx.getText().startswith("backward"):
            self.pen.moveBackward(distance)

    def enterTurn_command(self, ctx:Pdraw2Parser.Turn_commandContext):
        angle = float(ctx.angle().number().getText().replace("º", ""))
        if ctx.getText().startswith("left"):
            self.pen.turnLeft(angle)
        elif ctx.getText().startswith("right"):
            self.pen.turnRight(angle)

    def enterPen_attribute(self, ctx:Pdraw2Parser.Pen_attributeContext):
        attribute = ctx.getChild(0).getText()
        value = ctx.getChild(2).getText()
        if attribute == "color":
            self.pen.setColor(value)
        elif attribute == "position":
            x = float(ctx.number(0).getText())
            y = float(ctx.number(1).getText())
            self.pen.setPosition(x, y)
        elif attribute == "orientation":
            orientation = float(value.replace("º", ""))
            self.pen.turnRight(orientation)
        elif attribute == "thickness":
            thickness = float(value)
            self.pen.setThickness(thickness)
        elif attribute == "pressure":
            pressure = float(value)
            self.pen.setPressure(pressure)
        elif attribute == "label":
            label = value.replace("\"", "")
            self.pen.setLabel(label)
