import geometric_shapes.Shape;
import geometric_shapes.Square;
import geometric_shapes.Circle;


public class TestShapes {

    void calculate(Shape shape) {
        System.out.println(shape.getTYPE() + " = " + shape.area());
    }

    public static void main(String[] args) {
        TestShapes test = new TestShapes();
        Square square = new Square(23.21f, "black");
        Circle circle = new Circle("red", 99.45f);

        test.calculate(square);
        test.calculate(circle);
    }
}
