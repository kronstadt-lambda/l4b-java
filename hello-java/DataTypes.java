public class DataTypes {
    // live template: main
    public static void main(String[] args) {

        // Primitive Data Types in Java: Data types in than the core is written
        // - byte: 8-bit integer (-128 to 127)
        // - short: 16-bit integer (-32,768 to 32,767)
        // - int: 32-bit integer (-2^31 to 2^31-1)
        // - long: 64-bit integer (-2^63 to 2^63-1)
        // - float: 32-bit floating point
        // - double: 64-bit floating point
        // - boolean: true/false values
        // - char: 16-bit Unicode character

        // Examples of primitive data types:
        byte myAge = 25;
        System.out.println(myAge);
        short townPopulation = 32000;
        System.out.println(townPopulation);
        int mySalary = 50000;
        System.out.println(mySalary);
        long worldPopulation = 7800000000L;
        float price = 19.99f;
        double piNumber = 3.14159;
        System.out.println(piNumber);
        boolean isJavaFun = true;
        System.out.println(isJavaFun);
        char myGrade = 'A'; // comilla simple
        System.out.println(myGrade);

        // how do u know data type?
        // - Use the instanceof operator to check if an object is an instance of a class
        // - Use the getClass() method to get the runtime class of an object
        // - Use the typecast operator to convert an object to a different type
        // DISCLAIMER: The getClass() method is only available for objects (reference types) 
        // and not for primitive data types. Primitive types like int, boolean, char, etc. 
        // are not objects and don't have methods.
        String myString = "Hello";
        System.out.println(myString.getClass().getSimpleName());
        


    }
}
