import java.util.Scanner;

public class P01Ages {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());
        String person = "";

        if (num <= 2){
            person = "baby";
        } else if (num <= 13) {
            person = "child";
        }else if (num <= 19) {
            person = "adult";
        }else if (num <= 65) {
            person = "adult";
        } else  {
            person = "elder";
        }
        System.out.println(person);

    }
}