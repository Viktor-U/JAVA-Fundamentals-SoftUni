import java.util.Scanner;

public class P04SumOfChars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());

        int sum = 0;


        for (int i = 0; i < num; i++) {
            char symbol = scanner.nextLine().charAt(0);

            sum += symbol;
        }

        System.out.println("The sum equals: " + sum);
    }
}
