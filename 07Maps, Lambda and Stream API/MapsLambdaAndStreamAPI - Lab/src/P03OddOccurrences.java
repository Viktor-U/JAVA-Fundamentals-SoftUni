import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class P03OddOccurrences {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] words = scanner.nextLine().toLowerCase().split(" ");

        Map<String, Integer> wordsMap = new LinkedHashMap<>();

        for (String word : words) {
            wordsMap.putIfAbsent(word, 0);
            wordsMap.put(word, wordsMap.get(word) + 1);
        }
        ArrayList<String> resultList = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : wordsMap.entrySet()) {


            if (entry.getValue() % 2 == 1) {
                resultList.add(entry.getKey());
            }


        }
        System.out.println(String.join(", ", resultList));
    }
}