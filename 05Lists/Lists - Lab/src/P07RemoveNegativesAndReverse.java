import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P07RemoveNegativesAndReverse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numList = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());


        numList.removeIf(integer -> integer < 0);

        if (numList.size() == 0){
            System.out.println("empty");
        }

        for (int i = numList.size() - 1; i >= 0 ; i--) {
            System.out.print(numList.get(i) + " ");
        }

    }
}
