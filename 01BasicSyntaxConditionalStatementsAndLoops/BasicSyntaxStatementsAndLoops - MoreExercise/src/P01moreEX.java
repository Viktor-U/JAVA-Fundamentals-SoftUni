import java.util.Arrays;
import java.util.Scanner;

public class P01moreEX {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int first = Integer.parseInt(scanner.nextLine());
        int second = Integer.parseInt(scanner.nextLine());
        int third = Integer.parseInt(scanner.nextLine());


        int [] array = new int [] {first,second,third};

        Arrays.sort(array);

        for (int i = array.length - 1; i >= 0 ; i--){

            System.out.println(array[i]);
        }
    }
}