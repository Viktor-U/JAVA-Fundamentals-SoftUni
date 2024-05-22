import java.util.Scanner;

public class P10SpecialNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= num; i++) {

            System.out.printf("%d -> ", i);
            int firstDigit = i % 10;
            int secondDigit = i / 10;

            if (firstDigit + secondDigit == 5 || firstDigit + secondDigit == 7 || firstDigit + secondDigit == 11 ){
                System.out.println("True");
            }else {
                System.out.println("False");
            }

        }


    }
}
