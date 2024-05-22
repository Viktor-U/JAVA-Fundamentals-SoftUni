import java.util.Scanner;

public class P06ReplaceRepeatingChars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char []input = scanner.nextLine().toCharArray();
        StringBuilder result = new StringBuilder();

        char lastDigit = ' ';

        for (char c : input) {


            if (c != lastDigit) {
                result.append(c);
            }
            lastDigit = c;
        }
        System.out.println(result);

    }
}
