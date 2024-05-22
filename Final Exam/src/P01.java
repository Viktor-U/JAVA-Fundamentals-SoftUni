import java.util.Scanner;

public class P01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
        String sb = "";

        String input = scanner.nextLine();
        while (!input.equals("Done")){

            String command = input.split(" ")[0];

            switch (command){
                case "Change":
                    String symbol = input.split(" ")[1];
                    String replacement = input.split(" ")[2];

                    text = text.replaceAll(symbol, replacement) + "";
                    System.out.println(text);

                    break;
                case "Includes":
                    String substring = input.split(" ")[1];

                    if (text.contains(substring)){
                        System.out.println("True");
                    }else {
                        System.out.println("False");
                    }

                    break;
                case "End":
                    substring = input.split(" ")[1];
                    int substringLength = substring.length();
                    int textLength = text.length() - substringLength;
                    boolean isTrue = true;

                    for (int i = 0; i < substringLength; i++) {
                        if (substring.toCharArray()[i] != text.toCharArray()[textLength + i]) {
                            isTrue = false;
                            break;
                        }

                    }
                    if (isTrue){
                        System.out.println("True");
                    }else
                        System.out.println("False");

                    break;
                case "Uppercase":

                    text = text.toUpperCase();

                    System.out.println(text);

                    break;
                case "FindIndex":
                    symbol = input.split(" ")[1];

                    System.out.println(text.indexOf(symbol));

                    break;
                case "Cut":
                    int startIndex = Integer.parseInt(input.split(" ")[1]);
                    int endIndex = Integer.parseInt(input.split(" ")[2]);

                    sb = text.substring(startIndex, startIndex + endIndex );

                    text = text.replace(sb, "");
                    System.out.println(sb);

                    break;
            }
            input = scanner.nextLine();
        }
    }
}