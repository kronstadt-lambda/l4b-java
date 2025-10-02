package basic.c07_oop;

public class Composition {
    public static void main(String[] args) {

        // Composition: represents a "has-a" relationship where a class contains another class as a component
        // Unlike inheritance which represents an "is-a" relationship, composition is more appropriate here
        // since a Car has an Engine, rather than a Car is an Engine

        var myCar = new Car();
        myCar.on();

    }

    public static class Engine {
        public void on() {
            System.out.println("Engine is on");
        }
    }

    public static class Car {
        final private Engine engine = new Engine();

        public void on() {
            engine.on();
        }
    }
}
