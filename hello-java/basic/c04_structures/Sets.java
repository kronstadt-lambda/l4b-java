package c04_structures;
/*
 * Sets in Java are collections that store unique elements, meaning no duplicates are allowed.
 * They are useful for:
 * - Removing duplicates from a collection
 * - Testing whether an element is contained in a collection (fast lookup)
 * - Ensuring uniqueness in a group of elements
 * - Set operations like union, intersection, and difference
 * Common implementations include HashSet (unordered), LinkedHashSet (ordered by insertion),
 * and TreeSet (sorted by natural order or custom comparator)
 */
import java.util.HashSet;

/*
 * DISCLAIMER:
 * Sets are not designed for storing data that requires a specific order.
 * They are optimized for fast lookups and ensuring uniqueness.
 * Unlike ArrayList, Sets don't have get() or set() methods because
 * element position is not relevant to their primary purpose.
 * Use Sets when you need quick element existence checks or uniqueness guarantee.
 */
public class Sets {
    public static void main(String[] args) {

        // Declaring and creating a set
        HashSet<String> mySet = new HashSet<>();
        var myNames = new HashSet<>();
        var myNumbers = new HashSet<>();

        // Size of the HashSet
        System.out.println(mySet.size());

        // Disclaimer: HashSet is an unordered collection, elements may not maintain their insertion order
        // Adding elements to the set
        mySet.add("Bram");
        mySet.add("Maurice");
        mySet.add("John");
        System.out.println(mySet.size());
        System.out.println(mySet);

        myNumbers.add(1);
        myNumbers.add(2);
        myNumbers.add(3);

        // For accessing doesn't use an index, use contains() method, because it is faster
        System.out.println(mySet.contains("John"));
        System.out.println(mySet.contains("Jules"));

        // Removing elements from the set
        mySet.remove("John");
        System.out.println(mySet);
        System.out.println(mySet.size());

        //Tips: Think a Hash like a Key for searching in a HashTable

        // Add sets
        var oddNumbers = new HashSet<Integer>();
        oddNumbers.add(1);
        oddNumbers.add(3);
        oddNumbers.add(5);

        myNumbers.addAll(oddNumbers);
        System.out.println(myNumbers);

        // Remove sets
        var evenNumbers = new HashSet<Integer>();
        evenNumbers.add(2);
        evenNumbers.add(4);
        evenNumbers.add(6);

        myNumbers.removeAll(evenNumbers);
        System.out.println(myNumbers);

        // Retain common elements
        var anyNumbers = new HashSet<Integer>();
        anyNumbers.add(1);
        anyNumbers.add(5);
        anyNumbers.add(7);

        myNumbers.retainAll(anyNumbers);
        System.out.println(myNumbers);


        
    }
}
