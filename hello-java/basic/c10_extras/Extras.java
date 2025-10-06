package basic.c10_extras;

import basic.c07_oop.*; // imports all classes from package
import basic.c07_oop.Person; // imports specific class

import java.util.Scanner; // for reading user input

public class Extras {

    // Global variables are visible in the entire program.
    static String globalName = "Bramau";

    public static void main(String[] args) {

        // Extras
        // - null: represents an absence of value or an empty reference.
        //   It can only be used with objects, not with primitive data types.
        String myName = "Brayan";
        myName = null;
        if (myName != null) {
            System.out.println(myName);
        }

        // import
        // We can import classes from other packages in two ways:
        // 1. Import specific class: import package.ClassName
        // 2. Import all classes: import package.*
        var myPerson = new Person("Brayan", 25, "123456789");
        var myClasses = new Classes();

        // Scanner
        // Scanner is a class used to get user input from different sources (keyboard, files, etc.)
        // System.in represents the standard input stream (keyboard)
        Scanner scanner = new Scanner(System.in); // Entry point for Scanner is System.in

        System.out.print("Enter your name: ");
        String userInput = scanner.nextLine(); // reads a line of text
        System.out.println("Hello, " + userInput);

        System.out.print("Enter your age: ");
        int age = scanner.nextInt(); // reads an integer
        System.out.println("You are " + age + " years old");

        scanner.close(); // important to close the scanner when done

        // Scope:
        // Local variables are visible only in the block in which they are declared.
        // Global variables are visible in the entire program.
        printGlobalName();

        // Static:
        // Static methods and variables are accessible without creating an object.
        // They belong to the class itself rather than to any specific instance.
        // This is particularly useful for utility classes that only contain functionality
        // or constants that don't require instantiation. For example, a Constants class
        // can define values like PI or EPSILON that can be accessed directly through
        // the class name without creating an instance.

        // Live template:
        // Type 'sout' and press 'tab' to generate a simple System.out.println() statement.'
        System.out.println("Hello, World!");
        // Type 'main' and press 'tab' to generate a main method.
        // Research others live templates.

    }
    public static void printGlobalName() {
        System.out.println(globalName);
    }
}
