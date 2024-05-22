import java.util.Scanner;

public class P02RepeatStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] words = scanner.nextLine().split(" ");

        StringBuilder sb = new StringBuilder();

        for (String word : words) {

            sb.append(String.valueOf(word).repeat(word.length()));

        }
        System.out.println(sb);


    }
}
