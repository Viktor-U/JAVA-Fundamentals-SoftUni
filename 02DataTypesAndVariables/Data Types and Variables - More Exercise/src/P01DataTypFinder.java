import java.util.Scanner;

public class P01DataTypFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String type = scanner.nextLine();

        while (!type.equals("END")){

            Scanner input = new Scanner(type);


            if (input.hasNextInt()){

                System.out.printf("%s is integer type%n", type);

            }else if (input.hasNextDouble()) {

                System.out.printf("%s is floating point type%n", type);

            } else if (type.equalsIgnoreCase("true") || type.equalsIgnoreCase("false")) {

                System.out.printf("%s is boolean type%n", type);

            } else if (type.length() == 1) {

                System.out.printf("%s is character type%n", type);

            } else {
                System.out.printf("%s is string type%n", type);
            }


            type = scanner.nextLine();



        }

    }
}