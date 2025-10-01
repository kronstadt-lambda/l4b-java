package c05_loops;
/*
1. Print numbers from 1 to 10 using while.
2. Use do-while to display all values of an ArrayList.
3. Print multiples of 5 from 1 to 50 using for.
4. Traverse an Array of 5 numbers and print the total sum.
5. Use a for loop to traverse an Array and show its values.
6. Use for-each to traverse a HashSet and a HashMap.
7. Print numbers from 10 to 1 (descending) with a for loop.
8. Use 'continue' to skip multiples of 3 from 1 to 20.
9. Use break to stop a loop when you find a negative number in an array.
10. Create a program that calculates the factorial of a given
number.
 */

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class LoopsExercises {
    public static void main(String[] args) {

        // Exercise 1:
        int myNumber = 1;
        while (myNumber <= 10) {
            System.out.println(myNumber);
            myNumber++;
        }

        // Exercise 2:
        var myNumbers = new ArrayList<Integer>();
        myNumbers.add(1);
        myNumbers.add(3);
        myNumbers.add(5);
        myNumbers.add(7);
        myNumbers.add(9);
        int index = 0;
        System.out.println("Printing all values of an ArrayList:");
        do {
            System.out.println(myNumbers.get(index));
            index++;
        } while (index < myNumbers.size());

        // Exercise 3:
        System.out.println("Printing multiples of 5 from 1 to 50:");
        int myFirstValue = 1;
        for (int i = 1; i <= 50; i++) {
            if (i % 5 == 0) {
                System.out.println(i);
            }
        }

        // Exercise 4:
        Double[] myNumbersArray = {1.0, 2.0, 3.0, 4.0, 5.0};
        System.out.println("Total sum of the numbers in the array:");
        double totalSum = 0;
        for (Double number : myNumbersArray) {
            totalSum += number;
        }
        System.out.println(totalSum);

        // Exercise 5:
        for (Double number : myNumbersArray ) {
            System.out.println( "The value is : " + number);
        }

        // Exercise 6:
        var myCountries = new HashSet<String>();
        myCountries.add("USA");
        myCountries.add("France");
        myCountries.add("Germany");
        myCountries.add("Italy");
        System.out.println("Printing all values of a HashSet:");
        for (String country : myCountries) {
            System.out.println("Welcome to " + country);
        }

        var myContacts = new HashMap<String, String>();
        myContacts.put("John", "123456789");
        myContacts.put("Jane", "987654321");
        myContacts.put("Bob", "098765432");
        myContacts.put("Brian", "123456789");
        System.out.println("Printing all values of a HashMap:");
        for (Map.Entry<String, String> contact : myContacts.entrySet()) {
            System.out.println(contact.getKey() + ": " + contact.getValue());
        }

        // Exercise 7:
        for (int i = 10; i > 0; i--) {
            System.out.println(i);
        }

        // Exercise 8:
        System.out.println("Printing values of a range from 1 to 20, executing multiples of 3:");
        for (int i = 1; i <= 20; i++) {
            if (i % 3 == 0) {
                continue;
            }
            System.out.println(i);
        }

        // Exercise 9:
        Double[] myDoubleNumbers = {1.0, 2.0, 3.0, 4.0, 5.0, 6.0, 7.0, -8.0, 9.0, 10.0};
        for (Double number : myDoubleNumbers) {
            if (number < 0) {
                System.out.println("Negative number found: " + number);
                break;
            }
            System.out.println(number);
        }

        // Exercise 10:
        int defFactorial = 5;
        int totalFactorial = 1;
        for (int i = 1; i <= defFactorial; i++) {
            totalFactorial *= i;
        }
        System.out.println("The factorial of " + defFactorial + " is: " + totalFactorial);
    }
}
