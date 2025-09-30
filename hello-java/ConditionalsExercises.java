/*
1. Set a user's age and show if they can vote (must be 18 or older).
2. Declare two numbers and show which one is greater, or if they are
equal.
3. Given a number, verify if it's positive, negative or zero.
4. Create a program that determines if a number is even or odd.
5. Verify if a number is in the range of 1 to 100.
6. Declare a variable with the day of the week (1-7) and show its name using switch.
7. Simulate a grading system: show "Outstanding", "Passed" or "Failed" according to the grade (0-100).
8. Write a program that determines if you can enter the cinema: you must be at least 15 years old or be accompanied.
9. Create a program that determines if a letter is a vowel or consonant.
10. Use three variables a, b, c and show which one is the largest among them.
 */

public class ConditionalsExercises {
    public static void main(String[] args) {
        // Exercise 1:
        var userAge = 15;
        if (userAge >= 18) {
            System.out.println("You can vote!");
        } else {
            System.out.println("You can't vote!");
        }
        // Exercise 2:
        var my1Value = 8;
        var my2Value = 5;
        if (my1Value > my2Value) {
            System.out.println("my1Value is greater than my2Value");
        } else if (my1Value < my2Value) {
            System.out.println("my1Value is less than my2Value");
        } else {
            System.out.println("my1Value is equal to my2Value");
        }
        // Exercise 3:
        var myNumber = 10;
        if (myNumber > 0) {
            System.out.println("myNumber is positive");
        } else if (myNumber < 0) {
            System.out.println("myNumber is negative");
        } else {
            System.out.println("myNumber is zero");
        }
        // Exercise 4:
        var otherNumber = 9;
        if ((otherNumber % 2) == 0) {
            System.out.println("otherNumber is even");
        } else if ((otherNumber % 2) == 1) {
            System.out.println("otherNumber is odd");
        }
        // Exercise 5:
        var intNumber = 156;
        if (intNumber <= 100 && intNumber >= 0) {
            System.out.println("intNumber is between 0 and 100");
        } else {
            System.out.println("intNumber is not between 0 and 100");
        }
        // Exercise 6:
        var dayOfWeek = 6;
        switch (dayOfWeek) {
            case 1:
                System.out.println("The day is Monday");
                break;
            case 2:
                System.out.println("The day is Tuesday");
                break;
            case 3:
                System.out.println("The day is Wednesday");
                break;
            case 4:
                System.out.println("The day is Thursday");
                break;
            case 5:
                System.out.println("The day is Friday");
                break;
            case 6:
                System.out.println("The day is Saturday");
                break;
            case 7:
                System.out.println("The day is Sunday");
                break;
            default:
                System.out.println("Invalid day of the week");
        }

        // Exercise 7:
        var myGrade = 50;
        if (myGrade >= 80 && myGrade <= 100) {
            System.out.println("You got an outstanding grade!");
        } else if (myGrade >= 60 && myGrade < 80) {
            System.out.println("You got a passed grade!");
        } else if (myGrade < 60 && myGrade >= 0){
            System.out.println("You got a failed grade!");
        } else {
            System.out.println("Invalid grade!");
        }
        // Exercise 8:
        var myAge = 8;
        var isAcompained = true;
        if (myAge >= 15) {
            System.out.println("You can enter the cinema!");
        } else if (myAge < 15 && (isAcompained == true)) {
            System.out.println("You can enter the cinema!");
        } else {
            System.out.println("You can't enter the cinema!");
        }
        // Exercise 9:
        String myLetter = "a";
        if (myLetter.equalsIgnoreCase("a") || myLetter.equalsIgnoreCase("e") || myLetter.equalsIgnoreCase("i") || myLetter.equalsIgnoreCase("o") || myLetter.equalsIgnoreCase("u")) {
            System.out.println("The letter is a vowel");
        } else {
            System.out.println("The letter is a consonant");
        }
        // Exercise 10:
        var myFirstValue = 40;
        var mySecondValue = 40;
        var myThirdValue = 15;
        if ((myFirstValue > mySecondValue) && (myFirstValue > myThirdValue)) {
            System.out.println("myFirstValue is greater than mySecondValue and myThirdValue");
        } else if ((mySecondValue > myFirstValue) && (mySecondValue > myThirdValue)) {
            System.out.println("mySecondValue is greater than myFirstValue and myThirdValue");
        } else if ((myThirdValue > myFirstValue) && (myThirdValue > mySecondValue)){
            System.out.println("myThirdValue is greater than myFirstValue and mySecondValue");
        } else {
            System.out.println("myFirstValue, mySecondValue and myThirdValue are equal or there are two coincidence values");
        }

    }
}
