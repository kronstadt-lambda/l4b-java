package basic.c07_oop;

public class Bird extends Animal {

    // Constructor
    public Bird(String name, int age, String gender) {
        super(name, age, gender);
    }

    // Methods
    public void fly() {
        System.out.println("Flapping wings...");
    }
    @Override
    public void makeSound() {
        super.makeSound();
        System.out.println("My Bird " + name + " make a sound - tweet");
    }
}
