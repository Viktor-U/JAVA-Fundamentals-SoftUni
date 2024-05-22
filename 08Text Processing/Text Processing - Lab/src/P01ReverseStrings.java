import java.util.Scanner;

public class P01ReverseStrings {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String word = scanner.nextLine();

        while (!word.equals("end")){

            System.out.printf("%s = %s%n", word, reverseWord(word));

            word = scanner.nextLine();
        }



    }

    public static StringBuilder reverseWord (String word){

        StringBuilder sb = new StringBuilder();

        for (int i = word.length() - 1; i >= 0; i--) {
            sb.append(word.toCharArray()[i]);
        }

        return sb;
    }
}