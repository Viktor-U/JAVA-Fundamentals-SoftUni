
import java.util.Random;
import java.util.Scanner;

public class P01RandomizeWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String[] wordList = scanner.nextLine().split(" ");
        Random random = new Random();

        for (int i = 0; i < wordList.length; i++) {



            int rnd = random.nextInt(wordList.length);
            int rnd2 = random.nextInt(wordList.length);

            String oldWord = wordList[rnd];
            wordList[rnd] = wordList [rnd2];
            wordList[rnd2] = oldWord;
        }

        System.out.println(String.join(System.lineSeparator(), wordList));

    }
}