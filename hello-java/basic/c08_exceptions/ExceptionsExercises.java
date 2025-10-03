package basic.c08_exceptions;

/**
 1. Divide two numbers stored in two variables. Handle the division by zero with try-catch.
 2. Create an array of 3 elements and try to access index
 5. Catch the ArrayIndexOutOfBoundsException.
 3. Create a null String variable and try to print its length. Handle the NullPointerException.
 4. Write a function that transforms text to number. Use try-catch to handle invalid inputs (NumberFormatException).
 5. Write a program with a finally block that always executes, whether there is an error or not.
 6. Use throw to throw an IllegalArgumentException if a number introduced is negative.
 7. Create a TemperatureChecker class that throws a custom exception if the temperature is less than -50 or greater than 50.
 8. Create a program with multiple catch blocks: one for ArithmeticException, another for ArrayIndexOutOfBoundsException.
 9. Create a checkPassword(String pass) function that throws an exception if the password is too short.
 10.Implement a LoginSystem class that uses a custom LoginFailedException if the username or password is incorrect.
 */


public class ExceptionsExercises {

    private static final String ANSI_RED = "\u001B[31m";
    private static final String ANSI_RESET = "\u001B[0m";

    //
    public static Integer transformToInteger(String input) {
        return Integer.parseInt(input);
    }

    //
    public static void checkFlavors(String flavor) throws IllegalArgumentException {
        switch (flavor.toLowerCase()) {
            case "vanilla":
                System.out.println("vanilla flavor");
                break;
            case "chocolate":
                System.out.println("chocolate flavor");
                break;
            case "strawberry":
                System.out.println("strawberry flavor");
                break;
            case "coffee":
                System.out.println("coffee flavor");
                break;
            case "hazelnut":
                System.out.println("hazelnut flavor");
                break;
            case "rainbow":
                System.out.println("rainbow flavor");
                break;
            default:
                throw new IllegalArgumentException("Unknow flavor, check the flavor list!!");
        }
    }

    //
    public static Double checkPositiveNumber(Double number) throws IllegalArgumentException {
        if (number < 0) {
            throw new IllegalArgumentException("Number must be positive");
        } else {
            System.out.println("Number is positive");
            return number;
        }
    }

    //
    public static class TemperatureService {
        public void checkValidTemperature(Double temp) throws TemperatureChecker {
            if (temp < -50. || temp > 50) {
                throw new TemperatureChecker("Temperature out of range");
            } else {
                System.out.println("Temperature is valid");
            }
        }
    }

    //
    public static class Preconditions {
        public static <T> T checkNotNull(T value, String message) {
            if (value == null) {
                throw new NullPointerException(message);
            }
            return value;
        }

        public static void checkArgument(boolean condition, String message) {
            if (!condition) {
                throw new IllegalArgumentException(message);
            }
        }
        public static void checkLengthArgument(int length, int minLength, int maxLength) {
            if (length < minLength || length > maxLength) {
                throw new IllegalArgumentException("Length must be between " + minLength + " and " + maxLength);
            }
        }
    }

    //

    public static class ArrayService {

        private final Double[] array;
        private final int minLength;


        public ArrayService(Double[] array, int minLength) {
            this.array = Preconditions.checkNotNull(array, "Array cannot be null");
            Preconditions.checkArgument(minLength >= 0, "Min length must be greater than 0");
            Preconditions.checkArgument(array.length >= minLength, "Array length must be greater than " + minLength);
            this.minLength = minLength;
        }

        public Double[] getSqrt() {
            Double[] sqrtArray = new Double[array.length];
            for (int i = 0; i < array.length; i++) {
                Double value = array[i];
                if (value == null) {
                    throw new NullPointerException("Array cannot contain null values");
                }

                if (value < 0.0) {
                    throw new ArithmeticException(
                            "Array cannot content negative values. (Index: " + i + ", value: " + value + ")"
                    );
                }
                sqrtArray[i] = Math.sqrt(value);
            }
            return sqrtArray;
        }

        public double getValueAccIndex(int index) {
            if (index < 0 || index >= array.length) {
                throw new IndexOutOfBoundsException("Index must be between 0 and " + (array.length - 1));
            }
            return array[index];
        }
    }

    //
    public static class PasswordService {
        private final String password;

        public PasswordService(String password) {
            this.password = Preconditions.checkNotNull(password, "Password cannot be null");
            Preconditions.checkLengthArgument(password.length(), 8, 16);
        }

        public static void checkPassword(String password) throws IllegalArgumentException {
            if (password.length() < 8) {
                throw new IllegalArgumentException("Password must be between 8 and 16 characters");
            }
        }
    }

    //
    protected static class LoginSystem {
        private final String username = "Bramau@gmail.com";
        private final String password = "Elperro$gaucho";
        private final String getUsername;
        private final String getPassword;

        private LoginSystem(String username, String password) {
            this.getUsername = Preconditions.checkNotNull(username, "Username cannot be null");
            this.getPassword = Preconditions.checkNotNull(password, "Password cannot be null");
        }

        protected void login() throws LoginFailedException{
            if (!(username.equals(this.getUsername) && password.equals(this.getPassword))) {
                throw new LoginFailedException("Invalid username or password");
            } else {
                System.out.println("Login successful");
            }
        }
    }


    public static void main(String[] args) {

        // Exercise 1:
        System.out.println("Exercise 1:");
        var myNumber1 = 5;
        var myNumber2 = 0;
        try {
            System.out.println("The divison is : " + myNumber1 / myNumber2);
        } catch (ArithmeticException e) {
            System.out.println(ANSI_RED + "Cannot divide by zero" + ANSI_RESET);
        }

        // Exercise 2:
        System.out.println("Exercise 2:");
        double[] myNumbers = {1.0, 2.0, 3.0, 4.0, 5.0};
        try {
            System.out.println(myNumbers[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(ANSI_RED + "Index out of bounds. Check the array index!!" + ANSI_RESET);
        }

        // Exercise 3:
        System.out.println("Exercise 3:");
        String myString = null;
        try {
            System.out.println(myString.length());
        } catch (NullPointerException e) {
            System.out.println(ANSI_RED + "Null pointer exception. Check the variable value!!" + ANSI_RESET);
        }

        // Exercise 4:
        System.out.println("Exercise 4:");
        var myStringInput = "3.5"; //new Scanner(System.in);
        try {
//            var myInteger = transformToInteger(myStringInput.nextLine());
            var myInteger = transformToInteger(myStringInput);
            System.out.println("The integer is: " + myInteger);
        } catch (NumberFormatException e) {
            System.out.println(ANSI_RED + "Number format exception. Check the input, this must an integer number!!" + ANSI_RESET);
        }

        // Exercise 5:
        System.out.println("Exercise 5:");
        var myFlavors = "Vanish";
        try {
            checkFlavors(myFlavors);
        } catch (IllegalArgumentException e) {
            System.out.println(ANSI_RED + "Error with flavor value: " + e.getMessage() + ANSI_RESET);
        } finally {
            System.out.println("Finally block");
        }

        // Exercise 6:
        System.out.println("Exercise 6:");
        var myPositiveNumber = -10.;
        try {
            myPositiveNumber = checkPositiveNumber(myPositiveNumber);
        } catch (IllegalArgumentException e) {
            System.out.println(ANSI_RED + "Error with positive number: " + e.getMessage() + ANSI_RESET);
        } finally {
            System.out.println("Finally exercise 6.");
        }

        // Exercise 7:
        System.out.println("Exercise 7:");
        var myTemperature = 100.0;
        try {
            var myTemperatureService = new TemperatureService();
            myTemperatureService.checkValidTemperature(myTemperature);
        } catch (TemperatureChecker e) {
            System.out.println(ANSI_RED + "Error with temperature: " + e.getMessage() + ANSI_RESET);
        } finally {
            System.out.println("Finally exercise 7.");
        }

        // Exercise 8:
        System.out.println("Exercise 8:");
        Double[] myArray = new Double[] {1.0, 2.0, -3.0, 4.0, 5.0}; // test with (null)
        int minLength = 3; // test with (-2, 60)
        try {
            var myArrayService = new ArrayService(myArray, minLength);
        } catch (NullPointerException e) {
            System.out.println(ANSI_RED + "Error with array content: " + e.getMessage() + ANSI_RESET);
        } catch (IllegalArgumentException e) {
            System.out.println(ANSI_RED + "Error with array length or additional arguments: " + e.getMessage() + ANSI_RESET);
        }

        Double[] myArray2 = new Double[]{1.0, 2.0, 3.0, 4.0, 5.0, 6.0}; // test new Double[]{1.0, 2.0, -3.0, 4.0, 5.0, null};
        int index = 10;
        try {
            var myArrayService = new ArrayService(myArray2, minLength);
            var mySqrtArray = myArrayService.getSqrt();
            var myValue = myArrayService.getValueAccIndex(index);
        } catch (NullPointerException e) {
            System.out.println(ANSI_RED + "Error with null array value(s): " + e.getMessage() + ANSI_RESET);
        } catch (IndexOutOfBoundsException e) {
            System.out.println(ANSI_RED + "Error index out of range: " + e.getMessage() + ANSI_RESET);
        } catch (ArithmeticException e) {
            System.out.println(ANSI_RED + "Error with negative array value(s): " + e.getMessage() + ANSI_RESET);
        } finally {
            System.out.println("Finally exercise 8.");
        }

        // Exercise 9:
        System.out.println("Exercise 9:");
        var myPassword = "noet";
        try {
            var myPasswordService = new PasswordService(myPassword);
        } catch (IllegalArgumentException e) {
            System.out.println(ANSI_RED + "Error with password: " + e.getMessage() + ANSI_RESET);
        } finally {
            System.out.println("Finally exercise 9.");
        }

        // Exercise 10:
        System.out.println("Exercise 9:");
        var user = "Bramau@gmail.com";
        var pass = "Elperro$gauchoooooooooooo";

        try {
            var myLoginSystem = new LoginSystem(user, pass);
            myLoginSystem.login();
        } catch (LoginFailedException e) {
            System.out.println(ANSI_RED + "Error with login: " + e.getMessage() + ANSI_RESET);
        }





//



    }

}
