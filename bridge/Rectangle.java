package bridge;

public class Rectangle extends Shape {
    private double x, y, height, width;

    public Rectangle(DrawAPI drawAPI, double x, double y, double height, double width) {
        super(drawAPI);
        this.x = x;
        this.y = y;
        this.height = height;
        this.width = width;
    }

    public void draw() {
        System.out.print("Draw a ");
        drawAPI.draw();
        System.out.printf(" rectangle at (%.2f, %.2f) with height: %.2f and width: %.2f\n", x, y, height, width);
    }
}