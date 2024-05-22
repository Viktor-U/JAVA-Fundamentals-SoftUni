import java.text.DecimalFormat;
import java.util.Scanner;

public class P11MathOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double a = Double.parseDouble(scanner.nextLine());
        char operator = scanner.nextLine().charAt(0);
        double b = Double.parseDouble(scanner.nextLine());

        double result = 0;

        switch (operator){
            case '/':
                result = divide(a, b);
                break;
            case '*':
                result = multiply(a, b);
                break;
            case '-':
                result = subtract(a, b);
                break;
            case '+':
                result = add(a, b);
                break;
        }
        System.out.println(new DecimalFormat("0.##").format(result));
    }

    public static double divide (double a, double b) {
        return a / b;
    }
    public static double multiply (double a, double b) {
        return a * b;
    }
    public static double subtract (double a, double b) {
         return a -b;
    }
    public static double add (double a, double b) {
        return a + b;
    }

}
