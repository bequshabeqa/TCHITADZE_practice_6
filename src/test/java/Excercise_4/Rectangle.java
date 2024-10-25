package Excercise_4;

public class Rectangle extends Shape {
    private int length;
    private int width;

    public Rectangle(int length, int width) {
        super("მართკუთხედი");
        this.length = length;
        this.width = width;
    }
    public Rectangle(int side) {
        this(side, side);
    }
    public void area() {
        int area = length * width;
        System.out.println("მართკუთხედის ფართობი: " + area);
    }
    public int getLength() {
        return length;
    }
    public int getWidth() {
        return width;
    }
}