package c05_loops;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Loops {
    public static void main(String[] args) {

        // - for / for each
        for (int i = 0; i < 10; i++) {
            System.out.println("Hello Java!");
        }

        for (int j = 2; j < 10; j+=3) {
            System.out.println("Hello Python! " + j);
        }

        for (int k = 10; k > 0; k-=2) {
            System.out.println("Hello Ruby! " + k);
        }

        String[] names = {"John", "Jane", "Jill", "Joe"};
        for (int i = 0; i < names.length; i++) {
            System.out.println("Hello " + names[i]);
        }

        // for-each (ideal for iterating over collections)
        for (String name : names) {
            System.out.println("Bye " + name);
        }

        var myCountries = new HashSet<String>();
        myCountries.add("USA");
        myCountries.add("France");
        myCountries.add("Germany");
        myCountries.add("Italy");

        for (String country : myCountries) {
            System.out.println("Welcome to " + country);
        }

        var myContacts = new HashMap<String, Integer>();
        myContacts.put("John", 123456789);
        myContacts.put("Brayan", 987654321);
        myContacts.put("Jane", 000000000);

        for (Map.Entry<String,Integer> contact: myContacts.entrySet()) {
            System.out.println(contact.getKey() + ": " + contact.getValue());
        }

        // - while
        int itIndex = 5;
        while (itIndex > 0) {
            System.out.println("It's over in " + itIndex + " iterations!");
            itIndex--;
        }

        int otherIndex = 0;
        boolean isMatch = false;
        while (!isMatch) {
            if (names[otherIndex].equals("Jane")) {
                System.out.println("Jane is at index " + otherIndex);
                isMatch = true;
            }
            otherIndex++;
        }

        // - do-while
        // The do-while loop is used when you need to execute the loop body at least once,
        // regardless of the condition
        int doIndex = 0;
        do {
            System.out.println("Do is over in " + doIndex + " iterations!");
            doIndex++;
        } while (doIndex < 5);

        // Control of loop
        // - break
        int breakIndex = 0;
        for (String name : names) {
            if (name.equals("Jane")) {
                System.out.println("Jane is here, break at index " + breakIndex);
                break;
            }
            breakIndex++;
        }

        // - continue
        for (int i = 0; i < 5; i++) {
            if (i == 2) {
                continue;
            }
            System.out.println("Iteration " + i);
        }
    }
}
