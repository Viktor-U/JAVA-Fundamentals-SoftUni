import java.util.Arrays;
import java.util.Scanner;

public class P06EqualsSums {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int [] numArr = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();//1 2 3 3

        for (int i = 0; i < numArr.length; i++) {

            int leftSum = 0;
            int rightSum = 0;


            for (int j = i + 1; j < numArr.length; j++) {

                rightSum += numArr[j];
            }

            for (int j = i - 1; j >= 0; j--) {
                leftSum += numArr[j];
            }
            if (leftSum == rightSum){
                System.out.println(i);

                return;
            }
        }
        System.out.println("no");




    }
}
