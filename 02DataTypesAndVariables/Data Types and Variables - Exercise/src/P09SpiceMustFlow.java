import java.util.Scanner;

public class P09SpiceMustFlow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int yield = Integer.parseInt(scanner.nextLine());
        int day = 0;
        int sumSpices = 0;
        int drop = 10;


        while (yield >= 100) {
            day++;

            sumSpices += yield;
            sumSpices -= 26;
            yield -= drop;


        }

        int foodForWorkers = 26;

        if (sumSpices < 26) {
            foodForWorkers = 0;
        }

        System.out.println(day);
        System.out.println(sumSpices - foodForWorkers);


    }
}
