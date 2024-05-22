import java.text.DecimalFormat;
import java.util.Scanner;

public class P08MathPower {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double a = Double.parseDouble(scanner.nextLine());
        double n = Double.parseDouble(scanner.nextLine());

        DecimalFormat result = new DecimalFormat("0.##########");
        double mathPower = mathPower(a, n);
        System.out.println(result.format(mathPower));

    }

    public static double mathPower(double a, double n){
        double result = 1;
        for (int i = 0; i < n ; i++) {
            result *= a;
        }
        return result;
    }
}
