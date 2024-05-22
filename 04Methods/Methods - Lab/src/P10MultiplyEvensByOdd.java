import java.util.Arrays;
import java.util.Scanner;

public class P10MultiplyEvensByOdd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int input = Integer.parseInt(scanner.nextLine());
        String needInput = String.valueOf(Math.abs(input));
        int [] numArr = Arrays.stream(needInput.split("")).mapToInt(Integer::parseInt).toArray();

        int result = odd(numArr) * even(numArr);

        System.out.println(result);

    }

    public static int odd (int [] arr) {

        int sumOdd = 0;
        for (int el : arr) {
            if (el % 2 == 0){
                sumOdd+=el;
            }
        }

        return sumOdd;
    }

    public static int even (int [] arr) {

        int sumEven = 0;
        for (int el : arr) {
            if (el % 2 != 0){
                sumEven+=el;
            }
        }

        return sumEven;
    }
}
