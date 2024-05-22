import java.util.Scanner;

public class P08BeerKegs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());
        double volume = 0;
        String maxKeg = "";

        for (int i = 0; i < num; i++) {
            String model = scanner.nextLine();
            double radius = Double.parseDouble(scanner.nextLine());
            int height = Integer.parseInt(scanner.nextLine());

            if (volume < Math.PI * radius * radius * height){
                maxKeg = model;
                volume = Math.PI * radius * radius * height;
            }
        }
        System.out.println(maxKeg);

    }
}
