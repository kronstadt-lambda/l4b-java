package basic.c07_oop;

/**
 1. Crea una clase Animal con el método makeSound(). Luego
 crea subclases Dog, Cat y Cow que sobrescriban ese método
 con sonidos diferentes. Llama al método desde una lista de
 Animal.
 2. Crea una clase Shape con el método calculateArea(). Luego
 implementa subclases Circle y Rectangle con sus propias
 fórmulas. Usa una lista de Shape para recorrer e imprimir
 el área de varias figuras.
 3. Crea una clase Printer con varios métodos print()
 sobrecargados que acepten diferentes tipos de parámetros
 (String, int, double). Llama a cada uno desde main.
 4. Crea una clase Greeter con dos métodos greet(): uno que
 salude con “Hello”, y otro que reciba un nombre y salude
 con “Hello, [nombre]”.
 5. Crea una clase Vehicle con un método start(). Luego crea
 Car, Bike y Truck que sobrescriban ese método. Recorre una
 lista ArrayList<Vehicle> para llamar a start() en cada
 uno.
 6. Crea una clase Notification con método send(), y subclases
 EmailNotification, SMSNotification. Luego crea una función
 sendNotification(Notification n) que reciba cualquier tipo
 y lo ejecute.
 7. Crea una función showAnimalType(Animal animal) que imprima
 el tipo de animal. Pasa diferentes subclases (Dog, Cat,
 Horse) para que cada una imprima su tipo con su propio
 getType() sobrescrito.
 8. Crea una clase Converter con métodos convert(int),
 convert(double), y convert(String) que devuelvan
 diferentes formatos de texto.
 9. Crea una clase Product con el método getPrice(). Luego,
 Book y Electronic deben sobrescribirlo con su propia
 lógica de descuento. Recorre una lista de Product e
 imprime el precio final de cada uno.
 10.
 Crea una clase Character con método attack(). Luego
 crea subclases Warrior, Archer, Mage con ataques
 diferentes. En main, crea un array de Character y llama a
 attack() para cada uno.
 */

import java.util.ArrayList;

public class PolymorphismExercises {
    public static void main(String[] args) {
        // Exercises 1:
        System.out.println("Exercise 1:");
        var myAnimalList = new ArrayList<Animal>();
        myAnimalList.add(new Dog());
        myAnimalList.add(new Cat());
        myAnimalList.add(new Cow());
        for (Animal animal: myAnimalList) {
            animal.makeSound();
        }

        // Exercises 2:
        System.out.println("Exercise 2:");
        var myShapeList = new ArrayList<Shape>();
        myShapeList.add(new Circle(10.0));
        myShapeList.add(new Rectangle(10.0, 20.0));
        for (Shape shape: myShapeList) {
            shape.calculateArea();
        }

        // Exercises 3:
        System.out.println("Exercise 3:");
        var myPrinter = new Printer();
        myPrinter.print("Hello");
        myPrinter.print(10);
        myPrinter.print(10.5);
        myPrinter.print(true);

        // Exercises 4:
        System.out.println("Exercise 4:");
        var myGreeter = new Greeter();
        myGreeter.greet();
        myGreeter.greet("Juan");

        // Exercises 5:
        System.out.println("Exercise 5:");
        var myVehicleList = new ArrayList<Vehicle>();
        myVehicleList.add(new Car());
        myVehicleList.add(new Bike());
        myVehicleList.add(new Truck());
        for (Vehicle vehicle: myVehicleList) {
            vehicle.start();
        }

        // Exercises 6:
        System.out.println("Exercise 6:");
        var myEmailNotification = new EmailNotification("ana@gmail.com", "Hello, you have a new message");
        var mySMSNotification = new SMSNotification("123456789", "Hello, check your number code");

        sendNotification(myEmailNotification);
        sendNotification(mySMSNotification);

        // Exercise 7:
        System.out.println("Exercise 7:");
        var myDog = new Dog();
        var myCat = new Cat();
        var myCow = new Cow();

        showAnimalType(myDog);
        showAnimalType(myCat);
        showAnimalType(myCow);

        // Exercise 8:
        System.out.println("Exercise 8:");
        var myConvert = new Converter();
        System.out.println(myConvert.convert("Hello"));
        System.out.println(myConvert.convert(5));
        System.out.println(myConvert.convert(10.5));

        // Exercise 9:
        System.out.println("Exercise 9:");
        var myProductList = new ArrayList<Product>();
        myProductList.add(new Book(10.0, 0.05));
        myProductList.add(new Electronic(10.0, 0.25));
        for (Product product: myProductList) {
            System.out.println("Price of " + product.getClass().getSimpleName() + ": " + product.getPrice());
        }

        // Exercise 10:
        System.out.println("Exercise 10:");
        var myCharacterList = new ArrayList<Character>();
        myCharacterList.add(new Warrior());
        myCharacterList.add(new Archer());
        myCharacterList.add(new Mage());

        for (Character character: myCharacterList) {
            character.attack();
        }

    }
    //
    public static class Animal {
        public void makeSound() {
            System.out.println("Animal sound");
        }
        public void gettype() {
            System.out.println("Animal type");
        }
    }
    public static class Dog extends Animal {
        @Override
        public void makeSound() {
            System.out.println("Woof");
        }
        @Override
        public void gettype() {
            System.out.println("The type of animal is a Dog");
        }
    }
    public static class Cat extends Animal {
        @Override
        public void makeSound() {
            System.out.println("Meow");
        }
        @Override
        public void gettype() {
            System.out.println("The type of animal is a Cat");
        }
    }
    public static class Cow extends Animal {
        @Override
        public void makeSound() {
            System.out.println("Muu");
        }
        @Override
        public void gettype() {
            System.out.println("The type of animal is a Cow");
        }
    }
    public static void showAnimalType(Animal animal) {
        animal.gettype();
    }

    //
    public static class Shape {
        public void calculateArea() {
            System.out.println("Calculate area");
        }
    }
    public static class Circle extends Shape{
        private Double radius;

        public Circle(Double radius) {
            this.radius = radius;
        }

        @Override
        public void calculateArea() {
            System.out.println("Area of circle: " + Math.PI * radius * radius);
        }
    }
    public static class Rectangle extends Shape {
        private Double width;
        private Double height;

        public Rectangle(Double width, Double height) {
            this.width = width;
            this.height = height;
        }

        @Override
        public void calculateArea() {
            System.out.println("Area of rectangle: " + width * height);
        }
    }

    //
    public static class Printer {
        public void print(String text) {
            System.out.println(text);
        }
        public void print(int number) {
            System.out.println(number);
        }
        public void print(double number) {
            System.out.println(number);
        }
        public void print(boolean bool) {
            System.out.println(bool);
        }
    }

    //
    public static class Greeter {
        public void greet() {
            System.out.println("Hello");
        }
        public void greet(String name) {
            System.out.println("Hello " + name);
        }
    }

    //
    public static class Vehicle {
        public void start() {
            System.out.println("Vehicle started");
        }
    }
    public static class Car extends Vehicle {
        @Override
        public void start() {
            System.out.println("Car started");
        }
    }
    public static class Bike extends Vehicle {
        @Override
        public void start() {
            System.out.println("Bike started");
        }
    }
    public static class Truck extends Vehicle {
        @Override
        public void start() {
            System.out.println("Truck started");
        }
    }

    //
    public static class Notification {
        public String destination;
        public String message;

        public Notification(String destination, String message) {
            this.destination = destination;
            this.message = message;
        }

        public void send() {
            System.out.println("Notification sent");
        }
    }
    public static class EmailNotification extends Notification {

        public EmailNotification(String destination, String message) {
            super(destination, message);
        }

        @Override
        public void send() {
            System.out.println("Email sent to" + destination + " : " + message);
        }
    }
    public static class SMSNotification extends Notification {

        public SMSNotification(String destination, String message) {
            super(destination, message);
        }

        @Override
        public void send() {
            System.out.println("SMS sent to" + destination + " : " + message);
        }
    }
    public static void sendNotification(Notification n) {
        n.send();
    }

    //
    public static class Converter {
        public static int convert(int value) {
            return value * 2;
        }
        public static double convert(double value) {
            return value * 1.8 + 32;
        }
        public static String convert(String value) {
            return value.toUpperCase();
        }
    }

    //
    public static class Product {
        protected Double price;

        public Product(Double price) {
            this.price = price;
        }

        public Double getPrice() {
            return 0.0;
        }
    }
    public static class Book extends Product {
        private Double discount;
        public Book(Double price, Double discount) {
            super(price);
            this.discount = discount;
        }
        @Override
        public Double getPrice() {
            return price * (1 - discount);
        }
    }
    public static class Electronic extends Product {
        private Double discount;
        public Electronic(Double price, Double discount) {
            super(price);
            this.discount = discount;
        }
        @Override
        public Double getPrice() {
            return price * (1 - discount + 0.1);
        }
    }

    //
    public static class Character {
        public void attack() {
            System.out.println("Character attack!!");
        }
    }

    public static class Warrior extends Character {
        @Override
        public void attack() {
            System.out.println("The attack of the warrior is strong");
        }
    }
    public static class Mage extends Character {
        @Override
        public void attack() {
            System.out.println("The attack of the mage is powerful");
        }
    }
    public static class Archer extends Character {
        @Override
        public void attack() {
            System.out.println("The attack of the archer is fast");
        }
    }
}
