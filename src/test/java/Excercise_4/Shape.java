package Excercise_4;

public class Shape {
    private String name;

    public Shape(String name) {
        this.name = name;
    }
    public void area() {
        System.out.println("Unknown area");
    }
    public String getRectangleName() {
        return "მართკუთხედი";
    }
    public String getSquareName() {
        return "კვადრატი";
    }
    public String getName() {
        return name;
    }
}
