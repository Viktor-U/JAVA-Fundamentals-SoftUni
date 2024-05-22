import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P01Furniture {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        double furnitureTotalPrice = 0;
        List<String> furniture = new ArrayList<>();

        while (!input.equals("Purchase")){

            String regex = ">>(?<furnitureName>[A-Za-z]+)<<(?<price>[0-9]+\\.?[0-9]*)!(?<quantity>[0-9]+)";

            Pattern pattern = Pattern.compile(regex);

            Matcher matcher = pattern.matcher(input);
            if (matcher.find()) {
                String furnitureName = String.valueOf(matcher.group("furnitureName"));
                furniture.add(furnitureName);

                furnitureTotalPrice += Double.parseDouble(matcher.group("price")) * Integer.parseInt(matcher.group("quantity"));
            }
            input = scanner.nextLine();
        }

        System.out.println("Bought furniture:");
        for (String s : furniture) {
            System.out.println(s);
        }
        System.out.printf("Total money spend: %.2f", furnitureTotalPrice);

    }
}