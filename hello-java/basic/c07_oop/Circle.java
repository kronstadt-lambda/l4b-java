package basic.c07_oop;

public class Circle extends Shape {
    // Attributes
    private double radius;

    // Constructor
    public Circle(String name,double radius) {
        super(name);
        this.setRadius(radius);
    }

    // Methods
    public double area() {
        return Math.PI * radius * radius;
    }
    public double perimeter() {
        return 2 * Math.PI * radius;
    }
    @Override
    public void calculateArea() {
        System.out.println("Area of " + name + " is " + area());
    }

    // Setters and getters
    public void setRadius(double radius) {
        if (radius < 0) {
            System.out.println("Invalid radius");
            return;
        }
        this.radius = radius;
    }
    public double getRadius() {
        return radius;
    }

}
