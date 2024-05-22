import java.util.Scanner;

public class P05Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String product = scanner.nextLine();
        double price = Double.parseDouble(scanner.nextLine());

        shopAssistant(product, price);

    }

    public static void shopAssistant(String product, double price) {
        switch (product){
            case "coffee":
                System.out.printf("%.2f", 1.5 * price);
                break;
            case "water":
                System.out.printf("%.2f", 1 * price);
                break;
            case "coke":
                System.out.printf("%.2f", 1.4 * price);
                break;
            case "snacks":
                System.out.printf("%.2f", 2 * price);
                break;
        }
    }
}
