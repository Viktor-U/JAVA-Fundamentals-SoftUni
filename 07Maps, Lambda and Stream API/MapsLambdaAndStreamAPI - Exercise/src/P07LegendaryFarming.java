import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class P07LegendaryFarming {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Integer> items = new LinkedHashMap<>();
        items.put("shards", 0);
        items.put("fragments", 0);
        items.put("motes", 0);
        Map<String, Integer> junk = new LinkedHashMap<>();

        boolean isWin = false;


        while (!isWin){
            String[] input =scanner.nextLine().split("\\s+");

            for (int i = 0; i <= input.length - 1; i += 2) {
                int quantity = Integer.parseInt(input[i]);
                String material = input[i + 1].toLowerCase();


                if (items.containsKey(material)){
                    items.put(material, items.get(material) +  quantity);
                }else {

                    if (junk.containsKey(material)) {
                        junk.put(material, junk.get(material) + quantity);
                    }else {
                        junk.put(material, quantity);
                    }
                }

                if (items.get("shards") >= 250){
                    isWin = true;
                    System.out.println("Shadowmourne obtained!");
                    items.put("shards", items.get("shards") - 250);
                    break;
                }else if (items.get("fragments") >= 250){
                    isWin = true;
                    System.out.println("Valanyr obtained!");
                    items.put("fragments", items.get("fragments") - 250);
                    break;

                }else if (items.get("motes") >= 250){
                    isWin = true;
                    System.out.println("Dragonwrath obtained!");
                    items.put("motes", items.get("motes") - 250);
                    break;

                }
            }



        }
        for (Map.Entry<String, Integer> entry : items.entrySet()) {
            System.out.printf("%s: %d%n" ,entry.getKey(), entry.getValue());
        }

        for (Map.Entry<String, Integer> entry : junk.entrySet()) {
            System.out.printf("%s: %d%n" ,entry.getKey(), entry.getValue());
        }





    }
}
