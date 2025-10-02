package basic.c07_oop;

public class Product {

    // Attributes
    private String name;
    private double price;
    private double discount;

    // Constructor
    public Product(String name, double price, double discount) {
        this.name = name;
        this.setPrice(price);
        this.discount = discount;
    }

    // Methods
    public double getPriceWithDiscount() {
        if (price >= 80) {
            return price * (1 - discount);
        }
        return price;
    }

    // Getters and setters
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        if (price < 0) {
            System.out.println("Price cannot be negative");
            return;
        }
        this.price = price;
    }
    public double getDiscount() {
        return discount;
    }
    public void setDiscount(double discount) {
        this.discount = discount;
    }
}
