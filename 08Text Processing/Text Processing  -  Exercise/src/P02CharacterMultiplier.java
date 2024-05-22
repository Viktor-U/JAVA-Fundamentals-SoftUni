import java.util.Scanner;

public class P02CharacterMultiplier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(" ");
        String firstWord = input[0];
        String secondWord = input[1];
        int sum = 0;

        int digitCounter = firstWord.length() - secondWord.length();

        if (digitCounter < 0) {
            for (int i = secondWord.length() - 1; i >= secondWord.length() - Math.abs(digitCounter); i--) {
                sum += secondWord.toCharArray()[i];
            }

            for (int i = 0; i < firstWord.length(); i++) {
                sum += secondWord.toCharArray()[i] * firstWord.toCharArray()[i];
            }
        } else {
            for (int i = firstWord.length() - 1; i >= firstWord.length() - Math.abs(digitCounter); i--) {
                sum += firstWord.toCharArray()[i];
            }
            for (int i = 0; i < secondWord.length(); i++) {
                sum += secondWord.toCharArray()[i] * firstWord.toCharArray()[i];
            }
        }
        System.out.println(sum);

    }
}