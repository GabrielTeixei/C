import turtle

class Pen:
    def __init__(self):
        self.turtle = turtle.Turtle()
        self.screen = turtle.Screen()
        self.screen.title("Pdraw2 Interpreter")
        self.setColor("Black")
        self.setThickness(1)
        self.setPressure(1)
        self.setLabel("default")
        self.setDown(False)

    def setPosition(self, x, y):
        self.turtle.penup()
        self.turtle.goto(x, y)
        if self.down:
            self.turtle.pendown()

    def setDown(self, down):
        self.down = down
        if down:
            self.turtle.pendown()
        else:
            self.turtle.penup()

    def moveForward(self, distance):
        self.turtle.forward(distance)

    def moveBackward(self, distance):
        self.turtle.backward(distance)

    def turnLeft(self, angle):
        self.turtle.left(angle)

    def turnRight(self, angle):
        self.turtle.right(angle)

    def setColor(self, color):
        self.color = color
        self.turtle.pencolor(color)

    def setThickness(self, thickness):
        self.thickness = thickness
        self.turtle.pensize(thickness)

    def setPressure(self, pressure):
        self.pressure = pressure

    def setLabel(self, label):
        self.label = label
