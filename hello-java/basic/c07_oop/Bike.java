package basic.c07_oop;

public class Bike extends Vehicle{

    // Methods
    @Override
    public void describe() {
        super.describe();
        System.out.println("... And is a bike that..");
    }
}
