import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P03MergingLists {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> firsrNumList = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> secondNumList = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        List<Integer> resultList = new ArrayList<>();

        int smallerList = Math.min(firsrNumList.size(), secondNumList.size());
        boolean firstBigger;

        firstBigger = firsrNumList.size() > secondNumList.size();

        for (int i = 0; i < smallerList ; i++) {
            resultList.add(firsrNumList.get(i));
            resultList.add(secondNumList.get(i));

        }
        if (firstBigger) {
            for (int i = smallerList ; i < firsrNumList.size(); i++) {
                resultList.add( firsrNumList.get(i));
            }
        }else {
            for (int i = smallerList ; i < secondNumList.size(); i++) {
                resultList.add( secondNumList.get(i));
            }
        }

        for (Integer num : resultList){
            System.out.print(num + " ");
        }
    }
}
