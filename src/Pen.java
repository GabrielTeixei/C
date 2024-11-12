public class Pen {
    private boolean isDown;
    private double x, y;
    private double angle;
    private String color;
    private double thickness;
    private double pressure;
    private String label;

    public Pen() {
        this.isDown = false;
        this.x = 0;
        this.y = 0;
        this.angle = 0;
        this.color = "black";
        this.thickness = 1.0;
        this.pressure = 1.0;
        this.label = "";
    }

    public void setPosition(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public void setDown(boolean isDown) {
        this.isDown = isDown;
    }

    public void moveForward(double distance) {
        this.x += distance * Math.cos(Math.toRadians(angle));
        this.y += distance * Math.sin(Math.toRadians(angle));
    }

    public void moveBackward(double distance) {
        this.x -= distance * Math.cos(Math.toRadians(angle));
        this.y -= distance * Math.sin(Math.toRadians(angle));
    }

    public void turnLeft(double degrees) {
        this.angle = (this.angle - degrees) % 360;
    }

    public void turnRight(double degrees) {
        this.angle = (this.angle + degrees) % 360;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setThickness(double thickness) {
        this.thickness = thickness;
    }

    public void setPressure(double pressure) {
        this.pressure = pressure;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    @Override
    public String toString() {
        return "Pen{" +
                "isDown=" + isDown +
                ", x=" + x +
                ", y=" + y +
                ", angle=" + angle +
                ", color='" + color + '\'' +
                ", thickness=" + thickness +
                ", pressure=" + pressure +
                ", label='" + label + '\'' +
                '}';
    }
}
