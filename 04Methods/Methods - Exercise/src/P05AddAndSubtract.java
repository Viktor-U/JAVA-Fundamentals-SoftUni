import java.util.Scanner;

public class P05AddAndSubtract {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNum = Integer.parseInt(scanner.nextLine());
        int secondNum = Integer.parseInt(scanner.nextLine());
        int thirdNum = Integer.parseInt(scanner.nextLine());

        System.out.println(subtract(firstNum, secondNum, thirdNum));
    }
    public static int sum (int firstNum ,int secondNum){
        return firstNum + secondNum;
    }
    public static int subtract (int firstNum ,int secondNum, int thirdNum){
        int sum = sum(firstNum, secondNum);
        return sum - thirdNum ;
    }
}
