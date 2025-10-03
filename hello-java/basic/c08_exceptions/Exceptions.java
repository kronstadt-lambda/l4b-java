package basic.c08_exceptions;

/**
 * EXCEPTIONS IN JAVA:
 * An exception is an event that occurs during program execution that disrupts
 * the normal flow of instructions. It represents an error condition that needs
 * to be handled to prevent program termination.
 * <p>
 * When an error occurs within a method, the method creates an exception object
 * and hands it off to the runtime system. This process is called "throwing an exception".
 * <p>
 * Key aspects of exceptions:
 * 1. They help separate error handling code from regular code
 * 2. Allow propagation of errors up the call stack
 * 3. Group different types of errors and differentiate them
 * 4. Provide meaningful error information
 */

public class Exceptions {
    // ANSI escape codes for colors
    private static final String ANSI_RED = "\u001B[31m";
    private static final String ANSI_RESET = "\u001B[0m";

    public static void main(String[] args) {
        // handling exceptions

        // try-catch
        try {
            var myDivision = 10/2;
            System.out.println("myNumber is: " + myDivision);
        } catch (ArithmeticException e) {
            System.out.println(ANSI_RED + "Arithmetic error: " + e.getMessage() + ANSI_RESET);
        }

        // try-catch-finally
        try {
            var myDivision = 10/2;
            System.out.println("myNumber is: " + myDivision);
            var myName = "Brayan"; 
            System.out.println("My name is: " + myName.toUpperCase());
        } catch (ArithmeticException e) {
            System.out.println(ANSI_RED + "Arithmetic error: " + e.getMessage() + ANSI_RESET);
        } catch (NullPointerException e) {
            System.out.println(ANSI_RED + "Null pointer error: " + e.getMessage() + ANSI_RESET);
        } catch (Exception e) {
            System.out.println(ANSI_RED + "General error not handled: " + e.getMessage() + ANSI_RESET);
        }
        // The finally block is always executed whether an exception occurs or not,
        // ensuring that certain cleanup code or final operations are performed.
        finally {
            System.out.println("Finally block");
        }

        // throw and throws:
        // 'throw' keyword is used to explicitly throw an exception from any method or block.
        // 'throws' keyword is used in method declaration to indicate that this method might
        // throw one of the listed type exceptions.
        // Both keywords allow us to manually control exception handling flow.
        // this example allows you to handle the message of exception
        var throwExample = new ThrowExample();
        try {
            throwExample.checkAge(15);
        } catch (IllegalArgumentException e) {
            System.out.println(ANSI_RED + "Error with Age value: " + e.getMessage() + ANSI_RESET);
        }

        System.out.println("Fin");

        // Create my own exception
        try {
            throwExample.checkScore(-24);
        } catch (CustomException e) {
            System.out.println(ANSI_RED + "Error with Score value: " + e.getMessage() + ANSI_RESET);
        }

    }
}
