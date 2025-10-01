package c01_beginner;

import java.util.Locale;

public class Strings {
    public static void main(String[] args) {

        // Strings
        // with String class
        String myName = "Brayan";
        System.out.println("My name is: " + myName);
        // with var keyword
        var mySecondName = "Maurer";
        System.out.println(myName + " " + mySecondName);
        // Instance String class
        var mySurname = new String("Zenteno");
        System.out.println(mySurname);

        // Operations with Strings
        // concatenation
        var myFullName = myName + " " + mySecondName + " " + mySurname;
        System.out.println(myFullName);

        // length
        System.out.println(myFullName.length());

        // charAt: get character at position
        System.out.println(myFullName.charAt(myFullName.length() - 5));

        // Substring
        System.out.println(myFullName.substring(10, myFullName.length() - 5));
        System.out.println(myFullName.substring(15));

        //UpperCase/LowerCase
        System.out.println(myFullName.toUpperCase());
        System.out.println(myFullName.toLowerCase());

        // Contains
        System.out.println(myFullName.contains("Brayan"));
        System.out.println(myFullName.contains("algo"));

        // Equals
        // Note: equals() compares String content while == compares object references
        // Use equals() for String comparison, as == may give unexpected results with String literals
        System.out.println(myName.equals("Brayan"));
        System.out.println(myName.equalsIgnoreCase(myName.toUpperCase()));
        
        // Trim and Replace
        System.out.println(("    yo   " + myFullName + "   end    .  ").trim()); // removes leading and trailing spaces (to init and end of string)
        System.out.println(myFullName.replace("Brayan", "BrayanUpper"));

        // Format
        var myAge = 25;
        System.out.println(String.format("My name is %s %s %s, I am %d years old.", myName, mySecondName, mySurname, myAge));
    }
}
