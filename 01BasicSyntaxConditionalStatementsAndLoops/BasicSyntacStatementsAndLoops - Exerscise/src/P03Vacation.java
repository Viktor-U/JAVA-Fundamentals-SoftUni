import java.util.Scanner;

public class P03Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());
        String typePeople = scanner.nextLine();
        String day = scanner.nextLine();
        double price = 22.50;

        if (day.equals("Friday") && typePeople.equals("Students")) {
            price = 8.45;
        } else if (day.equals("Friday") && typePeople.equals("Business")) {
            price = 10.90;
        } else if (day.equals("Friday") && typePeople.equals("Regular")) {
            price = 15;
        } else if (day.equals("Saturday") && typePeople.equals("Students")) {
            price = 9.8;
        } else if (day.equals("Saturday") && typePeople.equals("Business")) {
            price = 15.6;
        } else if (day.equals("Saturday") && typePeople.equals("Regular")) {
            price = 20;
        } else if (day.equals("Sunday") && typePeople.equals("Students")) {
            price = 10.46;
        } else if (day.equals("Sunday") && typePeople.equals("Business")) {
            price = 16;
        }

        double totalPrice = price * num;

        if (typePeople.equals("Students") && num >= 30) {
            totalPrice = totalPrice * 0.85;
        } else if (typePeople.equals("Business") && num >= 100) {
            totalPrice = totalPrice - 10 * price;
        } else if (typePeople.equals("Regular") && num >= 10 && num <= 20) {
            totalPrice = totalPrice * 0.95;
        }


        System.out.printf("Total price: %.2f", totalPrice);

    }
}
