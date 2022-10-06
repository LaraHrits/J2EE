import java.util.HashMap;

public class ShapeCache {
    private static final HashMap<String, Shape> shapes = new HashMap<String, Shape>();

    public static Shape getShape(String id) {
        Shape cachedShape = shapes.get(id);

        return (Shape) cachedShape.clone();
    }

    public static void loadCache() {
        Square square = new Square();
        square.setId("1");
        shapes.put(square.getId(), square);

        Circle circle = new Circle();
        circle.setId("2");
        shapes.put(circle.getId(), circle);

        Rectangle rectangle = new Rectangle();
        rectangle.setId("3");
        shapes.put(rectangle.getId(), rectangle);


    }
}