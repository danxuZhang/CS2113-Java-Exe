import java.util.ArrayList;

public class Main {
    //TODO add your methods here
    static ArrayList<Shape> arr = new ArrayList<>();
    private static void addShape(Shape shape) {
        arr.add(shape);
    }
    private static void printAreas() {
        for (Shape shape : arr) {
            System.out.println(shape.area());
        }
    }

    public static void main(String[] args) {
        addShape(new Circle(5));
        addShape(new Rectangle(3, 4));
        addShape(new Circle(10));
        printAreas();
        addShape(new Rectangle(4, 4));
        printAreas();
    }
}

