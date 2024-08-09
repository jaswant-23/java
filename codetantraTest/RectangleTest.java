package codetantraTest;
interface Resizable {
    void resizeWidth(int width);
    void resizeHeight(int height);
}

class Rectangle implements Resizable {
    private int width;
    private int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public void resizeWidth(int width) {
        this.width = width;
    }

    @Override
    public void resizeHeight(int height) {
        this.height = height;
    }

    public void displayDimensions() {
        System.out.println("Width: " + width + ", Height: " + height);
    }
}

public class RectangleTest {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(10, 20);
        System.out.println("Original Dimensions:");
        rectangle.displayDimensions();

        rectangle.resizeWidth(15);
        rectangle.resizeHeight(25);
        System.out.println("\nResized Dimensions:");
        rectangle.displayDimensions();
    }
}