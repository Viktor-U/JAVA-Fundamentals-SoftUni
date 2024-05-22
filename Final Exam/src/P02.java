import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Pattern pattern = Pattern.compile("![A-Z][a-z]+!:\\[([A-Za-z]{8,})\\]");

        int num = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < num; i++) {
            String input = scanner.nextLine();

            Matcher matcher = pattern.matcher(input);

            if (matcher.find()){
                String command = input.split(":")[0].replace("!", "");
                String code = input.split(":")[1].replaceAll("\\]\\[", "");

                System.out.print(command + ": ");
                for (int j = 1; j < code.length()-1; j++) {
                    System.out.printf("%d ",(int) code.toCharArray()[j]);
                }
                System.out.println();
            }else {
                System.out.println("The message is invalid");
            }

        }


    }
}
