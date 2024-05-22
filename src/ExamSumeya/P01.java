package ExamSumeya;

import java.util.Scanner;

public class P01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countCities = Integer.parseInt(scanner.nextLine());
        double totalProfit = 0;

        for (int i = 1; i <= countCities; i++) {

            String cityName = scanner.nextLine();
            double ownerIncome = Double.parseDouble(scanner.nextLine());
            double ownerExpenses = Double.parseDouble(scanner.nextLine());


            if (i % 5 == 0) {

                ownerIncome *= 0.9;

            }else if (i % 3 == 0) {

                ownerExpenses *= 1.5;

            }

            double profit = ownerIncome - ownerExpenses;

            System.out.printf("In %s Burger Bus earned %.2f leva.%n", cityName, profit);

            totalProfit += profit;
        }

        System.out.printf("Burger Bus total profit: %.2f leva.%n", totalProfit);

    }
}
