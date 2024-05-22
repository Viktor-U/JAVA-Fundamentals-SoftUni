package ExamSumeya;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class P033 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //-2, 2, 1, 5, 9, 3, 2, -2, 1, -1, -3, 3
        int[] integerArr = Arrays .stream(scanner.nextLine().split(", ")) .mapToInt(Integer::parseInt) .toArray();
        int entryPoint = Integer.parseInt(scanner.nextLine());//7
        String type = scanner.nextLine();
        int entryNum = integerArr[entryPoint];//-2

        //-2, 2, 1, 5, 9, 3, 2,
        List<Integer> leftSide = new ArrayList<>();
        //1, -1, -3, 3
        List<Integer> rightSide = new ArrayList<>();

        for (int i = 0; i < entryPoint; i++) {

            leftSide.add(integerArr[i]);

        }

        for (int i = entryPoint + 1; i < integerArr.length ; i++) {

            rightSide.add(integerArr[i]);

        }
        int leftSum = 0;
        int rightSum = 0;

        if (type.equals("expensive")){

            for (Integer leftNum : leftSide) {

                if (leftNum >= entryNum){
                    leftSum += leftNum;
                }

            }

            for (Integer rightNum : rightSide) {

                if (rightNum >= entryNum){
                    rightSum += rightNum;
                }

            }


        }else if (type.equals("cheap")){

            for (Integer leftNum : leftSide) {

                if (leftNum < entryNum){
                    leftSum += leftNum;
                }

            }

            for (Integer rightNum : rightSide) {

                if (rightNum < entryNum){
                    rightSum += rightNum;
                }

            }

        }

        if (leftSum >= rightSum){
            System.out.println("Left - " + leftSum);
        }else {
            System.out.println("Right - " + rightSum);
        }




    }
}