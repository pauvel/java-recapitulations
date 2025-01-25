package geometric_shapes;

import interfaces.Drawable;

public class Circle extends Shape implements Drawable {
    private final float radius;

    public Circle(String color, float radius) {
        super(color, "CIRCLE");
        this.radius = radius;
    }

    @Override
    public float area(){
        return (float) (Math.PI * Math.pow(this.radius, 2));
    }

    @Override
    public void draw() {
        System.out.println("We're drawing a circle");
    }
}
