package c02_operators;
public class Operators {
    public static void main(String[] args) {
        // Operators

        // Arithmetics
        var my1Value = 15;
        var my2Value = 6;
        System.out.println("the sum is: " + (my1Value +  my2Value)); // arithmetic sum success inside ().
        System.out.println("the subtraction is: " + (my1Value -  my2Value));
        System.out.println("the multiply is: " + (my1Value *  my2Value));
        System.out.println("the division is: " + (my1Value / my2Value)); // truncated division
        System.out.println("the module is: " + (my1Value % my2Value));

        // Power operation using Math.pow(base, exponent)
        System.out.println("2 to the power of 3 is: " + (int) Math.pow(2, 3));
        // Square root operation using Math.sqrt()
        System.out.println("Square root of 16 is: " + Math.sqrt(16));

        // Assignment operators
        var my3Value = my2Value*2; // assignment operator
        System.out.println("the 3th value is: " + (my3Value));

        my3Value += 1; // direct assignment
        System.out.println("the 3th new value is: " + (my3Value));

        my3Value -= 1; // direct assignment
        System.out.println("the 3th new value is: " + (my3Value));

        my3Value *= 2; // direct assignment
        System.out.println("the 3th new value is: " + (my3Value));

        my3Value /= 2; // direct assignment
        System.out.println("the 3th new value is: " + (my3Value));

        my3Value %= 2; // direct assignment
        System.out.println("the 3th new value is: " + (my3Value));

        // Relational operators
        System.out.println("Is equal?: " + (my1Value == my2Value));
        System.out.println("Is diff?: " + (my1Value != my2Value));
        System.out.println("Is less that?: " + (my1Value < my2Value));
        System.out.println("Is less or equal that?: " + (my1Value <= my2Value));
        System.out.println("Is greater that?: " + (my1Value > my2Value));
        System.out.println("Is greater or equal that?: " + (my1Value > my2Value));

        // Logical operators (boolean operators)
        boolean isTrue = true;
        boolean isFalse = false;

        System.out.println("&&: " + (isTrue && true)); // logical and
        System.out.println("||: " + (isTrue || isFalse)); // logical or
        System.out.println("!: " + (!isTrue)); // logical not
        System.out.println("!!: " + (!(!isTrue))); // logical not, not

        // Unary operators
        var myUnaryValue = -10;
        System.out.println("+: " + (+myUnaryValue));     // myUnaryValue = -10, print (-10)
        System.out.println("-: " + (-myUnaryValue));     // myUnaryValue = 10, print (10)
        System.out.println("++: " + (++myUnaryValue));   // myUnaryValue = -9, print (-9)
        System.out.println("_++: " + (myUnaryValue++));  // myUnaryValue = -8, print (-9)
        System.out.println("--: " + (--myUnaryValue));   // myUnaryValue = -9, print (-9)
        System.out.println("_--: " + (myUnaryValue--));  // myUnaryValue = -10, print (-9)
        System.out.println("final value: " + (myUnaryValue));




    }
}
