package Excercise_4;

public class Run {
    public static void main(String[] args) {
        System.out.println("Unknown area");

        Rectangle rectangle = new Rectangle(3, 6);
        System.out.println("მართკუთხედის სახეობა: " + rectangle.getRectangleName());
        rectangle.area();

        Rectangle square = new Rectangle(5);
        System.out.println("მართკუთხედის სახეობა: " + square.getSquareName());
        square.area();
    }
}
