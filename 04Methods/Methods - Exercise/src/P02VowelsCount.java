import java.util.Scanner;

public class P02VowelsCount {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();

        vowelsCounter(word.toLowerCase());
    }

    public static void vowelsCounter (String word){
        int counter = 0;
        for (int i = 0; i < word.length(); i++) {
            char letter = word.charAt(i);

            if (letter == 'a' || letter == 'e' || letter == 'o' || letter == 'i' || letter == 'u'){
                counter++;
            }


        }
        System.out.println(counter);

    }

}
