import java.util.Scanner;

public class P04PrintAndSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());
        int num2 = Integer.parseInt(scanner.nextLine());

        int sum = 0;

        for (int i = num; i <= num2; i++) {
            System.out.print(i + " ");
            sum += i;
        }

        System.out.printf("%nSum: %d", sum);
    }
}
