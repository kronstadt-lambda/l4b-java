package basic.c07_oop;

public class Worker {

    // Attributes
    String name;
    String job;
    double salary;

    // Constructor
    public Worker(String name, String job, double salary) {
        this.name = name;
        this.job = job;
        this.salary = salary;
    }

    // Methods
    public void showSalary() {
        System.out.println("Salary: " + salary);
    }

}
