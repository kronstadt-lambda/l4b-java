/*
1. Create a variable with the result of each arithmetic operation.
2. Create a variable for each type of assignment operation.
3. Print 3 true comparisons with different comparison operators.
4. Print 3 false comparisons with different comparison operators.
5. Use the logical AND operator.
6. Use the logical OR operator.
7. Combine both logical operators.
8. Add some negation.
9. Print 3 examples of unary operator usage.
10.Combine arithmetic, comparison and logical operators.
 */
public class OperatorsExercises {
    public static void main(String[] args) {

        // My solutions will go here:
        // Exercise 1:
        var my1Value = 6;
        var my2Value = 3;
        var my3Value = 4;
        my3Value = my1Value + my2Value;
        System.out.println(my3Value);
        my3Value = my1Value - my2Value;
        System.out.println(my3Value);
        my3Value = my1Value * my2Value;
        System.out.println(my3Value);
        my3Value = my1Value / my2Value;
        System.out.println(my3Value);

        // Exercise 2:
        var my4Value = my1Value;
        my4Value += my4Value;
        System.out.println(my4Value);

        // Exercise 3:
        var my5Value = 12;
        System.out.println(my5Value == my4Value);
        System.out.println(my5Value > my1Value);
        System.out.println(my5Value < (my2Value*my1Value));

        // Exercise 4:
        var my6Value = -100;
        System.out.println(my6Value == my4Value);
        System.out.println(my6Value > my1Value);
        System.out.println(-my6Value < (my2Value*my1Value));

        // Exercise 5:
        var isTrue = true;
        System.out.println((5 > 6) && isTrue);

        // Exercise 6:
        var isFalse = false;
        System.out.println( !isFalse || (10 == 20));

        // Exercise 7:
        System.out.println( (5 < 10) && (30 > 20) || (isTrue == isFalse));

        // Exercise 8:
        System.out.println("Negation of True: " + (!isTrue));

        // Exercise 9:
        var my7Value = 0;
        System.out.println(++my7Value + my7Value);
        System.out.println(--my7Value + my7Value);
        System.out.println(my7Value--);
        System.out.println(my7Value);

        // Exercise 10:
        System.out.println((my2Value + my1Value < 10) && (my7Value * 5 > 20) || (isTrue == !isFalse));
    }
}
