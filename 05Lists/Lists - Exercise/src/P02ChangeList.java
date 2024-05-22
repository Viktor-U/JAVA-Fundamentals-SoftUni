import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P02ChangeList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        String command = scanner.nextLine();

        while (!command.equals("end")) {
            String [] commandArr = command.split(" ");

            if (command.contains("Delete")){

                numbers.removeAll(List.of(Integer.parseInt(commandArr[1])));

            }else {

                numbers.add(Integer.parseInt(commandArr[2]), Integer.parseInt(commandArr[1]));
            }





            command = scanner.nextLine();
        }
        for (Integer number : numbers) {
            System.out.print(number + " ");
        }

    }
}
