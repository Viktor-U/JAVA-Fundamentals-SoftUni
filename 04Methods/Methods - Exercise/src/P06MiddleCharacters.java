import java.util.Scanner;

public class P06MiddleCharacters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String word = scanner.nextLine();
        middleChar(word);

    }

    public static void middleChar (String word){
        if (word.length() % 2 == 0){

            System.out.print(word.charAt(word.length() / 2 -1));
            System.out.println(word.charAt(word.length() / 2));
        }else {
            System.out.println(word.charAt(word.length() / 2));
        }
    }
}
