import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;


public class P03MemoryGame {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            List <String> numbers = Arrays.stream(scanner.nextLine().split(" "))
                    .collect(Collectors.toList());
            String command = scanner.nextLine();

            int moves = 0;
            boolean hasWon = false;
            while (!command.equals("end")) {
                String[] commandParts = command.split(" ");
                int firstNum = Integer.parseInt(commandParts[0]);
                int secondNum = Integer.parseInt(commandParts[1]);


                moves++;


                if (firstNum == secondNum || firstNum > numbers.size() - 1 || firstNum < 0 ||
                        secondNum > numbers.size() - 1 || secondNum < 0) {
                    System.out.println("Invalid input! Adding additional elements to the board");
                    numbers.add(numbers.size() / 2, -moves + "a");
                    numbers.add(numbers.size() / 2, -moves + "a");
                } else {

                    String firstElement = numbers.get(firstNum);
                    String secondElement = numbers.get(secondNum);

                    if (firstElement.equals(secondElement)) {
                        System.out.printf("Congrats! You have found matching elements - %s!%n", secondElement);
                        numbers.remove(firstElement);
                        numbers.remove(secondElement);
                    } else  {
                        System.out.println("Try again!");
                    }
                }if (numbers.size() == 0) {
                    System.out.printf("You have won in %d turns!%n", moves);
                    hasWon = true;
                    break;
                }

                command = scanner.nextLine();
            }

            if (!hasWon) {
                System.out.println("Sorry you lose :(");
                System.out.println(numbers.toString().replaceAll("[\\[\\],]", ""));
            }
        }
}
