package basic.c07_oop;

/**
 * A class in Java is a blueprint or template that defines:
 * - The data structure (attributes/properties)
 * - The behavior (methods)
 * of a specific type of object.
 * <p>
 * Classes are the fundamental building blocks of Object-Oriented Programming (OOP),
 * allowing to create objects that are instances of the class.
 * <p>
 * Example: A Car class might have:
 * - Attributes: brand, model, color
 * - Methods: start(), brake(), accelerate()
 */

public class Classes {
    public static void main(String[] args) {
        // Instancing class (Person)
        var aPerson = new Person("Brayan", 25, "12445A");

        aPerson.sayHello();

//        aPerson.name = "Mauro"; // you cant access
//        System.out.println(aPerson.name); // you cant access

        var otherPerson = new Person("Jane", 35, "12345B");
        otherPerson.sayHello();
    }
}
