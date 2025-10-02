package basic.c07_oop;
/**
 1. Crea una clase Vehicle con un método move(). Luego crea
 una subclase Car que herede de Vehicle y agrega el método
 honk().
 2. Define una clase Person con los atributos name y age.
 Luego crea una clase Student que agregue el atributo grade
 y un método study().
 3. Crea una clase Animal con el método makeSound(). Haz que
 Dog diga “Woof” y Cat diga “Meow” sobrescribiendo ese
 método.
 4. La clase Employee tiene los atributos name y salary.
 Manager hereda de Employee y agrega el atributo
 department.
 5. Crea una clase abstracta Shape con un método
 calculateArea(). Luego implementa ese método en Circle y
 Rectangle.
 6. Crea una clase Bird con el método fly(). Luego crea Eagle
 que sobrescriba fly() pero también llame al método
 original con super.fly().
 7. Haz una clase Device con un constructor que imprima
 “Device created”. Luego crea Phone que herede de Device y
 en su constructor imprima “Phone ready”.
 8. Account tiene un saldo y métodos para deposit() y
 withdraw(). SavingsAccount hereda y agrega un método
 addInterest().
 9. Crea una clase Vehicle y tres subclases: Car, Bike y
 Truck, cada una con un método describe() sobrescrito.
 10.
 Crea un ArrayList<Animal> que contenga instancias de
 Dog, Cat y Bird. Recorre la lista y llama a makeSound(). 
 */


import java.util.ArrayList;

public class InheritanceExercises {
    public static void main(String[] args) {
        // Exercises 1:
        System.out.println("Exercise 1:");
        var myCar = new Car("Toyota", "Mustang", 2020, 2000,200);
        myCar.move();
        myCar.honk();

        // Exercises 2:
        System.out.println("Exercise 2:");
        var myStudent = new Student("Juan", 15,"12456A", 6, 50);
        myStudent.checkPassStatus();

        // Exercises 3:
        System.out.println("Exercise 3:");
        var myDog = new Dog("bobi", 5, "male","siberian");
        myDog.makeSound();

        // Exercises 4:
        System.out.println("Exercise 4:");
        var manager = new Manager("Gonzalo", 1200, "123456789");

        // Exercises 5:
        System.out.println("Exercise 5:");
        var myRectangle = new Rectangle("rectangle",20, 12);
        myRectangle.calculateArea();
        var myCircle = new Circle("circle", 10);
        myCircle.calculateArea();

        // Exercises 6:
        System.out.println("Exercise 6:");
        var myEagle = new Eagle("Abdula", 12, "female");
        myEagle.fly();

        // Exercises 7:
        System.out.println("Exercise 7:");
        var thePhone = new Phone();

        // Exercises 8:
        System.out.println("Exercise 8:");
        var mySavingAccount = new SavingsAccount(1200, 20.0);
        mySavingAccount.deposit(100);
        mySavingAccount.withdraw(50);
        mySavingAccount.getBalance();
        mySavingAccount.addInterest();
        mySavingAccount.getBalance();

        // Exercises 9:
        System.out.println("Exercise 9:");
        var myBike = new Bike();
        var myCar2 = new Car("Toyota", "Corolla", 2020, 2000,200);
        var myTruck = new Truck();
        myBike.describe();
        myCar2.describe();
        myTruck.describe();

        // Exercises 10:
        System.out.println("Exercise 10:");
        var myAnimalList = new ArrayList<Animal>();
        myAnimalList.add(new Dog("Gringo", 5,"male", "mestizo"));
        myAnimalList.add(new Bird("August", 10, "male"));
        for (Animal animal: myAnimalList) {
            animal.makeSound();
        }

    }
}
