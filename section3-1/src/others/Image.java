package others;

import interfaces.Drawable;

public class Image implements Drawable {

    @Override
    public void draw() {
        System.out.println("We're drawing a image");
    }
}
