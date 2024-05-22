import java.util.Scanner;

public class P07WaterOverflow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());
        int tankCapacity = 255;

        for (int i = 0; i < num; i++) {

            int addWater = Integer.parseInt(scanner.nextLine());

            tankCapacity -= addWater;

            if (tankCapacity < 0){

                System.out.println("Insufficient capacity!");
                tankCapacity += addWater;
            }

        }

        System.out.println(255 - tankCapacity);




    }
}
