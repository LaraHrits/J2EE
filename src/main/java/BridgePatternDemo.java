public class BridgePatternDemo {
    public static void main(String[] args) {

        Circle Circle1 = new Circle(2.1, 5.7, 8, new RedPen());
        Circle Circle2 = new Circle( 4.5, 3, 2, new GreenPen());

        Circle1.draw();
        Circle2.draw();
    }
}