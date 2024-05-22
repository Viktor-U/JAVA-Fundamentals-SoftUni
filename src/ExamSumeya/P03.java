package ExamSumeya;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List <String> cardList = Arrays.stream(scanner.nextLine().split(", ")).collect(Collectors.toList());
        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= n; i++) {
            String command = scanner.nextLine();
            String[] commandParts = command.split(", ");
            String commandName = commandParts[0];

            switch (commandName) {
                case "Add":
                    String cardName = commandParts[1];
                    if (cardList.contains(cardName)) {
                        System.out.println("Card is already in the deck");
                    } else {
                        cardList.add(cardName);
                        System.out.println("Card successfully added");
                    }
                    break;
                case "Remove":
                    String cardName2 = commandParts[1];
                    if (cardList.contains(cardName2)) {
                        cardList.remove(cardName2);
                        System.out.println("Card successfully removed");
                    } else {
                        System.out.println("Card not found");
                    }
                    break;
                case "Remove At":
                    int index = Integer.parseInt(commandParts[1]);

                    if (isValid(cardList, index)) {
                        cardList.remove(index);
                        System.out.println("Card successfully removed");
                    } else {
                        System.out.println("Index out of range");
                    }
                    break;
                case "Insert":
                    int indexCard = Integer.parseInt(commandParts[1]);
                    String nameCard = commandParts[2];

                    if (isValid(cardList, indexCard)) {
                        if (cardList.contains(nameCard)) {
                            System.out.println("Card is already in the deck");
                        } else {
                            cardList.add(indexCard, nameCard);
                            System.out.println("Card successfully added");
                        }
                    } else {
                        System.out.println("Index out of range");
                    }
                    break;
            }
        }
        System.out.println(String.join(", ", cardList));
    }
    public static boolean isValid (List<String> cards, int index) {
        return index >= 0 && index < cards.size();
    }
}