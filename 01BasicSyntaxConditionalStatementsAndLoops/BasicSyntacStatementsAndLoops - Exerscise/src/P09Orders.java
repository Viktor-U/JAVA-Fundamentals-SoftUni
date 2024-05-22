import java.util.Scanner;

public class P09Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());
        double total = 0;

        for (int i = 0; i < num; i++) {
            double pricePerCapsule = Double.parseDouble(scanner.nextLine());
            int days = Integer.parseInt(scanner.nextLine());
            int capsulesCount = Integer.parseInt(scanner.nextLine());

            double sum = days * capsulesCount * pricePerCapsule;
            total += sum;
            System.out.printf("The price for the coffee is: $%.2f%n", sum);
        }
        System.out.printf("Total: $%.2f", total);

    }
}
