import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P02AdAstra {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();


        Pattern pattern = Pattern.compile("([\\|#])(?<product>[A-Z a-z]+)\\1(?<date>[0-9]{2}\\/[0-9]{2}\\/[0-9]{2})\\1(?<calories>[0-9]+)\\1");
        Matcher matcher = pattern.matcher(input);
        List<String> productsName = new ArrayList<>();
        List<String> date = new ArrayList<>();
        List<String> calories = new ArrayList<>();


        int counterCalories = 0;
        while (matcher.find()){

            if (Integer.parseInt(matcher.group("calories")) < 10001){
                counterCalories += Integer.parseInt(matcher.group("calories"));

                productsName.add(matcher.group("product"));
                date.add(matcher.group("date"));
                calories.add(matcher.group("calories"));

            }
        }

        System.out.printf("You have food to last you for: %d days!%n",counterCalories / 2000);

        for (int i = 0; i < productsName.size(); i++) {
            System.out.printf("Item: %s, Best before: %s, Nutrition: %s%n", productsName.get(i), date.get(i), calories.get(i));
        }



    }
}
