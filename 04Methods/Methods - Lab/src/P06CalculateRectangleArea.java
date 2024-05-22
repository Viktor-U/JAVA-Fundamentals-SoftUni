import java.util.Scanner;

public class P06CalculateRectangleArea {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());

        int area = areaCalculator(a, b);
        System.out.println(area);

    }

    public static int areaCalculator(int a, int b) {
        return a * b;
    }
}
