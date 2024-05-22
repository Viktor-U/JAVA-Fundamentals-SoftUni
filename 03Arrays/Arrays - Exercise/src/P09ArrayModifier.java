import java.util.Arrays;
import java.util.Scanner;

public class P09ArrayModifier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int [] numArr = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        String command  = scanner.nextLine();

        while (!command.equals("end")){

            if (command.contains("swap")){
                String [] commandArr = command.split(" ");

                int firstIndex = Integer.parseInt(commandArr[1]);
                int secondIndex = Integer.parseInt(commandArr[2]);

                int firstNum = numArr[firstIndex];

                numArr[firstIndex] = numArr[secondIndex];
                numArr[secondIndex] = firstNum;

            } else if (command.contains("multiply")) {
                String [] commandArr = command.split(" ");

                int firstIndex = Integer.parseInt(commandArr[1]);
                int secondIndex = Integer.parseInt(commandArr[2]);

                numArr[firstIndex] = numArr[firstIndex] * numArr[secondIndex];

            } else if (command.equals("decrease")) {
                for (int i = 0; i < numArr.length; i++) {
                    numArr[i]--;

                }
            }


            command = scanner.nextLine();
        }
        System.out.println(Arrays.toString(numArr)
                        .replace("[","")
                        .replace("]",""));

    }
}
