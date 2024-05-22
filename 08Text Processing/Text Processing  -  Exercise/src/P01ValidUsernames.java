import java.util.Scanner;

public class P01ValidUsernames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] userNames = scanner.nextLine().split(", ");


        for (String userName : userNames) {

            if (isLegal(userName)){
                System.out.println(userName);
            }

        }




    }

    public static boolean isLegal(String s){


            if (s.length() < 3 || s.length() > 16){
                return false;
            }


            for (int i = 0; i < s.length(); i++) {

                char c = s.toCharArray()[i];

                if (c != 95 && c != 45 && (c < 48 || c > 57) && (c < 65 || c > 90) && (c < 97 || c > 122)) {
                    return false;
                }

            }


        return true;
    }
}