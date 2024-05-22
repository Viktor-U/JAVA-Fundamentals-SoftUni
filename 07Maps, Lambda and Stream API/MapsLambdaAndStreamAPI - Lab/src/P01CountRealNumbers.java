import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class P01CountRealNumbers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double[] numbers = Arrays.stream(scanner.nextLine().split(" ")).mapToDouble(Double::parseDouble).toArray();

        Map<Double, Integer> numMap = new TreeMap<>();


        for (double number : numbers) {

            numMap.putIfAbsent(number, 0);
            numMap.put(number, numMap.get(number) + 1);

        }



        for (Map.Entry<Double, Integer> entry : numMap.entrySet()) {

            DecimalFormat df = new DecimalFormat("#.######");
            System.out.printf("%s -> %d %n", df.format(entry.getKey()), entry.getValue());
        }


    }
}