package basic.c07_oop;

public class Employee {

    // Attributes
    protected String name;
    protected Double salary;

    // Constructor
    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }
    // Methods
    public void showSalary() {
        System.out.println("Salary: " + salary);
    }
    public void raiseSalary(double percentage) {
        if (percentage < 0) {
            System.out.println("Invalid percentage");
            return;
        }
        this.salary = salary * (1 + percentage / 100);
    }

    // Getters and Setters
    public Double getSalary() {
        return salary;
    }
}
