package basic.c07_oop;

public class AccessModifiers {
    public static void main(String[] args) {

        // Encapsulation (access modifiers): They define the scope of the variables and methods or visibility's level.
        // - private: Use for internal class implementation details
        //   * Instance variables to enforce encapsulation
        //   * Helper methods that shouldn't be called from outside
        //   * Best practice: Make all fields private and provide getters/setters if needed

        // - protected: Use when you want to allow access to child classes or same package classes
        //   * Methods that should be accessible to subclasses
        //   * Fields that need to be inherited
        //   * Best practice: Use sparingly, prefer private when possible

        // - public: Use for APIs and interfaces that other classes need to access
        //   * Public interfaces and API methods
        //   * Constants that need global access
        //   * Best practice: Minimize public members to reduce coupling

        // - package private (default): Use for classes that work together in the same package
        //   * Classes that are implementation details of a package
        //   * Methods that should only be called by related classes
        //   * Best practice: Use when functionality should be shared only within package

        /** Example class structure:

        public class Example {
            private int internalData;              // Only accessible within this class
            protected String inheritableField;     // Accessible by subclasses

            public void publicMethod() {
            }          // Accessible by any class

            void packageMethod() {
            }               // Accessible only within package
        }
         */

        var myPerson = new Person("Brayan", 25, "12345A");
        myPerson.sayHello();
        myPerson.sayId();

        // With a protected access modifier for 'name'.
//        myPerson.name = "Mauricio";
//        myPerson.sayHello();

        // Getters and setters: there are different methods for access to variables.





    }
}
