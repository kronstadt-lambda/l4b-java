package basic.c07_oop;

public class Car extends Vehicle {

    // Attributes
    private String brand;
    private String model;
    private int year;
    private int horsePower;
    private double speed;

    // Constructor
    public Car(String brand, String model, int year, int horsePower, double speed) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.horsePower = horsePower;
        this.speed = speed;
    }

    // Methods
    public void showData() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
        System.out.println("Horse power: " + horsePower);
    }

    public void accelerate(int amount) {
        if (speed + amount > 120) {
            System.out.println("Car is already at max speed");
            speed = 120;
            return;
        }
        speed += amount;
    }

    public void brake(int amount) {
        if (speed - amount < 0) {
            System.out.println("Car is already at min speed");
            speed = 0;
            return;
        }
        speed -= amount;
    }

    public void stop() {
        speed = 0;
    }

    public void getSpeed() {
        System.out.println("Speed: " + speed);
    }

    public void honk() {
        System.out.println("Car honking");
    }
    @Override
    public void describe() {
        super.describe();
        System.out.println("... And is a car that..");
    }
}
