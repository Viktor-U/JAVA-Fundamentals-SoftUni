import java.util.Scanner;

public class P03GamingStore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        double remaining = budget;
        String command = "";
        double price = 0;

        while (!command.equals("Game Time")) {

            String games = scanner.nextLine();

            if (games.equals("Game Time")) {
                command = games;
            } else {
                switch (games) {
                    case "OutFall 4":
                    case "RoverWatch Origins Edition":
                        price = 39.99;
                        break;
                    case "CS: OG":
                        price = 15.99;
                        break;
                    case "Zplinter Zell":
                        price = 19.99;
                        break;
                    case "Honored 2":
                        price = 59.99;
                        break;
                    case "RoverWatch":
                        price = 29.99;
                        break;
                    default:
                        System.out.println("Not Found");
                }
                budget -= price;

                if (budget < 0) {
                    System.out.println("Too Expensive");
                    budget += price;
                } else {
                    System.out.println("Bought " + games);
                }
            }
        }
        if (budget == 0) {
            System.out.println("Out of mo-ney!");
            command.equals("Game Time");
        }else {
            System.out.printf("Total spent: $%.2f. Remaining: $%.2f", remaining - budget, budget);
            command.equals("Game Time");
        }
    }
}
