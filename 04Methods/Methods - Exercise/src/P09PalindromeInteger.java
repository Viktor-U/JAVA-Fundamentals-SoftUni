import java.util.Scanner;

public class P09PalindromeInteger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        while (!input.equals("END")){
            int num = Integer.parseInt(input);
            boolean isPalindrome = isPalindrome(num);

            System.out.println(isPalindrome);

            input = scanner.nextLine();
        }


    }

    public static boolean isPalindrome (int num){
        String first = String.valueOf(num);
        String second = "";


        for (int i = first.length() - 1; i >= 0 ; i--) {
            second += first.charAt(i);
        }

        return first.equals(second);


    }
}
