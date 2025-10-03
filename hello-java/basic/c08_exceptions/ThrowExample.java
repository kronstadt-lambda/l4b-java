package basic.c08_exceptions;

public class ThrowExample {

    public void checkAge(int age) throws IllegalArgumentException {
        if (age < 18) {
            throw new IllegalArgumentException("You can't vote!");
        } else {
            System.out.println("You can vote!");
        }
    }

    // Custom exception
    // When inheriting from Exception, the method must declare throws in its signature
    // When inheriting from RuntimeException, the method doesn't need to declare throws
    public void checkScore(int score) throws CustomException {
        if (score < 0 || score > 100) {
            throw new CustomException("Score is invalid!");
        } else {
            System.out.println("Score is valid!");
        }
    }
}
