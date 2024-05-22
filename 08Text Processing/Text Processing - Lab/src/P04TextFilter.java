
import java.util.Scanner;

public class P04TextFilter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] bannedWords = scanner.nextLine().split(", ");
        String text = scanner.nextLine();

        for (String bannedWord : bannedWords) {

            if (text.contains(bannedWord)) {
                String censure = "";
                for (int j = 0; j < bannedWord.length(); j++) {
                    censure += "*";
                }
                text = text.replaceAll(bannedWord, censure);
            }

        }
        System.out.print(text);

    }
}
