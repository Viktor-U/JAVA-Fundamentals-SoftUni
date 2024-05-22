
import java.util.Arrays;
import java.util.Scanner;

public class P07MaxSequenceOfEqualElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int [] numArr = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();


        int longestSequence = 0;
        int lastNum = -23213123;
        int result = 0;
        int result2 = -32323;

        for (int j : numArr) {

            if (j == lastNum) {

                longestSequence++;
            } else {
                longestSequence = 0;

            }
            lastNum = j;
            if (longestSequence > result) {
                result = longestSequence;
                result2 = lastNum;
            }

        }
        int [] finalArr = new int[result + 1];

        Arrays.fill(finalArr, result2);

        for (int i : finalArr) {
            System.out.print(i + " ");
        }

    }
}
