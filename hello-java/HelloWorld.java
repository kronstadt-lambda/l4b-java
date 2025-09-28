/*
 * Topic 1: Hello World in Java
 * DISCLAIMER:
 * In Java, there's an important distinction between declaration and instantiation:
 *
 * Declaration: Defines a reference variable of a specific type
 * Example: String name; // Just declares a variable, no object created yet
 *
 * Instantiation: Creates an actual object in memory using 'new' keyword
 * Example: String name = new String("John"); // Creates a String object
 */

// 'public' - Access modifier that makes this class accessible from anywhere
// 'class' - Keyword to declare a class, which is a blueprint for objects
// 'HelloWorld' - Name of the class
public class HelloWorld {
    // The combination of 'public static void main' is the standard entry point signature:
    // 'public' - Access modifier allowing this method to be called from outside
    // 'static' - Keyword that makes this method belong to the class, not instances
    // 'void' - Return type indicating this method doesn't return any value
    // 'main' - Special method name that serves as entry point of the program
    // This signature allows JVM to invoke the method without creating class instances
    // 'String[] args' - Parameter to receive command line arguments as string array
    public static void main(String[] args) {
        // System - A built-in Java class that provides access to the system
        // out - A static field in System class representing standard output stream
        // println - A method that prints the argument and then terminates the line
        // "Hello, Java!" - String literal being printed to the console
        // Full breakdown of System.out.println():
        // - System: Core class providing system utilities and standard I/O
        // - out: Static PrintStream object for standard output (typically console)
        // - println(): Method that prints text and adds new line at the end
        // - The text "Hello, Java!" is the argument passed to println method
        System.out.println("Hello, Java!");
        

    }
}

