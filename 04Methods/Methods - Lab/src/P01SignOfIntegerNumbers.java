import java.util.Scanner;

public class P01SignOfIntegerNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());

        numberType(num);


    }

    public static void numberType(int num ) {

        if (num > 0){
            System.out.printf("The number %d is positive.", num);
        }else if (num < 0){
            System.out.printf("The number %d is negative.", num);
        }else {
            System.out.printf("The number %d is zero.", num);
        }

    }
}
