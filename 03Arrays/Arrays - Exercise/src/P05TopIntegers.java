import java.util.Arrays;
import java.util.Scanner;

public class P05TopIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int [] numArr = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();//1 4 3 2

        for (int i = 0; i < numArr.length; i++) {
            boolean isTopNum = false;

            if (i == numArr.length-1){
                System.out.print(numArr[i] + " ");
                break;
            }
            for (int j = i + 1; j < numArr.length; j++) {
                if (numArr[i] > numArr[j]){
                    isTopNum = true;
                }else {
                    isTopNum = false;
                    break;
                }
            }
            if (isTopNum) {
                System.out.print(numArr[i] + " ");
            }
        }




    }
}
