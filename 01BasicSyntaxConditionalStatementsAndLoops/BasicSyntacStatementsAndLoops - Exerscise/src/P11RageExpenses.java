import java.util.Scanner;

public class P11RageExpenses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int lostGame = Integer.parseInt(scanner.nextLine());
        double headsetPrice = Double.parseDouble(scanner.nextLine());
        double mousePrice = Double.parseDouble(scanner.nextLine());
        double keyboardPrice = Double.parseDouble(scanner.nextLine());
        double displayPrice = Double.parseDouble(scanner.nextLine());

        double sum = 0;

        int times = 0;
        for (int i = 1; i <= lostGame; i++) {

            if (i % 2 == 0) {
                sum += headsetPrice;
            }
            if (i % 3 == 0) {
                sum += mousePrice;
            }
            if (i % 3 == 0 && i % 2 == 0) {
                sum += keyboardPrice;
                times++;
            }
            if (times % 2 == 0 && times != 0) {
                sum += displayPrice;
                times = 0;
            }
        }

        System.out.printf("Rage expenses: %.2f lv.", sum);


    }
}
