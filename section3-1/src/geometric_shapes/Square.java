package geometric_shapes;

public class Square extends Shape{
    private final float side;

    public Square(float side, String color){
        super(color, "SQUARE");
        this.side = side;
    }


    @Override
    public float area(){
        return side * side;
    }



}
