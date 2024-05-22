import java.util.Scanner;

public class P05DecryptingMessages {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       
       int key = Integer.parseInt(scanner.nextLine());
       int n = Integer.parseInt(scanner.nextLine());
       String description = "";

        for (int i = 0; i < n; i++) {
            char characters = scanner.nextLine().charAt(0);

            int realCharacter = characters + key;

            char symbol = (char) realCharacter;
            description += symbol;

            
        }

        System.out.println(description);
    }
}
