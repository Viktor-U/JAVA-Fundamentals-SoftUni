import java.util.Scanner;

public class P01ConvertMetersToKilometers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


       int km = Integer.parseInt(scanner.nextLine());

       double meters = km / 1000.0;

        System.out.printf("%.2f", meters);




    }
}