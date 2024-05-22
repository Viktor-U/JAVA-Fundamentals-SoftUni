import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class P03HouseParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> guests = new ArrayList<>();
        int num = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < num; i++) {
            List<String> input = List.of(scanner.nextLine().split(" "));
            String name = input.get(0);

            if (!input.contains("not")){

                if (!guests.contains(name)){

                    guests.add(name);

                }else {

                    System.out.println(name + " is already in the list!");

                }
            }else {

                if (guests.contains(name)){

                    guests.remove(name);

                }else {

                    System.out.println(name + " is not in the list!");

                }
            }
        }

        for (String guest : guests) {
            System.out.println(guest);
        }

    }
}
