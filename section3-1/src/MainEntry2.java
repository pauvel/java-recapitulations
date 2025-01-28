import enums.PopcornFlavors;

public class MainEntry2 {
    public static void main(String[] args) {
        MainEntry mainEntry = new MainEntry();
        mainEntry.executeFooProtected();
        PopcornFlavors caramel = PopcornFlavors.CARAMEL;

        System.out.println(caramel.name());
        System.out.println(caramel.getGenericName());
        System.out.println(caramel.getPrice());

    }
}
