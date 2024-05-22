import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class P01CountCharsInAString {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input  = scanner.nextLine();

        Map<Character, Integer> symbols = new LinkedHashMap<>();

        for (char s:input.toCharArray()) {
            if (s != ' '){
            if (symbols.containsKey(s)){
                symbols.put(s, symbols.get(s) + 1);
            }else {
                symbols.put(s, 1);
            }
            }
        }

        for (Map.Entry<Character, Integer> entry : symbols.entrySet()) {
            System.out.println(entry.getKey() + " -> "  + entry.getValue());
        }

    }
}