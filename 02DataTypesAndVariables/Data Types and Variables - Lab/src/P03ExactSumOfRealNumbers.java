import java.math.BigDecimal;
import java.util.Scanner;

public class P03ExactSumOfRealNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());

        BigDecimal result = new BigDecimal(0);

        for (int i = 0; i < num; i++) {

            BigDecimal number = new BigDecimal(scanner.nextLine());


            result = result.add(number);



        }

        System.out.println(result);

    }
}
