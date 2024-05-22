import java.util.Scanner;

public class P06TriplesOfLatinLetters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());




        for (int i = 'a'; i < 'a' + num; i++) {
            for (int j = 'a'; j < 'a' + num; j++) {
                for (int k = 'a'; k < 'a' + num; k++) {

                    System.out.printf("%c%c%c%n", i, j, k);

                }
            }
        }
    }
}