import java.util.Scanner;

public class P04PasswordValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String pass = scanner.nextLine();

        passwordValidator(pass);

    }

    public static void passwordValidator (String pass){

        boolean isValid = true;
        int digitCounter = 0;

        if (pass.length() < 6 || pass.length() > 10){

            System.out.println("Password must be between 6 and 10 characters");
            isValid = false;

        }

        for (int i = 0; i < pass.length(); i++) {
            char symbol = pass.charAt(i);

            if (symbol <= 47  || symbol >= 123 || symbol >= 58 && symbol <= 64 || symbol >= 91 && symbol <= 96){
                isValid = false;
                System.out.println("Password must consist only of letters and digits");
                break;
            }
        }

        for (int i = 0; i < pass.length(); i++) {
            char symbol = pass.charAt(i);

            if (symbol >=  48 && symbol <= 57){
                digitCounter++;
            }
        }

        if (digitCounter < 2){
            System.out.println("Password must have at least 2 digits");
            isValid = false;
        }

        if (isValid){
            System.out.println("Password is valid");
        }



    }
}
