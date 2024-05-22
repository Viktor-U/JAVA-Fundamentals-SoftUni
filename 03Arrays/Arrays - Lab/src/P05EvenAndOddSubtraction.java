import java.util.Arrays;
import java.util.Scanner;

public class P05EvenAndOddSubtraction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int [] numArr = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();

        int oddSum = 0;
        int evenSum = 0;

        for (int i : numArr) {
            if (i % 2 == 0) {
                oddSum += i;
            } else {
                evenSum += i;
            }
        }

        System.out.println(oddSum - evenSum);





    }
}
