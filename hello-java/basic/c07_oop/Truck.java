package basic.c07_oop;

public class Truck extends Vehicle{
    @Override
    public void describe() {
        super.describe();
        System.out.println("... And is a truck that..");
    }
}
