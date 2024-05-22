import java.util.Scanner;

public class P11RefactorVolumeOfPyramid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double length = Double.parseDouble(scanner.nextLine());
        double width = Double.parseDouble(scanner.nextLine());
        double volume = Double.parseDouble(scanner.nextLine());

        volume = length * width * volume / 3;

        System.out.printf("Length: Width: Height: Pyramid Volume: %.2f", volume);


    }
}
