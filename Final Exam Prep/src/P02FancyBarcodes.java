import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P02FancyBarcodes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());
        Pattern pattern = Pattern.compile("@#+([A-Z]([A-Za-z0-9}]{4,10000})[A-Z])@#+");

        for (int i = 0; i < num; i++) {
            String input = scanner.nextLine();

            Matcher matcher = pattern.matcher(input);

            StringBuilder sb = new StringBuilder();
            boolean isEmpty = true;

            if (matcher.find()){

                char[] symbols = matcher.group().toCharArray();
                for (char symbol : symbols) {
                    if (symbol >= 48 && symbol <= 57){
                        sb.append(symbol);
                        isEmpty = false;
                    }
                }

                if (!isEmpty) {
                   System.out.println("Product group: " + sb);
                }else {
                    System.out.println("Product group: 00");
                }
            }else{
                System.out.println("Invalid barcode");
            }
        }
    }
}
