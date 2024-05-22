import java.util.Scanner;

public class P04ArraysRotation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String [] numArr = scanner.nextLine().split(" ");//51 47 32 61 21
        int n = Integer.parseInt(scanner.nextLine());


        for (int i = 0; i < n; i++) {
            String firstElement = numArr[0];

            for (int j = 0; j < numArr.length - 1; j++) {

                numArr[j]=numArr[j+1];

            }
            numArr[numArr.length-1]= firstElement;

        }

        System.out.println(String.join(" ",numArr));


    }
}
