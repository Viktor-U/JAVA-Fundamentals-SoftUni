package Exam;

import java.util.Scanner;

public class P02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String [] vehicles = scanner.nextLine().split(">>");
        double totalTax = 0;

        for (int i = 0; i < vehicles.length; i++) {
            String [] car = vehicles[i].split(" ");
            int years = Integer.parseInt(car[1]);
            int km = Integer.parseInt(car[2]);
            double taxPay = 0;
            boolean isValid = true;

            switch (car[0]){
                case "family" :
                    int containKm = km / 3000;
                    taxPay = containKm * 12 + (50 - years * 5);
                    break;
                case "heavyDuty" :
                    int containKm2 = km / 9000;
                    taxPay = containKm2 * 14 + (80 - years * 8);
                    break;
                case "sports" :
                    int containKm3 = km / 2000;
                    taxPay = containKm3 * 18 + (100 - years * 9);
                    break;
                default:
                    System.out.println("Invalid car type.");
                    isValid = false;
            }
            if (isValid) {
                System.out.printf("A %s car will pay %.2f euros in taxes.%n", car[0], taxPay);
                totalTax += taxPay;
            }
        }

        System.out.printf("The National Revenue Agency will collect %.2f euros in taxes.", totalTax);

    }
}
