package basic.c07_oop;

/*
 * Polymorphism is one of the core concepts of Object-Oriented Programming (OOP).
 * It allows objects of different classes to be treated as objects of a common base class.
 * There are two types of polymorphism:
 * 1. Compile-time (Method Overloading): Same method name but different parameters
 * 2. Runtime (Method Overriding): Subclass provides specific implementation of method defined in parent class
 */
public class Polymorphism {
    public static void main(String[] args) {
        // Polymorphic behavior - treating specific types as their general type
        // - Polymorphism by inheritance (overriding)
        var myAnimal = new Animal();
        myAnimal.sound();
        var myDog = new Dog();
        myDog.sound();

        // Polymorphism by method overriding (overloading), parameters are different.
        var myCalculator = new Calculator();
        System.out.println(myCalculator.sum(1, 2));
        System.out.println(myCalculator.sum(1.0, 2.0));
        System.out.println(myCalculator.sum(1, 2, 5));

    }

    public static class Animal {
        public void sound() {
            System.out.println("Animal sound");
        }
    }

    public static class Dog extends Animal {
        @Override
        public void sound() {
            System.out.println("Woof");
        }
    }

    //
    public static class Calculator {
       public int sum(int a, int b) {
           return a + b;
       }
        public int sum(int a, int b, int c) {
            return a + b + c;
        }
       public double sum(double a, double b) {
           return a + b;
       }
    }
}
