import geometric_shapes.Shape;
import geometric_shapes.Square;
import geometric_shapes.Circle;
import interfaces.Drawable;
import others.Image;


public class TestShapes {

    void calculate(Shape shape) {
        System.out.println(shape.getTYPE() + " = " + shape.area());
    }

    void testDrawable(Drawable drawable) {
        drawable.draw();
    }

    public static void main(String[] args) {
        TestShapes test = new TestShapes();
        Square square = new Square(23.21f, "black");
        Circle circle = new Circle("red", 99.45f);
        Image img = new Image();

        test.calculate(square);
        test.calculate(circle);

        square.draw();
        circle.draw();

        test.testDrawable(square);
        test.testDrawable(circle);
        test.testDrawable(img);


    }
}
