import java.util.Scanner;

public class P11MultiplicationTable2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());
        int num2 = Integer.parseInt(scanner.nextLine());



        if (num2 <= 10){
            for (int i = num2; i <= 10; i++) {
                System.out.printf("%d X %d = %d%n", num, i, num*i);
            }
        }else {
            System.out.printf("%d X %d = %d%n",num, num2, num * num2);
        }
    }
}
