import java.util.Scanner;

public class P02Division {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());
        int a = 0;
        boolean isDivision = true;

        if (num % 10 == 0){
            a = 10;
            isDivision = false;
        } else if (num % 7 == 0) {
            a = 7;
            isDivision = false;
        } else if (num % 6 == 0) {
            a = 6;
            isDivision = false;
        } else if (num % 3 == 0) {
            a = 3;
            isDivision = false;
        } else if (num % 2 == 0) {
            a = 2;
            isDivision = false;
        }

        if (isDivision){
            System.out.println("Not divisible");
        }else {
            System.out.printf("The number is divisible by %d", a);
        }

    }
}
