import java.util.Scanner;

public class P10PokeMon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int power = Integer.parseInt(scanner.nextLine());
        int halfPower = power / 2;
        int distance = Integer.parseInt(scanner.nextLine());
        int exhaustionFactor = Integer.parseInt(scanner.nextLine());

        int pokeTargets = 0;

        while (power >= distance) {

            pokeTargets++;
            power -= distance;

            if (power == halfPower && exhaustionFactor != 0) {
                power /= exhaustionFactor;
            }

        }
        System.out.println(power);
        System.out.println(pokeTargets);



    }
}
