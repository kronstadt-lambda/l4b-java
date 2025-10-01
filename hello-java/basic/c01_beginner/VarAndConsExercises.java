package c01_beginner;
/*
Exercises:
1. Declare a String variable and assign your name to it.
2. Create an int variable and assign your age to it.
3. Create a double variable with your height in meters.
4. Declare a boolean variable that indicates if you like
programming.
5. Declare a constant with your email.
6. Create a char variable and store your initial in it.
7. Declare a String variable with your location, then change
its value and print it again.
8. Create an int variable called a, another b, and print their
sum.
9. Print the type of two previously created variables.
10. Try declaring a variable without initializing it and then
assign it a value before printing it.
 */

public class VarAndConsExercises {
    public static void main(String[] args) {

        // My solutions will go here:
        // Exercise 1:
        String myName = "Brayan";
        System.out.println("My name is: " + myName);
        // Exercise 2:
        int myAge = 25;
        System.out.println("My age is: " + myAge);
        // Exercise 3:
        double myHigh = 1.7;
        System.out.println("My high is:" + myHigh);
        // Exercise 4:
        boolean isFun = true;
        System.out.println("Programming is fun:" + isFun);
        // Exercise 5:
        final String myEmail = "bramau@gmail.com";
        System.out.println("My email is: " + myEmail);
        // Exercise 6:
        char myFirstName = 'B';
        System.out.println("My first letter name is:" + myFirstName);
        // Exercise 7:
        String myTown = "Oroya";
        System.out.println("My town is: " + myTown);
        myTown = "Yauli";
        System.out.println("Upss! my town is: " + myTown);
        // Exercise 8:
        int aNumber = 10;
        int bNumber = 20;
        int cNumber;
        cNumber = aNumber + bNumber;
        System.out.println(cNumber);
        // Exercise 9:
        Boolean hasHead = true;
        String myCharacter = "Aladino";
        System.out.println(myCharacter.getClass().getSimpleName());
        System.out.println(hasHead.getClass().getSimpleName());
        // Exercise 10:
        final int MY_NUMBER;
        MY_NUMBER = 18;
        System.out.println(MY_NUMBER);

        // Other exercises:
        var myCity = "Paris";
        var myYear = 1980;
        System.out.println(myCity);
        System.out.println(myYear);













    }
}
