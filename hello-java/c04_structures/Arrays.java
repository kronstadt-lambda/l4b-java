package c04_structures;
/*
 * DISCLAIMER:
 * When arrays are created, their elements are automatically initialized with default values:
 * - For primitive type arrays (int, boolean, etc.), elements are initialized with their type's default value
 *   (0 for numeric types, false for boolean)
 * - For object type arrays (String, Integer, etc.), elements are initialized with null
 */
public class Arrays {
    public static void main(String[] args) {

        // Declaration and create an array
        int[] myNumbers = new int[5];
        String[] myNames = new String[3];
        System.out.println(myNumbers.length);
        System.out.println(myNames.length);

        // Initialize the array
        myNumbers = new int[]{1,2,3,4,5};
        myNames = new String[]{"Bram","Maurice","John"};

        // Accessing elements
        System.out.println(myNumbers[0]);
        System.out.println(myNames[1]);
        System.out.println((new String[3])[0]); // in oneliner

        //Modifying elements
        myNumbers[0] = 10;
        myNames[1] = "Jules";
        System.out.println(myNumbers[0]);

        myNames[1] = null; // String is compatible with Object null
        System.out.println(myNames[0]);
        // myNumbers[0] = null; Error message: required null

        boolean[] myBooleans = new boolean[2];
        System.out.println(myBooleans[1]);


    }
}
