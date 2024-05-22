import java.util.Scanner;

public class P03Substring {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String wordToRemove = scanner.nextLine();
        String text = scanner.nextLine();

        while (text.contains(wordToRemove)){

            text = text.replaceAll(wordToRemove, "");

        }

        System.out.println(text);

    }
}
