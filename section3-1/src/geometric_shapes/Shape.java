package geometric_shapes;

public abstract class Shape {
    private final String TYPE;
    private String color;

    Shape(String color, String type) {
        this.color = color;
        this.TYPE = type;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public String getTYPE() {
        return this.TYPE;
    };

    public abstract float area();

}
