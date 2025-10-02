package basic.c07_oop;
/**
 1. Create a Book class with title and author attributes. Create an object and display its data.
 2. Create a Dog class with a bark() method that prints its sound.
 3. Add a constructor to the Book class that receives title and author.
 4. Create a Car class with brand and model attributes and a showData() method.
 5. Create a Student class with score attribute and a method that tells if passed (greater than or equal to 60).
 6. Create a BankAccount class with balance attribute and a deposit() method that adds to the balance.
 7. Create a Rectangle class with methods to calculate area and perimeter.
 8. Create a Worker class that receives name and salary, and a method to show their salary.
 9. Create several Person objects and store them in an ArrayList.
 10. Create a Product class and a method that applies a discount to its price.
 */

import java.util.ArrayList;

public class ClassesExercises {
    public static void main(String[] args) {
        // Exercises 1:
        var myBook = new Book("The Old man and the sea", "Ernest Hemingway", 1952);
        myBook.printBook();

        // Exercises 2:
        var myDog = new Dog("bibi", 5, "female" ,"golden retriever");
        myDog.bark();

        // Exercises 3:
        // pass

        // Exercises 4:
        var myCar = new Car("Ford", "Mustang", 1995, 1500, 100);
        myCar.showData();

        // Exercises 5:
        var thisStudent = new Student("Juan", 15,"12456A", 6, 50);
        thisStudent.checkPassStatus();

        // Exercises 6:
        var myBankAccount = new BankAccount(2000);
        myBankAccount.deposit(1000);
        myBankAccount.getBalance();

        // Exercises 7:
        var myRectangle = new Rectangle("rectangule",2,8);
        myRectangle.getAreaAndPerimeter();

        // Exercises 8:
        var thisWorker = new Worker("Pedro","Chef", 10000);
        thisWorker.showSalary();

        // Exercises 9:
        var myPersonList = new ArrayList<Person>();
        myPersonList.add(new Person("Brayan",18, "12345A"));
        myPersonList.add(new Person("Maurcio",29, "12345B"));
        myPersonList.add(new Person("Quino",38, "12345C"));
        myPersonList.add(new Person("Abascal",22, "12345D"));
        for (Person person: myPersonList) {
            person.sayHello();
        }

        // Exercises 10:
        var myProduct = new Product("Cell Phone", 100,0.2);
        System.out.println( "The final price is :" + myProduct.getPriceWithDiscount());

    }
}
