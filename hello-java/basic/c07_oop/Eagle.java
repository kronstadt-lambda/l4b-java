package basic.c07_oop;

public class Eagle extends Bird {

    // Constructor
    public Eagle(String name, int age, String gender) {
        super(name, age, gender);
    }

    // Methods
    @Override
    public void fly() {
        super.fly();
        System.out.println("My eagle " + name + " is flying now.");
    }

}
