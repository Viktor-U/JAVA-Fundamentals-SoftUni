import java.util.Scanner;

public class P08FactorialDivision {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());

        long firstNum =  factorial (a);
        long secondNum =  factorial (b);

        System.out.printf("%.2f" ,firstNum * 1.0 / secondNum);
    }

    public static long factorial(int num){
        long sum = 1;
        for (int i = 1; i <= num; i++) {
            sum *= i;
        }
        return sum;
    }
}
