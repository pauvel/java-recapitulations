package enums;

public enum PopcornFlavors {
    BBQ("barbeque", 2.43f),
    CHEETOS("Cheese cheetos", 3.12f),
    CARAMEL("candy", 1.40f);

    private final String genericName;
    private final float price;

    PopcornFlavors(String genericName, float price){
        this.genericName = genericName;
        this.price = price;
    }

    public String getGenericName() {
        return genericName;
    }

    public float getPrice() {
        return price;
    }
}
