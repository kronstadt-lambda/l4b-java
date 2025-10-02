package basic.c07_oop;

public class Rectangle extends Shape {

    // Attributes
    private double width;
    private double height;

    // Constructor
    public Rectangle(String name,double width, double height) {
        super(name);
        this.setWidth(width);
        this.setHeight(height);
    }

    // Methods
    public double area() {
        return width * height;
    }
    public double perimeter() {
        return 2 * (width + height);
    }
    public void getAreaAndPerimeter() {
        System.out.println("Area: " + area());
        System.out.println("Perimeter: " + perimeter());
    }
    @Override
    public void calculateArea() {
        System.out.println("Area of " + name + " is " + area());
    }

    // setters and getters
    public double getWidth() {
        return width;
    }
    public void setWidth(double width) {
        if (width < 0) {
            System.out.println("Invalid width");
            return;
        }
        this.width = width;
    }
    public double getHeight() {
        return height;
    }
    public void setHeight(double height) {
        if (height < 0) {
            System.out.println("Invalid height");
            return;
        }
        this.height = height;
    }
}
