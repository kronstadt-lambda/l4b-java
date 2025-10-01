package c05_functions;

/**
 * DISCLAIMER: Function overloading should be used judiciously and only when it genuinely improves code readability
 * and maintainability. While it's useful for scenarios like different parameter types or varying parameter counts
 * for the same logical operation, overusing it can lead to confusion and maintenance difficulties. Consider using
 * distinct method names when operations are conceptually different, even if parameters are similar.
 */
public class Functions {
    public static void main(String[] args) {

        // Use functions
        for (int i = 0; i < 3; i++) {
            sendEmail();
        }

        sendEmailToUser("brayan@gmail.com");

        sendEmailToUserWithMessage("maurer@gmail.com", "Hello, good morning");

        var state = successfulSubmission();
        System.out.println("Email sent successfully: " + state);

        var itState = successfulSubmission("brayan@gmail.com", "Hello, good morning");
        System.out.println("Email sent successfully: " + itState);

        var state3 = successfulSubmission(" ", "Hello, good morning");
        System.out.println("Email sent successfully: " + state3);
    }
    // Function without parameters and return type
    public static void sendEmail() {
        System.out.println("Sending email...");
    }
    // Function with a parameter but without a return type
    public static void sendEmailToUser(String email) {
        System.out.println("Sending email to " + email);
    }
    // Function with parameters but without a return type
    public static void sendEmailToUserWithMessage(String email, String message) {
        System.out.println("Sending email to " + email + " with message: " + message);
    }
    // Function with return type
    public static boolean successfulSubmission() {
        return true;
    }
    // Function with parameters and return type
    public static boolean successfulSubmission(String email, String message) {
        if (email.isEmpty()) {
            return false;
        }
        System.out.println("Sending email to " + email + " with message: " + message);
        return true;
    }


    

}
