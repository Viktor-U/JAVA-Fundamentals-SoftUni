
import java.util.Arrays;
import java.util.Scanner;

public class P04ReverseArrayOfStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String [] elementsArr = scanner.nextLine().split(" ");

        for (int i = 0; i < elementsArr.length / 2; i++) {

             String element = elementsArr[i];
             elementsArr[i] = elementsArr [elementsArr.length - 1 -i];
             elementsArr [elementsArr.length - 1 -i] = element;

        }
        System.out.println(String.join(" " , elementsArr));









    }
}
