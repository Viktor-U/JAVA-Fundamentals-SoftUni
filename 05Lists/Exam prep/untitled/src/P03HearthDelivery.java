import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P03HearthDelivery {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split("@")).map(Integer::parseInt).collect(Collectors.toList());
        String input = scanner.nextLine();
        int cupidPosition = 0;

        while (!input.equals("Love!")){
            String [] inputArr = input.split(" ");
            int jumpLength =Integer.parseInt(inputArr[1]);

            cupidPosition += jumpLength;

            if (cupidPosition >= numbers.size()){
                cupidPosition = 0;
            }

            numbers.set(cupidPosition, numbers.get(cupidPosition) - 2);

            if (numbers.get(cupidPosition) == 0){
                System.out.printf("Place %d has Valentine's day.%n", cupidPosition);
            }

            if (numbers.get(cupidPosition) < 0){
                System.out.printf("Place %d already had Valentine's day.%n", cupidPosition);
            }




            input = scanner.nextLine();
        }

        System.out.printf("Cupid's last position was %d.%n", cupidPosition);
        boolean isSuccessful = true;

        int missHouse = 0;

        for (Integer number : numbers) {
            if (number > 0) {
                isSuccessful = false;
                missHouse++;
            }
        }

        if (isSuccessful){

            System.out.println("Mission was successful.");

        }else {

            System.out.printf("Cupid has failed %d places.", missHouse);

        }

    }
}