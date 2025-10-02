package basic.c07_oop;

public class User {

    // Attributes
    private String username;
    private String password;

    // Constructor
    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    // Methods
    public void checkPassword(String password) {
        if (this.password.equals(password)) {
            System.out.println("Password is correct");
        } else {
            System.out.println("Password is incorrect");
        }
    }

    // Getters and setters
    public void setUsername(String username) {
        this.username = username;
    }
    public void setPassword(String password) {
        this.password = password;
    }

}
