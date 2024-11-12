import turtle
import math
import time

turtle.colormode(255)
turtle.Turtle(visible= True)
turtle.speed(0)

# Define the Pen class
class Pen:
    def __init__(self, color='green', position = (0,0), orientation=0, thickness=1, pressure=-1):
        self.color = color
        self.posX = position[0]
        self.posY = position[1]
        self.orientation = math.radians(orientation)
        self.thickness = thickness
        self.pressure = pressure
        self.t = turtle.Turtle()
        self.t.penup()
        self.t.color(color)
        self.t.goto(position)
        self.t.setheading(orientation)
        self.t.pensize(thickness)
        self.original_thickness = thickness
        if pressure >= 0:
            self.t.pendown()

    def forward(self, distance):
        self.t.forward(distance)
        return self

    def backward(self, distance):
        self.t.backward(distance)
        return self

    def left(self, angle):
        self.t.left(angle)
        return self

    def right(self, angle):
        self.t.right(angle)
        return self

    def set_color(self, color):
        self.color = color
        self.t.color(color)

    def set_position(self, position):
        self.posX, self.posY = position
        self.t.penup()
        self.t.goto(position)
        self.t.pendown()

    def set_orientation(self, orientation):
        self.orientation = math.radians(orientation)
        self.t.setheading(orientation)

    def set_thickness(self, thickness):
        self.thickness = thickness
        self.t.pensize(thickness)

    def set_pressure(self, pressure):
        self.pressure = pressure

    def penup(self):
        self.t.penup()
        return self

    def pendown(self):
        self.t.pendown()
        return self

    def __str__(self):
        return f"Pen(color = '{self.color}', position = ({self.posX}, {self.posY}), orientation = {self.orientation}, thickness = {self.thickness}, pressure = {self.pressure})"

canvas = turtle.Screen()
canvas.title("Canvas 1")
canvas.setup(width = 500, height = 500)
canvas = turtle.Screen()
canvas.title("Canvas 2")
canvas.setup(width = 600, height = 400)
PenType1 = Pen(color = 'green', position = (10, 10), orientation = 45, thickness = 10, pressure = -1)
p1 = PenType1
p1.pendown()
p1.forward(10)
p1.left(90)
p1.forward(10)
p1.left(90)
p1.forward(10)
p1.left(90)
p1.forward(10)
p1.left(90)
PenType2 = Pen(color = 'blue', position = (20, 20), orientation = 0, thickness = 5, pressure = 0)
p2 = PenType2
p2.pendown()
p2.forward(20)
p2.right(90)
p2.forward(20)
p2.right(90)
p2.forward(20)
p2.right(90)
p2.forward(20)
p2.right(90)

turtle.done()
