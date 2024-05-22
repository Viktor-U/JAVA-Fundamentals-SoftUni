import java.util.Scanner;

public class P05Login {
    private static String reverse;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String username = scanner.nextLine();
        String password = "";
        String tryPassword = "";
        int counterTimes = 0;

        for (int i = username.length() - 1; i >= 0; i--) {
            char currentSymbol = username.charAt(i);
            password += currentSymbol;
        }

        while (!password.equals(tryPassword) && counterTimes != 4) {
            String pass = scanner.nextLine();
            tryPassword = pass;
            counterTimes++;


            if (!pass.equals(password) && counterTimes != 4) {
                System.out.println("Incorrect password. Try again.");
            } else if (tryPassword.equals(password)) {
                System.out.printf("User %s logged in.", username);
            }
        }
        if (counterTimes == 4 && !password.equals(tryPassword)) {
            System.out.printf("User %s blocked!", username);
        }


    }
}
