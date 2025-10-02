package basic.c07_oop;

public class Dog extends Animal{

    // Attributes
    String breed;

    // Constructor
    public Dog(String name, int age, String gender, String breed) {
        super(name, age, gender);
        this.breed = breed;
    }

    // Methods
    public void bark() {
        System.out.println("Woof!");
    }

    @Override
    public void makeSound() {
        super.makeSound();
        System.out.println("My dog " + name + " make a sound - woof");
    }
}
