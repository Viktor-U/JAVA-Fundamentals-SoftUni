import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P02SoftUniBarIncome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        double totalIncome = 0;


        while (!input.equals("end of shift")){

            Pattern pattern = Pattern.compile("%(?<customer>[A-z][a-z]+)%[^%\\|\\$\\.]*<(?<product>\\w+)>[^%\\|\\$\\.]*\\|(?<count>\\d+)\\|*(?<price>[0-9]+\\.?[0-9]*)\\$");
            Matcher matcher = pattern.matcher(input);

            if (matcher.find()) {

                String customer = matcher.group("customer");
                String product = matcher.group("product");
                int count = Integer.parseInt(matcher.group("count"));
                double price = Double.parseDouble(matcher.group("price"));


                totalIncome += count * price;

                System.out.printf("%s: %s - %.2f%n", customer, product, count * price);
            }

            input = scanner.nextLine();
        }

        System.out.println("Total income: " + String.format("%.2f", totalIncome));


    }
}
//[^%\|\$\.]*