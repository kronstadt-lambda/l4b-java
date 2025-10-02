package basic.c07_oop;

public class Temperature {

    // Atributes
    private double celsius;
    private double fahrenheit = (celsius * 9 / 5) + 32;

    // Constructor
    public Temperature(double celsius) {
        this.setCelsius(celsius);
    }

    // Methods
    public double getCelsius() {
        return celsius;
    }
    public double setCelsius(double celsius) {
        if (celsius > -100 && celsius < 100) {
            return this.celsius = celsius;
        } else {
            System.out.println("Invalid temperature");
            return -1;
        }
    }



}
