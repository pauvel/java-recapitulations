package geometric_shapes;

import interfaces.Drawable;

public class Square extends Shape implements Drawable {
    private final float side;

    public Square(float side, String color){
        super(color, "SQUARE");
        this.side = side;
    }


    @Override
    public float area(){
        return side * side;
    }


    @Override
    public void draw() {
        System.out.println("Drawing square");
    }
}
