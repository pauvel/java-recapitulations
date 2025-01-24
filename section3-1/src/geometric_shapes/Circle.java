package geometric_shapes;

public class Circle extends Shape {
    private final float radius;

    public Circle(String color, float radius) {
        super(color, "CIRCLE");
        this.radius = radius;
    }

    @Override
    public float area(){
        return (float) (Math.PI * Math.pow(this.radius, 2));
    }

}
