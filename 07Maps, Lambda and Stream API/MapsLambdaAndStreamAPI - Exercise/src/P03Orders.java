import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class P03Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Double> prices = new LinkedHashMap<>();
        Map<String, Integer> orders = new LinkedHashMap<>();

        String input = scanner.nextLine();

        while (!input.equals("buy")) {

            String[] product = input.split(" ");

            String productName = product[0];
            double price = Double.parseDouble(product[1]);
            int quantity = Integer.parseInt(product[2]);

            if (!prices.containsKey(productName)){
                prices.put(productName, quantity * price);
                orders.put(productName, quantity);

            }else {
                orders.put(productName, orders.get(productName) + quantity);
                prices.put(productName, orders.get(productName) * price);

            }






            input = scanner.nextLine();
        }

        for (Map.Entry<String, Double> entry : prices.entrySet()) {
            System.out.printf("%s -> %.2f%n", entry.getKey(), entry.getValue());
        }


    }
}
