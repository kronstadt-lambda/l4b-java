package basic.c07_oop;

public class Animal {

    // Attributes
    protected String name;
    protected int age;
    protected String gender;

    // Constructor
    public Animal(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    // Methods
    public void makeSound() {
        System.out.println("Animal " + name + " make a sound");
    }
    public void eat() {
        System.out.println("Animal " + name + " is eating");
    }
}
