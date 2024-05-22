import java.util.Scanner;

public class P09SumOfOddNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numOfOdd = Integer.parseInt(scanner.nextLine());
        int a = 1;
        int sum = 0;

        for (int i = 0; i < numOfOdd; i++) {

            System.out.println(a);
            sum += a;
            a += 2;

        }
        System.out.println("Sum: "+ sum);
    }
}
