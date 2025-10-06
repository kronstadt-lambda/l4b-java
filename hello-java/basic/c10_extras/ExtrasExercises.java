package basic.c10_extras;

import java.util.Random;
import java.util.Scanner;

public class ExtrasExercises {
    static String globalMessage = "Global message";
    static String userName = "Bramau";

    public static void main(String[] args) {

        // Exercises 1:
        System.out.println("Exercise 1:");
        String myString = null;
        if (myString != null) {
            System.out.println("My string is not null");
        }

        // Exercises 2:
        System.out.println("Exercise 2:");
        var scanner = new Scanner(System.in);
        var myName = scanner.nextLine();
        System.out.println("My name is: " + myName.toUpperCase());
        var myAge = scanner.nextInt();
        System.out.println("My age is: " + myAge);
        scanner.close();

        // Exercises 3:
        System.out.println("Exercise 3:");
        final var MY_MAX = 100;
        System.out.println("My max is: " + MY_MAX);

        // Exercises 4:
        System.out.println("Exercise 4:");
        String localMessage = "Local message";
        System.out.println(localMessage);
        System.out.println(globalMessage);

        // Exercises 5:
        System.out.println("Exercise 5:");
        var otherScanner = new Scanner(System.in);
        System.out.println("In put a number:");
        int myNumber = otherScanner.nextInt();
        if (myNumber > 0) {
            System.out.println("My number is positive");
        } else if (myNumber < 0) {
            System.out.println("My number is negative");
        } else {
            System.out.println("My number is zero");
        }
        otherScanner.close();

        // Exercises 6:
        System.out.println("Exercise 6:");
        System.out.println(Message.aMessage);

        // Exercises 7:
        System.out.println("Exercise 7:");
        var rnd = new Random();
        rnd.setSeed(123456789);
        var myRandomNumber = rnd.nextInt(10);
        System.out.println("My random number is: " + myRandomNumber);

        // Exercises 8:
        System.out.println("Exercise 8:");
        var myDocumentedClass = new DocumentedClass("This is a documented class");
        myDocumentedClass.printInfo();

        // Exercises 9:
        System.out.println("Exercise 9:");
        var myUser = new User();
        myUser.showUsernameAndAppName();

    }

    public static class Message {
        public static String aMessage = "accessible message";
    }

    public static class DocumentedClass {
        private String info;

        public DocumentedClass(String info) {
            this.info = info;
        }
        public void printInfo() {
            System.out.println("Getting info : " + info);
        }
    }

    public static class User {
        final String APP_NAME = "My app";

        public void showUsernameAndAppName() {
            System.out.println("User: " + userName);
            System.out.println("App: " + APP_NAME);
        }
    }
}
