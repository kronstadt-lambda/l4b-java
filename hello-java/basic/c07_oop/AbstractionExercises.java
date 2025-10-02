package basic.c07_oop;

import java.util.ArrayList;


public class AbstractionExercises {
    public static void main(String[] args) {

        // Exercise 1:
        System.out.println("Exercise 1:");
        var myCircle = new Circle("Circle", 10.0);
        System.out.println("The area of the circle is: " + myCircle.calculateArea());
        var myRectangle = new Rectangle("Rectangle", 10.0, 20.0);
        System.out.println("The area of the rectangle is: " + myRectangle.calculateArea());

        // Exercise 2:
        System.out.println("Exercise 2:");
        var myGuitar = new Guitar();
        myGuitar.play();
        var myPiano = new Piano();
        myPiano.play();

        // Exercise 3:
        System.out.println("Exercise 3:");
        var myArrayList = new ArrayList<Animal>();
        myArrayList.add(new Dog());
        myArrayList.add(new Cat());
        for (Animal animal : myArrayList) {
            animal.makeSound();
        }

        // Exercise 4:
        System.out.println("Exercise 4:");
        var myDrawableList = new ArrayList<Drawable>();
        myDrawableList.add(new CircleDrawable());
        myDrawableList.add(new SquareDrawable());
        myDrawableList.add(new TriangleDrawable());
        for (Drawable drawable : myDrawableList) {
            drawable.draw();
        }

        // Exercise 5:
        System.out.println("Exercise 5:");
        var myFullTimeEmployee = new FullTimeEmployee();
        var myPartTimeEmployee = new PartTimeEmployee();
        calculateSalary(myFullTimeEmployee);
        calculateSalary(myPartTimeEmployee);

        // Exercise 6:
        System.out.println("Exercise 6:");
        var myRobot = new Robot();
        var myCar = new Car();
        move(myRobot);
        move(myCar);

        // Exercise 7:
        System.out.println("Exercise 7:");
        var myTV = new TV();
        var myWashingMachine = new WashingMachine();
        functionalityTV(myTV);
        functionalityWashingMachine(myWashingMachine);

        // Exercise 8:
        System.out.println("Exercise 8:");
        var myDuck = new Duck();
        myDuck.fly();
        myDuck.swim();

        // Exercise 9:
        System.out.println("Exercise 9:");
        var myDocumentList = new ArrayList<Document>();
        myDocumentList.add(new PDFDocument());
        myDocumentList.add(new WordDocument());
        for (Document document : myDocumentList) {
            printDocument(document);
        }

        // Exercise 10:
        System.out.println("Exercise 10:");
        var myInvoice = new Invoice();
        var myEmployeePayment = new EmployeePayment();
        pay(myInvoice);
        pay(myEmployeePayment);

    }
    //
    public static abstract class Shape {
        protected final String name;
        public Shape(String name) {
            this.name = name;
        }
        public abstract double calculateArea();
    }
    public static class Circle extends Shape {
        private Double radius;
        public Circle(String name, Double radius) {
            super(name);
            this.radius = radius;
        }
        @Override
        public double calculateArea() {
            return Math.PI * radius * radius;
        }
    }
    public static class Rectangle extends Shape {
        private Double weight;
        private Double height;
        public Rectangle(String name, Double weight, Double height) {
            super(name);
            this.weight = weight;
            this.height = height;
        }
        @Override
        public double calculateArea() {
            return weight * height;
        }
    }

    //
    public interface Playable {
        void play();
    }
    public static class Guitar implements Playable {
        @Override
        public void play() {
            System.out.println("Guitar playing");
        }
    }
    public static class Piano implements Playable {
        @Override
        public void play() {
            System.out.println("Piano playing");
        }
    }

    //
    public static abstract class Animal {
        public abstract void makeSound();
    }
    public static class Dog extends Animal {
        @Override
        public void makeSound() {
            System.out.println("Woof");
        }
    }
    public static class Cat extends Animal {
        @Override
        public void makeSound() {
            System.out.println("Meow");
        }
    }

    //
    public interface Drawable {
        void draw();
    }
    public static class CircleDrawable implements Drawable {
        @Override
        public void draw() {
            System.out.println("Drawing a circle with radius");
        }
    }
    public static class SquareDrawable implements Drawable {
        @Override
        public void draw() {
            System.out.println("Drawing a square with four sides");
        }
    }
    public static class TriangleDrawable implements Drawable {
        @Override
        public void draw() {
            System.out.println("Drawing a triangle with three sides");
        }
    }

    //
    public static abstract class Employee {
        public abstract void calculateSalary();
    }
    public static class FullTimeEmployee extends Employee {
        @Override
        public void calculateSalary() {
            System.out.println("Full time employee calculating salary");
        }
    }
    public static class PartTimeEmployee extends Employee {
        @Override
        public void calculateSalary() {
            System.out.println("Part time employee calculating salary");
        }
    }
    public static void calculateSalary(Employee employee) {
        employee.calculateSalary();
    }

    //
    public interface Movable {
        void move();
    }
    public static class Robot implements Movable {
        @Override
        public void move() {
            System.out.println("Robot moving");
        }
    }
    public static class Car implements Movable {
        @Override
        public void move() {
            System.out.println("Car moving");
        }
    }
    public static void move(Movable movable) {
        movable.move();
    }

    //
    public static abstract class Appliance {
        public abstract void turnOn ();
        public abstract void turnOff ();
    }
    public static class TV extends Appliance {
        @Override
        public void turnOn() {
            System.out.println("TV turned on");
        }

        @Override
        public void turnOff() {
            System.out.println("TV turned off");
        }
    }
    public static class WashingMachine extends Appliance{
        @Override
        public void turnOn() {
            System.out.println("Washing machine turned on");
        }
        @Override
        public void turnOff() {
            System.out.println("Washing machine turned off");
        }
    }
    public static void functionalityTV(Appliance appliance) {
        appliance.turnOn();
        System.out.println("TV is now running");
        appliance.turnOff();
    }
    public static void functionalityWashingMachine(Appliance appliance) {
        appliance.turnOn();
        System.out.println("Washing machine is now running");
        appliance.turnOff();
    }

    //
    public interface Flyable {
        void fly();
    }
    public interface Swimmable {
        void swim();
    }
    public static class Duck implements Flyable, Swimmable {
        @Override
        public void fly() {
            System.out.println("Duck flying");
        }
        @Override
        public void swim() {
            System.out.println("Duck swimming");
        }
    }

    //
    public static abstract class Document {
        public abstract void print();
    }
    public static class PDFDocument extends Document {
        @Override
        public void print() {
            System.out.println("PDF document printing");
        }
    }
    public static class WordDocument extends Document {
        @Override
        public void print() {
            System.out.println("Word document printing");
        }
    }
    public static void printDocument(Document document) {
        document.print();
    }

    //
    public interface Payable {
        void pay();
    }
    public static class Invoice implements Payable {
        @Override
        public void pay() {
            System.out.println("Invoice paying");
        }
    }
    public static class EmployeePayment implements Payable {
        @Override
        public void pay() {
            System.out.println("EmployeePayment paying");
        }
    }
    public static void pay(Payable payable) {
        payable.pay();
    }

}
