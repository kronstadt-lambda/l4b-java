package basic.c07_oop;

public class Shape {
    protected String name;

    // Constructor
    public Shape(String name) {
        this.name = name;
    }

    // Methods
    public void calculateArea() {
        System.out.println("Area of " + name + " is not defined");
    }
}
