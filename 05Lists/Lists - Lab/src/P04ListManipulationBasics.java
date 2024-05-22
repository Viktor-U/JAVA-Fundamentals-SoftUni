import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P04ListManipulationBasics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numList = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        String input = scanner.nextLine();

        while (!input.equals("end")){
            String [] command = input.split(" ");

            if (command[0].equals("Add")) {
                numList.add(Integer.valueOf(command[1]));
            } else if (command[0].equals("Remove")) {
                numList.remove(Integer.valueOf(command[1]));
            } else if (command[0].equals("RemoveAt")) {
                int index = Integer.parseInt(command[1]);
                numList.remove(index);
            } else if (command[0].equals("Insert")) {
                numList.add(Integer.parseInt(command[2]), Integer.valueOf(command[1]));
            }

            input=scanner.nextLine();
        }

        System.out.println(numList.toString().replaceAll("[\\[\\],]", ""));


    }
}
