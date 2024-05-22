import java.util.Scanner;

public class P06BalancedBrackets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());


        int counterBrackets = 0;




        for (int i = 0; i < num; i++) {
            String input = scanner.nextLine();

            if (counterBrackets >= 0) {

                if (input.equals("(")) {
                    counterBrackets++;
                } else if (input.equals(")")) {
                    counterBrackets--;
                }
            }else {
                break;
            }
        }
        if (counterBrackets == 0){
            System.out.println("BALANCED");
        }else  {
            System.out.println("UNBALANCED");
        }
    }
}
