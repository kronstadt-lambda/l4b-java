package basic.c07_oop;

/**
 * DISCLAIMER: As a best practice, each class should be created in its own file
 * with the same name as the class (Person.java for Person class) for better
 * organization and maintenance.
 * <p>
 * BEST PRACTICES FOR CLASS CONSTRUCTION:
 * 1. Follow naming conventions: Use PascalCase for class names
 * 2. Keep classes focused and single-responsibility
 * 3. Make fields private and provide getters/setters when needed
 * 4. Use meaningful names for classes, fields, and methods
 * 5. Include proper documentation and comments
 * <p>
 * RECOMMENDED CLASS STRUCTURE:
 * 1. Package declaration
 * 2. Import statements
 * 3. Class documentation
 * 4. Class declaration
 * 5. Constants/Static fields
 * 6. Instance variables
 * 7. Constructors
 * 8. Methods (grouped by functionality)
 * 9. Inner classes (if any)
 * <p>
 * IMPORTANCE OF CONSTRUCTORS:
 * Constructors are special methods that:
 * 1. Initialize the object state when created
 * 2. Ensure proper object setup
 * 3. Can enforce required parameters
 * 4. Allow different initialization options
 * 5. Help maintain object consistency
 * <p>
 * UNDERSTANDING 'THIS' KEYWORD:
 * The 'this' keyword in Java refers to the current instance of the class.
 * It is commonly used to:
 * 1. Differentiate between instance variables and parameters
 * 2. Pass the current instance to another method
 * 3. Call another constructor of the same class
 * 4. Return the current instance from a method
 */


public class Person {
    // Attributes. The attributes are the data that the class holds.
    // ACCESS MODIFIER BEST PRACTICES:
    // 1. Use 'private' for most instance variables to enforce encapsulation
    // 2. Use 'protected' if subclasses need direct access
    // 3. Avoid 'public' attributes to prevent direct manipulation from outside
    // 4. Use 'final' for constants or values that shouldn't change
    // 5. Use getters/setters to control access to private fields
    protected String name;
    protected Integer age;
    protected final String id; // final ensures that the value won't change' inside the class

    // Constructors. The constructors are special methods that are used to initialize
    // CONSTRUCTOR ACCESS MODIFIER BEST PRACTICES:
    // 1. Use 'public' for constructors that should be accessible from anywhere
    // 2. Use 'private' for constructors in singleton pattern or utility classes
    // 3. Use 'protected' if only subclasses should be able to create instances
    // 4. Package-private (no modifier) if only classes in the same package should instantiate
    // 5. Consider using factory methods if complex object creation logic is needed
    public Person(String name, Integer age, String id) {
        // 'this.name' refers to the instance variable, while 'name' refers to the parameter
        // Using 'this' helps avoid naming conflicts and clearly shows which is which
        this.name = name;
        this.setAge(age);
        this.id = id;
    }
    
    // Methods. The methods are the behavior of the class.
    public void sayHello() {
        System.out.println("Hello, my name is " + name + " and I'm " + age + " years old.");
    }
    public void sayId() {
        System.out.println("My ID is " + id);
    }

    // Getters
    public String getName() {
        return name;
    }
    public Integer getAge() {
        return age;
    }
    // Setters
    public void setName(String name) {
        this.name = name;
    }
    public void setAge(Integer age) {
        if (age < 0) {
            throw new IllegalArgumentException("Age cannot be negative");
        }
        this.age = age;
    }


}
