import java.util.Scanner;

public class P07VendingMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String start = "";
        double budget = 0;

        while (!start.equals("Start")) {
            String money = scanner.nextLine();
            if (!money.equals("Start")) {
                if (money.equals("0.1")) {
                    budget += 0.1;
                } else if (money.equals("0.2")) {
                    budget += 0.2;
                } else if (money.equals("0.5")) {
                    budget += 0.5;
                } else if (money.equals("1")) {
                    budget += 1;
                } else if (money.equals("2")) {
                    budget += 2;
                } else {
                    System.out.printf("Cannot accept %s%n", money);
                }

            } else {
                start = money;
            }
        }
        String end = "";

        while (!end.equals("End")) {
            String product = scanner.nextLine();
            end = product;

            if (product.equals("Nuts")) {
                budget -= 2;
                if (budget < 0){
                    System.out.println("Sorry, not enough money");
                    budget += 2;
                }else {
                    System.out.println("Purchased Nuts");
                }
            } else if (product.equals("Water")) {
                budget -= 0.7;
                if (budget < 0){
                    System.out.println("Sorry, not enough money");
                    budget += 0.7;
                }else {
                    System.out.println("Purchased Water");
                }
            }else if (product.equals("Crisps")) {
                budget -= 1.5;
                if (budget < 0){
                    System.out.println("Sorry, not enough money");
                    budget += 1.5;
                }else {
                    System.out.println("Purchased Crisps");
                }
            }else if (product.equals("Soda")) {
                budget -= 0.8;
                if (budget < 0){
                    System.out.println("Sorry, not enough money");
                    budget += 0.8;
                }else {
                    System.out.println("Purchased Soda");
                }
            }else if (product.equals("Coke")) {
                budget -= 1;
                if (budget < 0){
                    System.out.println("Sorry, not enough money");
                    budget += 1;
                }else {
                    System.out.println("Purchased Coke");
                }
            } else if (!product.equals("End")) {
                System.out.println("Invalid product");
            }
        }
        System.out.printf("Change: %.2f", budget );


    }
}
