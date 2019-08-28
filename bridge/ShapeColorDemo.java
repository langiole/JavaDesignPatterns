package bridge;

public class ShapeColorDemo {
    public static void main(String[] args) {
        Shape redCircle  = new Circle(new Red(), 2, 3, 5);
        Shape blueCircle  = new Circle(new Blue(), 5.5, 6.3, 20);

        Shape redRectangle = new Rectangle(new Red(), 0, 0, 5, 7);
        Shape blueRectangle  = new Rectangle(new Blue(), 20, 13, 150, 242.7);

        redCircle.draw();
        blueCircle.draw();

        redRectangle.draw();
        blueRectangle.draw();
    }
}
