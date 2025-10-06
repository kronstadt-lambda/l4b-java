package basic.c09_bebugger;

public class DebuggerEssentials02 {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;

        int sum = suma(a,b);

        System.out.println("La suma de " + a + " y " + b + " es : " + sum);
    }

    private static int suma(int a, int b) {
        int result = a + b;

        int extraValue = 10;
        result += extraValue;

        return result;
    }
}
