package basic.c07_oop;
/**
 * INHERITANCE IN OBJECT-ORIENTED PROGRAMMING:
 * Inheritance is a mechanism that allows a class to inherit attributes and methods
 * from another class. The class that inherits is called subclass (or derived class),
 * and the class being inherited from is called superclass (or base class).
 * <p>
 * Key concepts:
 * - Superclass: The parent class that shares its features
 * - Subclass: The child class that inherits features
 * - 'extends' keyword: Used to implement inheritance in Java
 * - Method overriding: Subclass can provide specific implementation of methods
 * <p>
 * INHERITANCE BEST PRACTICES:
 * 1. Use inheritance for "is-a" relationships only
 * 2. Favor composition over inheritance when possible
 * 3. Keep inheritance hierarchies shallow (avoid deep nesting)
 * 4. Follow Liskov Substitution Principle (LSP)
 * 5. Don't override methods that change the expected behavior
 * 6. Use @Override annotation when overriding methods
 * 7. Make the superclass methods that are meant to be overridden abstract
 * 8. Document the inheritance design and purpose
 * 9. Avoid protected fields, use protected methods instead
 * 10. Consider making classes final if they're not designed for inheritance
 */

public class Inheritance {
    public static void main(String[] args) {
        var myAnimal = new Animal("Dodo");
        myAnimal.makeSound();
        myAnimal.eat();

        var myDog = new Dog("Bella", 2, "Labrador Retriever");
        myDog.makeSound();
        myDog.eat();

        var myBird = new Bird("Tweety");
        myBird.makeSound();
        myBird.eat();
        myBird.fly();

    }


    public static class Animal {

        // Atributes
        protected final String name;

        // Constructor
        public Animal(String name) {
            this.name = name;
        }
        public void makeSound() {
            System.out.println("My animal " + name + " make a sound");
        }
        public void eat() {
            System.out.println("My animal " + name + " is eating");
        }

    }
    public static class Dog extends Animal {

        private Integer age;
        private String breed;
        // Constructor
        // Note: @Override annotation cannot be used with constructors as they are not inherited
        // and therefore cannot be overridden. Only instance methods can be marked with @Override.
        public Dog(String name, int age, String breed) {
            super(name);
            this.age = age;
            this.breed = breed;
        }

        /**
         * @Override annotation is useful in inheritance cases because:
         * 1. Helps catch errors: Ensures we're actually overriding a superclass method
         * 2. Improves code readability: Clearly indicates the method is overridden
         * 3. Prevents mistakes: Compiler error if method signature doesn't match
         * 4. Documentation: Makes inheritance relationships more explicit
         * 5. Better maintainability: Helps other developers understand the code
         */
        @Override
        public void makeSound() {
            System.out.println("My dog " + name + " make a sound - woof");
        }
        @Override
        public void eat() {
            System.out.println("My dog " + name + " is eating - bark");
        }

    }

    public static class Bird extends Animal {

        // Constructor
        public Bird(String name) {
            super(name);
        }

        // Methods
        public void fly() {
            System.out.println("My bird " + name + " is fly!!");
        }
    }
}

