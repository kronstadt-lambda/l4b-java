package basic.c07_oop;

public class Student extends Person{

    // Attributes
    private int grade;
    private double score;

    // Constructors
    public Student(String name, Integer age, String id, int grade, double score) {
        super(name, age, id);
        this.grade = grade;
        this.score = score;
    }

    // Methods
    public void checkPassStatus() {
        if (score >= 60.0) {
            System.out.println(name + " has passed with a score of " + score);
        } else {
            System.out.println(name + " has failed with a score of " + score);
        }
    }
    public void study() {
        System.out.println(name + " is studying");
    }

    // Getters and Setters
    public int getGrade() {
        return grade;
    }
    public void setGrade(int grade) {
        this.grade = grade;
    }
    public double getScore() {
        return score;
    }
    public void setScore(double score) {
        this.score = score;
    }
}
