
/*
 * Maps in Java are data structures that store key-value pairs.
 * They are useful for:
 * - Creating dictionaries or lookup tables
 * - Storing associations between related data
 * - Quick data retrieval using unique keys
 * - Counting occurrences (like in a frequency counter)
 * HashMap is one of the most common Map implementations,
 * offering constant-time O(1) performance for basic operations.
 *
 * DISCLAIMER:
 * Unlike arrays or lists, Maps do not support index-based access to elements.
 * Elements can only be accessed using their associated keys.
 */

import java.util.HashMap;

public class Maps {
    public static void main(String[] args) {

        // Declaring and creating a map
        HashMap<String,String> mapStringString = new HashMap<String, String>();
        var mapStringInteger = new HashMap<String, Integer>();
        var mapPhonePerson = new HashMap<Integer, String>();

        // Sizes
        System.out.println(mapStringString.size());
        System.out.println(mapStringInteger.size());
        System.out.println(mapPhonePerson.size());

        // Adding elements
        mapStringString.put("John", "Smith");
        mapStringString.put("Jane", "Doe");
        mapStringString.put("Bob", "Smith");
        mapStringString.put("Brian", "Smith");
        mapStringString.put("John", "Jones");
        System.out.println(mapStringString.size());
        System.out.println(mapStringString);

        mapPhonePerson.put(123456789, "John");
        mapPhonePerson.put(987654321, "Jane");
        System.out.println(mapPhonePerson);

        // Accessing elements
        System.out.println(mapStringString.get("John"));
        System.out.println(mapStringString.get("Jane"));

        System.out.println(mapPhonePerson.get(123456789));
        System.out.println(mapPhonePerson.get(000000000)); // null

        // Verifying if a key exists
        System.out.println(mapStringString.containsKey("John"));
        System.out.println(mapStringString.containsKey("Jane"));
        System.out.println(mapStringString.containsKey("Brayan"));

        // Verifying if a value exists
        System.out.println(mapStringString.containsValue("Smith"));
        System.out.println(mapStringString.containsValue("Jones"));
        System.out.println(mapStringString.containsValue("Maurer"));

        // Removing elements
        mapStringString.remove("John");
        System.out.println(mapStringString);
        System.out.println(mapStringString.size());

        // Clearing the map
        mapStringString.clear();
        System.out.println(mapStringString.size());
        System.out.println(mapStringString);

        // Other operations
        // When adding an element with an existing key using put(), the old value will be replaced.
        // For safer replacement, use replace() method which only updates if the key exists.
        mapStringString.put("John", "Smith");
        System.out.println(mapStringString);
        mapStringString.put("John", "Does");
        System.out.println(mapStringString);

        // When the old key doesn't exist, replace() will not update the map.'
        mapStringString.replace("Mauro", "Connor" );
        System.out.println(mapStringString);

        // Ensure that the key does not exist before adding it
        mapStringString.putIfAbsent("Ricardo", "Connor");
        System.out.println(mapStringString);

        // It has data?
        System.out.println(mapStringString.isEmpty());

        // Get all values (list)
        System.out.println(mapStringString.values());






    }
}
