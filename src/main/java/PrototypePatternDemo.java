public class PrototypePatternDemo {
    public static void main(String[] args) {
        ShapeCache.loadCache();

        Shape clone_1 = (Shape) ShapeCache.getShape("1");
        System.out.println("Shape 1: " + clone_1.getType());

        Shape clone_2 = (Shape) ShapeCache.getShape("2");
        System.out.println("Shape 2: " + clone_2.getType());

        Shape clone_3 = (Shape) ShapeCache.getShape("3");
        System.out.println("Shape 3: " + clone_3.getType());
    }
}
