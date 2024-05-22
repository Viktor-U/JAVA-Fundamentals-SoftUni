import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P05ListManipulationAdvanced {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numList = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        String input = scanner.nextLine();

        while (!input.equals("end")){
            String [] command = input.split(" ");

            if (command[0].equals("Contains")) {

                if (numList.contains(Integer.parseInt(command[1]))){
                    System.out.println("Yes");
                }else {
                    System.out.println("No such number");
                }

            } else if (command[0].equals("Print")) {

                List<Integer> printList = new ArrayList<>(numList);

                if (command[1].equals("even")){
                    printList.removeIf(integer -> integer % 2 == 1);
                } else if (command[1].equals("odd")) {
                    printList.removeIf(integer -> integer % 2 == 0);
                }
                System.out.println(printList.toString().replaceAll("[\\[\\],]", ""));

            } else if (command[0].equals("Get")) {

                int sum = 0;

                for (int num : numList) {
                    sum+=num;
                }
                System.out.println(sum);

            } else if (command[0].equals("Filter")) {

                List<Integer> printList = new ArrayList<>(numList);

                    if (command[1].equals("<")){
                        printList.removeIf(integer -> integer >= Integer.parseInt(command[2]));
                    } else if (command[1].equals(">")) {
                        printList.removeIf(integer -> integer <= Integer.parseInt(command[2]));
                    }else if (command[1].equals("<=")) {
                        printList.removeIf(integer -> integer > Integer.parseInt(command[2]));
                    }else if (command[1].equals(">=")) {
                        printList.removeIf(integer -> integer < Integer.parseInt(command[2]));
                    }

                System.out.println(printList.toString().replaceAll("[\\[\\],]", ""));

            }

            input=scanner.nextLine();
        }





    }
}
