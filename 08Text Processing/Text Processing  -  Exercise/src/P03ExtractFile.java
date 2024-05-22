import java.util.Scanner;

public class P03ExtractFile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] link = scanner.nextLine().split("\\\\");

        String[] needInfo = link[link.length - 1].split("\\.");

        System.out.println("File name: " + needInfo[0]);
        System.out.println("File extension: " + needInfo[1]);


    }
}
