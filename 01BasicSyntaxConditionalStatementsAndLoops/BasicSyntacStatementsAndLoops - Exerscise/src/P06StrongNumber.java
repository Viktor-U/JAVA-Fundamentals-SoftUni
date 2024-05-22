import java.util.Scanner;

public class P06StrongNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());
        String num1 = String.valueOf(num);
        int sum = 0;


        for (int i = num1.length() - 1; i >= 0  ; i--) {
            char number = num1.charAt(i);
            int a = Integer.parseInt(String.valueOf(number));
            int sum1 = a;
            if (a != 0) {
                for (int j = a - 1; j >= 1; j--) {

                    sum1 = j * sum1;
                }
                sum += sum1;
            }else {
                sum++;
            }
        }

        if (sum == num){
            System.out.println("yes");
        }else {
            System.out.println("no");
        }



    }
}
