import java.util.Scanner;

public class P04TownInfo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String town = scanner.nextLine();
        double population = Double.parseDouble(scanner.nextLine());
        int area = Integer.parseInt(scanner.nextLine());


        System.out.printf("Town %s has population of %.0f and area %d square km.", town, population, area);

    }
}
