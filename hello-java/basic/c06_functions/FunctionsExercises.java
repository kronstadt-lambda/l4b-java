package c06_functions;
/**
 1. Create a function that prints "Welcome to the Java course from zero!".
 2. Write a function that receives a name as a parameter and greets that person.
 3. Make a method that receives two integers and returns their subtraction.
 4. Create a method that calculates the square of a number (n * n).
 5. Write a function that receives a number and tells if it is even or odd.
 6. Create a method that receives an age and returns true if it is of legal age (and false otherwise).
 7. Implement a function that receives a string and returns its length.
 8. Create a method that receives an array of integers, calculates its average and returns it.
 9. Write a method that receives a number and returns its factorial.
 10. Create a function that receives an ArrayList<String> and traverses it showing each element.
 */

import java.util.ArrayList;

public class FunctionsExercises {
    public static void main(String[] args) {
        // Exercise 1:
        javaWelcoming();
        // Exercise 2:
        greetingPerson("Brayan");
        // Exercise 3:
        System.out.println("The rest of values is : " + restTwoValues(10, 5));
        // Exercise 4:
        System.out.println("Calculate " + 3 + "**2 = " + powerNumber(3));
        // Exercise 5:
        System.out.println("This number 10 is :" + isEvenOrOdd(10));
        // Exercise 6:
        System.out.println("Is adult? :" + isAdult(17));
        // Exercise 7:
        System.out.println("The length of the string is: " + lengthOfString("Hello World"));
        // Exercise 8:
        Double[] numbers = {1.0, 2.0, 3.0, 4.0, 5.0};
        System.out.println("The average of the numbers is: " + averageOfNumbers(numbers));
        // Exercise 9:
        System.out.println("The factorial of 5 is: " + calculateFactorial(5));
        // Exercise 10:
        var myList = new ArrayList<String>();
        myList.add("Hello");
        myList.add("World");
        myList.add("!");
        System.out.println("Printing all elements of the list:");
        showElements(myList);

    }
    public static void javaWelcoming() {
        System.out.println("Thanks for learning Java from zero to hero");
    }
    public static void greetingPerson(String name) {
        System.out.println("Hello " + name);
    }
    public static Integer restTwoValues(Integer a, Integer b) {
        return a - b;
    }
    public static Integer powerNumber(Integer number) {
        return number * number;
    }
    public static String isEvenOrOdd(Integer number) {
        if (number % 2 == 0) {
            return "even";
        } else {
            return "odd";
        }
    }
    public static Boolean isAdult(Integer age) {
        return age >= 18;
    }
    public static Integer lengthOfString(String string) {
        return string.length();
    }
    public static Double averageOfNumbers(Double[] numbers) {
        Double sum = 0.0;
        for (Double number : numbers) {
            sum += number;
        }
        return sum / numbers.length;
    }
    public static Integer calculateFactorial(Integer number) {
        if (number == 0) {
            return 1;
        }
        return number * calculateFactorial(number - 1);
    }
    public static void showElements(ArrayList<String> myList) {
        for (String element : myList) {
            System.out.println(element);
        }
    }
}
