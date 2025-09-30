public class Conditionals {
    public static void main(String[] args) {

        // Conditionals
        // if-else statement
        var myAge = 25;

        if (myAge >= 18) {
            System.out.println("You can vote!");
        } else {
            System.out.println("You can't vote!");
        }

        // switch statement
        var myColor = "green";

        switch (myColor) {
            case "red":
                System.out.println("Red color");
                break;
            case "green":
                System.out.println("Green color");
                break;
            case "blue":
                System.out.println("Blue color");
                break;
            default:
                System.out.println("Unknown color");
        }
    }
}
