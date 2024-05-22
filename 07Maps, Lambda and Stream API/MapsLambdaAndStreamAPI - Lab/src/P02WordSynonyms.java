import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class P02WordSynonyms {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());

        Map<String, ArrayList<String>> directory = new LinkedHashMap<>();

        for (int i = 0; i < num; i++) {
            
            String word = scanner.nextLine();
            String synonym = scanner.nextLine();

            directory.putIfAbsent(word, new ArrayList<>() );
            directory.get(word).add(synonym);

        }

        for (Map.Entry<String, ArrayList<String>> entry : directory.entrySet()) {

            System.out.printf("%s - %s%n", entry.getKey(), String.join(", ", entry.getValue()));

        }
    }
}
