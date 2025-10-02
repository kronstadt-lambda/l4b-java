package basic.c07_oop;

/**
 * Abstraction is a fundamental OOP concept that hides complex implementation details
 * and shows only the necessary features of an object. It allows you to:
 * - Focus on what an object does instead of how it does it
 * - Reduce complexity by hiding unnecessary details
 * - Make code more maintainable and reusable
 *
 * In Java, abstraction can be achieved through:
 * 1. Abstract classes (partial abstraction)
 * 2. Interfaces (100% abstraction)
 */

public class Abstraction {
    public static void main(String[] args) {

        // Abstraction 
        // Note: Abstract classes provide a way to share code among several related classes.
        // - Abstract classes
        // WARNING: Abstract classes cannot be instantiated directly.
        // They can only be used as base classes for inheritance.
        var myDog = new Dog();
        myDog.sleep();
        myDog.sound();
        var myCat = new Cat();
        myCat.sleep();
        myCat.sound();

        // - Interfaces
        // Note: Interfaces don't need 'static' keyword, cannot be instantiated directly,
        // and a class can implement multiple interfaces at once.
        var myBird = new Bird();
        myBird.sleep();
        myBird.sound();
        myBird.fly();
        var myBat = new Bat();
        myBat.sleep();
        myBat.sound();
        myBat.fly();
        myBat.fly2();

    }
    public static abstract class Animal {
        public abstract void sound();

        public void sleep() {
            System.out.println("Animal sleeping");
        }
    }
    public static class Dog extends Animal {
        @Override
        public void sound() {
            System.out.println("Woof");
        }

        @Override
        public void sleep() {
            System.out.println("Dog sleeping");
        }
    }
    public static class Cat extends Animal {
        @Override
        public void sound() {
            System.out.println("Meow");
        }

        @Override
        public void sleep() {
            System.out.println("Cat sleeping");
        }
    }

    public static class Bird extends Animal implements Flying {
        @Override
        public void sound() {
            System.out.println("Chirp");
        }

        @Override
        public void sleep() {
            System.out.println("Bird sleeping");
        }

        @Override
        public void fly() {
            System.out.println("Bird flying");
        }

    }

    public static class Bat extends Animal implements Flying, Flying2 {
        @Override
        public void sound() {
            System.out.println("Crunch");
        }

        @Override
        public void sleep() {
            System.out.println("Bat sleeping");
        }

        @Override
        public void fly() {
            System.out.println("Bat flying");
        }

        @Override
        public void fly2() {
            System.out.println("Bat flying 2");
        }
    }

    //
    public interface Flying {
        void fly();
    }
    public interface Flying2 {
        void fly2();
    }
}
