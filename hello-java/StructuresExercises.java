/*
1. Create an Array with 5 values and print its length.
2. Modify one of the Array values and print the value of the index before and after modifying it.
3. Create an empty ArrayList.
4. Add 4 values to the ArrayList and then remove one.
5. Create a HashSet with 2 different values.
6. Add a new repeated value and another non-repeated value to the HashSet.
7. Remove one of the elements from the HashSet.
8. Create a HashMap where the key is a name and the value is the phone number. Add three contacts.
9. Modify one of the contacts and delete another.
10. Given an Array, transform it into an ArrayList, then into a HashSet and finally into a HashMap with
key and value being equal.
 */

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class StructuresExercises {
    public static void main(String[] args) {
        // My solutions will go here:
        // Exercise 1:
        int[] myNumbers = new int[]{1,2,3,4,5};
        System.out.println(myNumbers.length);

        // Exercise 2:
        System.out.println(myNumbers[1]);
        myNumbers[1] = 10;
        System.out.println(myNumbers[1]);

        // Exercise 3:
        var myNames = new ArrayList<String>();
        System.out.println(myNames.size());
        System.out.println(myNames);

        // Exercise 4:
        System.out.println(myNames.add("John"));
        System.out.println(myNames.add("Jane"));
        System.out.println(myNames.add("Bob"));
        System.out.println(myNames.add("Brian"));
        myNames.remove(2);

        // Exercise 5:
        var myNumbersSet = new HashSet<Integer>();
        myNumbersSet.add(5);
        myNumbersSet.add(10);
        System.out.println(myNumbersSet);

        // Exercise 6:
        myNumbersSet.add(5);
        System.out.println(myNumbersSet);
        myNumbersSet.add(7);
        System.out.println(myNumbersSet);

        // Exercise 7:
        myNumbersSet.remove(5);
        System.out.println(myNumbersSet);

        // Exercise 8:
        var myContacts = new HashMap<String, String>();
        myContacts.put("John", "123456789");
        myContacts.put("Jane", "987654321");
        myContacts.put("Bob", "098765432");
        System.out.println(myContacts);

        // Exercise 9:
        myContacts.put("Bob", "000000000");
        myContacts.remove("Jane");
        System.out.println(myContacts);

        // Exercises 10:
        Integer[] myNumbersArray = new Integer[5];
        myNumbersArray = new Integer[]{1,2,3,4,5};
        System.out.println(myNumbersArray);

        var myNumbersList = new ArrayList<Integer>(Arrays.asList(myNumbersArray));
        System.out.println(myNumbersList);
        System.out.println(myNumbersList.getClass().getSimpleName());

        var myNumberSet = new HashSet<>(myNumbersList);
        System.out.println(myNumberSet);
        System.out.println(myNumberSet.getClass().getSimpleName());

        var myNumberMap = new HashMap<Integer, Integer>();
        myNumberSet.forEach(n -> myNumberMap.put(n, n));
        System.out.println(myNumberMap);
        System.out.println(myNumberMap.getClass().getSimpleName());



    }
}
