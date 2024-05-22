import java.util.Arrays;
import java.util.Scanner;

public class P03SumEvenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int [] numArr = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int sum = 0;

        for (int j : numArr) {
            if (j % 2 == 0) {
                sum += j;
            }
        }

        System.out.println(sum);




    }
}
