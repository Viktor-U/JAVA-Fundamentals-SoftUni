import java.util.Scanner;

public class P05MoreEX {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());


        for (int i = 0; i <num; i++) {

            String digits = (scanner.nextLine());
            int numDigit = Integer.parseInt(digits);

            if (numDigit == 0){
                System.out.print(" ");
            }else {

                int digitLength = digits.length();
                int mainDigits = numDigit % 10;

                int offset = ((mainDigits - 2) * 3);

                if (mainDigits == 8 || mainDigits == 9) {
                    offset++;
                }
                int letterIndex = offset + digitLength - 1;

                int asciiCode = letterIndex + 97;

                char letter = (char) asciiCode;

                System.out.print(letter);
            }
        }


    }
}
