import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P05BombNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numList = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        int bomb = scanner.nextInt();
        int power = scanner.nextInt();
        int sum = 0;

        while (numList.contains(bomb)){

            int bombIndex = numList.indexOf(bomb);

            int left = Math.max(0, bombIndex - power);
            int right = Math.min(numList.size() - 1, bombIndex + power);

            for (int i = right; i >= left; i--) {
                numList.remove(i);
            }
        }

        for (Integer integer : numList) {
            sum += integer;
        }

        System.out.println(sum);

    }

}