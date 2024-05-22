import java.util.Scanner;

public class P10TopNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());


        for (int i = 1; i <= num; i++) {
            printTopNumbers(i);
        }

    }


    public static void printTopNumbers (int num){

        boolean firstTrue = false;
        boolean secondTrue = false;


        int sum = 0;

        for (int i = 0; i < String.valueOf(num).length(); i++) {

            if ((String.valueOf(num).charAt(i)) % 2 == 1){
                secondTrue = true;
            }
            sum+= String.valueOf(num).charAt(i);
        }

        if (sum % 8 == 0
        ){
            firstTrue = true;
        }
        if (firstTrue && secondTrue){
            System.out.println(num);
        }
    }
}
