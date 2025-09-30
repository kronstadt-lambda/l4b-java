package c01_beginner;

import java.util.ArrayList;

public class VariablesAndConstants {
    // live template: main
    public static void main(String[] args) {

        // Variables
        // Variable Naming Conventions with examples:

        // 1. Use camelCase for variable names
        String firstName = "John";
        String lastName = "Doe";
        int totalAmount = 100;

        // 2. Names should be meaningful and descriptive
        int numberOfStudents = 25;
        String userEmailAddress = "john@example.com";
        double averageScore = 92.5;

        // 3. Start with letters, $ or _
        String _tempValue = "temporary";
        int $specialCode = 123;
        String loginName = "user123";

        // 4. Avoid single letter names (except loops/temporary)
        for (int i = 0; i < 10; i++) {
        } // acceptable in loops
        String str = "temp"; // avoid this
        String studentName = "John"; // better

        // 5. Boolean variables should start with 'is', 'has', 'can'
        boolean isActive = true;
        boolean hasPermission = false;
        boolean canEdit = true;


        String name = "Johnny"; // Variable declaration
        System.out.println(name); // prints the value of the variable

        name = "Charly"; // replace value
        System.out.println(name);

        // name = 100 (error message!: you can't change the data type)

        int age = 25; // Variable declaration
        System.out.println(age); // prints the value of the variable

        // Constants
        // Example: MAX_VALUE, MIN_VALUE, DEFAULT_SIZE

        // Best practice: Constants should be named in uppercase with underscores
        // Constant Naming Conventions:
        // 1. Use UPPERCASE_WITH_UNDERSCORES
        // 2. Names should be clear and descriptive
        // 3. Commonly used for configuration values and mathematical constants
        // 4. Should represent truly constant values
        // 5. Often declared as static final class members

        // Examples of constant declarations:
        final int MAX_STUDENTS = 100;
        final double PI_VALUE = 3.14159;
        final String DATABASE_URL = "jdbc:mysql://localhost:3306/db";
        final long TIMEOUT_MILLISECONDS = 5000;
        final boolean DEBUG_MODE = false;


        String email = "kronstadt.lambda@gmail.com";
        email = "bramau.lambda@gmail.com";
        System.out.println(email); // it isn't constant

        final String email2 = "brayan108910@gmail.com";
        // email2 = "algo@gmail.com" (error message!: Can't assign a value ...)
        System.out.println(email2); // it is a constant!!!
        
        // var keyword:
        // - Introduced in Java 10
        // - Provides type inference for local variables
        // - Compiler determines the type based on the initialization value
        // - Makes code more concise while maintaining type safety

        // Valid var usage examples:
        var message = "Hello"; // Type: String
        System.out.println(message);
        var count = 42; // Type: int
        System.out.println(count);
        var price = 19.99; // Type: double
        System.out.println(price);
        var numbers = new ArrayList<Integer>(); // Type: ArrayList<Integer>
        numbers.add(1);
        System.out.println(numbers.getClass().getSimpleName());

        // Cases where var CANNOT be used:
        // 1. Class fields/instance variables
        // 2. Method parameters
        // 3. Method return types
        // 4. Without initialization
        // 5. With null value
        // Examples of invalid var usage:
        // var someField; // Error: cannot use without initialization
        // var nullValue = null; // Error: cannot infer type
        // public var getMessage() {} // Error: cannot use in method return type

    }
}
