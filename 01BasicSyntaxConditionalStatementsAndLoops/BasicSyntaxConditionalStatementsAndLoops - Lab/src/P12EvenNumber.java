import java.util.Scanner;

public class P12EvenNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        boolean isEven = true;

       while (isEven){
           int num = Integer.parseInt(scanner.nextLine());
           if (Math.abs(num) % 2 == 1){
               System.out.println("Please write an even number.");
           }else {
               System.out.printf("The number is: %d", Math.abs(num));
               isEven=false;
           }
       }

    }
}
