package basic.c07_oop;

/**
 1. Create a Person class with private attributes name and age.
 Use the methods getName(), setName(), getAge() and setAge()
 to assign and display values from another class.
 2. Create a Product class with the private attribute price.
 Add the setPrice(double price) method that only allows
 prices greater than 0.
 3. Create a BankAccount class with the private attribute
 balance. Implement the deposit(double amount) and
 withdraw(double amount) methods that validate the amounts
 correctly.
 4. Create a Book class with the private attribute title. Allow
 reading it with the getTitle() method but not modifying it
 (no setTitle()). The title should only be assigned through
 the constructor.
 5. Create a Temperature class with the private attribute
 celsius. The setCelsius(double celsius) method should only
 accept values between -100 and 100.
 6. Create a User class with private attributes username and
 password. Implement the methods setUsername(String username),
 setPassword(String password) and checkPassword(String
 inputPassword) that compares passwords.
 7. Create an Employee class with the private attribute salary.
 Add the raiseSalary(double percent) method that only allows
 positive increases.
 8. Create a Rectangle class with private attributes width
 and height. Add setters and the calculateArea() method that
 returns the result of width * height.
 9. Create a Student class with the private attribute grade.
 Add the methods setGrade(int grade) and isPassed() that
 returns true if the grade is greater than or equal to 60.
 10. Create a Car class with the private attribute speed.
 Add the accelerate(int amount) methods that increases
 speed (maximum 120) and brake(int amount) that reduces
 speed (minimum 0).
 */

public class AccessModifiersExercises {
    public static void main(String[] args) {
        // Exercise 1:
        System.out.println("Exercise 1:");
        var myFirstPerson = new Person("Maria", 20, "12345A");
        System.out.println("My name is: " + myFirstPerson.getName());
        System.out.println("I'm " + myFirstPerson.getAge() + " years old.");
        myFirstPerson.setName("John");
        myFirstPerson.setAge(25);
        System.out.println("My new name is: " + myFirstPerson.getName());
        System.out.println("I'm " + myFirstPerson.getAge() + " years old.");

        // Exercise 2:
        System.out.println("Exercise 2:");
        var myProduct = new Product("Cell Phone", -100,0.2);
        System.out.println( "The final price is :" + myProduct.getPriceWithDiscount());

        // Exercise 3:
        System.out.println("Exercise 3:");
        var myBalance = new BankAccount(500);
        myBalance.getBalance();
        myBalance.deposit(200);
        myBalance.withdraw(800);
        myBalance.getBalance();

        // Exercise 4:
        System.out.println("Exercise 4");
        var myFavoriteBook = new Book("The Hobbit", "J.R.Tolkien", 1937);
        System.out.println("The title of book is: " + myFavoriteBook.getTitle());

        // Exercise 5:
        System.out.println("Exercise 5");
        var myTemperature = new Temperature(10);
        System.out.println("The current temperature in Celsius is: " + myTemperature.getCelsius());

        // Exercise 6:
        System.out.println("Exercise 6");
        var myUser = new User("bramau", "123456789");
        myUser.checkPassword("222222222");

        // Exercise 7:
        System.out.println("Exercise 7");
        var myEmployee = new Employee("Erick", 300);
        System.out.println("The current salary is :" + myEmployee.getSalary());
        myEmployee.raiseSalary(50);
        System.out.println("The current salary is :" + myEmployee.getSalary());

        // Exercise 8:
        System.out.println("Exercise 8");
        var myRectangule = new Rectangle("rectangule",120, 24);
        myRectangule.getAreaAndPerimeter();

        // Exercises 9:
        System.out.println("Exercise 9");
        var thisStudent = new Student("Juan", 15, "1256A", 6, 50);
        thisStudent.checkPassStatus();

        // Exercise 10:
        System.out.println("Exercise 10");
        var myCar = new Car("Ford", "Mustang", 1995, 1500, 100);
        myCar.showData();
        myCar.accelerate(100);
        myCar.getSpeed();
        myCar.brake(50);
        myCar.getSpeed();
        myCar.brake(70);
        myCar.getSpeed();
    }
}
