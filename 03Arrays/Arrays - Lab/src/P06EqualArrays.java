import java.util.Arrays;
import java.util.Scanner;

public class P06EqualArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int [] firstArr = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();

        int [] secondArr = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();


        int sumOfArr = 0;
        int indexBreak = -1;

        for (int i = 0; i < firstArr.length; i++) {

            if (firstArr[i] == secondArr[i]){
                sumOfArr += firstArr[i];
            }else {
                indexBreak = i;
                break;
            }
        }

        if (indexBreak == -1 ){
            System.out.printf("Arrays are identical. Sum: %d",sumOfArr);
        }else {
            System.out.printf("Arrays are not identical. Found difference at %d index.",indexBreak);
        }





    }
}
