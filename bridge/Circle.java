package bridge;

// refined abstraction
public class Circle extends Shape {
    private double x, y, radius;

    public Circle(DrawAPI drawAPI, double x, double y, double radius) {
        super(drawAPI);
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    public void draw() {
        System.out.print("Draw a ");
        drawAPI.draw();
        System.out.printf(" circle at (%.2f, %.2f) with radius: %.2f\n", x, y, radius);
    }
}
