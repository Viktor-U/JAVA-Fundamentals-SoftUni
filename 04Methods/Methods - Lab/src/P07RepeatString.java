import java.util.Scanner;

public class P07RepeatString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        int repeatTimes = Integer.parseInt(scanner.nextLine());

        String result = newWord(string, repeatTimes);

        System.out.println(result);
    }
    public static String newWord (String string, int repeatTimes){


        StringBuilder result = new StringBuilder();

        for (int i = 0; i < repeatTimes; i++) {

            result.append(string);

        }

        return String.valueOf(result);
    }
}
