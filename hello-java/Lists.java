import java.util.ArrayList;

public class Lists {
    public static void main(String[] args) {

        // Declaring and creating a list
        ArrayList<String> myNames = new ArrayList<>();

        // DISCLAIMER:
        // Primitive types (like int, double, boolean) cannot be used as type parameters in generics.
        // Instead, use their corresponding wrapper classes:
        // int -> Integer
        // double -> Double
        // boolean -> Boolean
        // char -> Character
        // etc.
        ArrayList<Integer> myNumbers = new ArrayList<>();

        // other ways to create a list:
        var myNumbers2 = new ArrayList<Integer>(); // best notation according to best practice

        // Size of the ArrayList
        System.out.println(myNames.size());

        // NOTE: ArrayList maintains insertion order.
        // Elements are stored in the order they are added to the list.
        // Adding elements to ArrayList
        myNames.add("Bram");
        myNames.add("Maurice");
        myNames.add("John");
        System.out.println(myNames.size());

        // Accessing elements
        System.out.println(myNames.getFirst());
        System.out.println(myNames.get(1));
        System.out.println(myNames.getLast());

        // Modifying elements
        myNames.set(1, "Jules");
        System.out.println(myNames.get(1));

        // Deleting elements
        myNames.remove(1);
        System.out.println(myNames.size());

        // Searching for an element
        System.out.println(myNames.contains("John"));
        System.out.println(myNames.contains("Jules"));

        // Clearing the list
        myNames.clear();
        System.out.println(myNames.size());

        // HashCode
        System.out.println(myNames.hashCode());

    }
}
