package c00;
/*
Exercises:
1. Print a message with your name instead of "Hello World!".
2. Print two lines: "Hello" and then "World" with a single
println.
3. Add a comment explaining what each line of the program does.
4. Create a multi-line comment.
5. Print your age, favorite color and city.
6. Explore different System.XXX.println(); beyond "out".
7. Use multiple println to print a phrase.
8. Print an ASCII design (for example, a smiley face using
symbols).
9. Try running the program without the main method and observe
the error.
10. Try changing the file name to something different from the
class name and compile it. What happens?
 */

//program class
public class HelloJavaExercises {
//  main class
    public static void main(String[] args) {
        // My solutions will go here:
        // Exercise 1:
        System.out.println("Kronstadt"); // This sentence prints the name in a simple line
        // Exercise 2:
        System.out.println("Hello \n World"); // This sentence prints a phrase in two lines
        // Exercise 4:
        /*
        Fourth exercise complete ...
        Now we resolve the fifth exercise ...
         */
        // Exercise 5:
        System.out.println("I am in my thirties, my favorite color is green and my town is Lima");
        // Exercise 6:
        System.gc(); // Runs the garbage collector
        System.err.println("This is an error message"); // Prints to error output stream
        System.out.println("This is standard output"); // Prints to standard output stream

        // Exercise 7: Print a phrase using multiple println
        System.out.println("The journey");
        System.out.println("of a thousand miles");
        System.out.println("begins with");
        System.out.println("a single step");

        // Exercise 8: Emoticons using Unicode
        System.out.println("Basic emoticons: 😊 😄 😃");
        System.out.println("Expression emoticons: 😂 🤣 😅");
        System.out.println("Love emoticons: 😍 🥰 ❤️");
        System.out.println("Fun emoticons: 🤪 🤓 😎");
        System.out.println("Animal emoticons: 🐱 🐶 🐼");

    }
}
