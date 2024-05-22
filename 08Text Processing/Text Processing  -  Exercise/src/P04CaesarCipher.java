import java.util.Scanner;

public class P04CaesarCipher {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        StringBuilder script  = new StringBuilder();

       char[] cipher =  input.toCharArray();

        for (char c : cipher) {
            script.append((char)(c + 3));
        }

        System.out.println(script);
    }
}
