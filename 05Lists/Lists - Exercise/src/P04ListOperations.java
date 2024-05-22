import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P04ListOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        String input = scanner.nextLine();

        while (!input.equals("End")) {
            String[] inputArr = input.split(" ");
            String command = inputArr[0];
            String num = inputArr[inputArr.length - 1];

            switch (command) {
                case "Add":

                    numbers.add(Integer.parseInt(num));

                    break;
                case "Insert":

                    int number = Integer.parseInt(inputArr[1]);

                    if (Integer.parseInt(num) >= 0 && Integer.parseInt(num) < numbers.size() ) {
                        numbers.add(Integer.parseInt(num), number);
                    }
                    else {
                        System.out.println("Invalid index");
                    }
                    break;
                case "Remove":

                    if (Integer.parseInt(num) >= 0 && Integer.parseInt(num) < numbers.size()) {

                        numbers.remove( Integer.parseInt(num));

                    }
                    else {
                        System.out.println("Invalid index");
                    }



                    break;
                case "Shift":

                    if (inputArr[1].equals("left")) {

                        for (int i = 0; i < Integer.parseInt(num); i++) {

                            int firstNum = numbers.get(0);
                            numbers.remove(0);

                            numbers.add(firstNum);
                        }

                    } else {

                        for (int i = 0; i < Integer.parseInt(num); i++) {

                            int lastNum = numbers.get(numbers.size() - 1);
                            numbers.remove(numbers.size() - 1);

                            numbers.add(0, lastNum);
                        }

                    }

                    break;
            }

            input = scanner.nextLine();
        }

        for (Integer number : numbers) {
            System.out.print(number + " ");
        }

    }
}
