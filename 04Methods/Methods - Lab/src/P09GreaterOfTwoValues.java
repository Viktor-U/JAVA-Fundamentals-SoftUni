import java.util.Scanner;

public class P09GreaterOfTwoValues {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String method = scanner.nextLine();

        String result = " ";

        if (method.equals("int")){
            int a = Integer.parseInt(scanner.nextLine());
            int b = Integer.parseInt(scanner.nextLine());
            result = String.valueOf(getMax(a, b));

        }else if (method.equals("char")){
            char a = scanner.nextLine().charAt(0);
            char b = scanner.nextLine().charAt(0);
            result = String.valueOf(getMax(a, b));

        }else {
            String a = scanner.nextLine();
            String b = scanner.nextLine();
            result =getMax(a, b);

        }
        System.out.println(result);




    }
    public static char getMax (char a, char b){

        if (a > b){
            return a;
        }else {
            return b;
        }

    }

    public static String getMax (String a, String b){

        if (a.compareTo(b) >= 0) {
            return a;
        }else {
            return b;
        }

    }

    public static int getMax (int a, int b){

        if (a > b){
            return a;
        }else {
            return b;
        }

    }
}
