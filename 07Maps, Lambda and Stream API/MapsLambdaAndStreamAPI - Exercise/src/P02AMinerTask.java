import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class P02AMinerTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Integer> items = new LinkedHashMap<>();

        String input = scanner.nextLine();

        while (!input.equals("stop")){

            int quantity = Integer.parseInt(scanner.nextLine());

            if (!items.containsKey(input)){
                items.put(input, quantity);
            }else {
                items.put(input, items.get(input) + quantity);
            }


            input = scanner.nextLine();
        }

        for (Map.Entry<String, Integer> stringIntegerEntry : items.entrySet()) {

            System.out.println(stringIntegerEntry.getKey() + " -> " + stringIntegerEntry.getValue());

        }

    }
}
