package basic.c07_oop;

public class Manager extends Employee{
    protected String department;
    // Constructor
    public Manager(String name, double salary, String department) {
        super(name, salary);
        this.department = department;
    }
}
