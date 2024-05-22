import java.util.Scanner;

public class P03PrintingTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());
        printTriangle(num);

    }

    public static void printTriangle(int topOfTriangle) {
        for (int i = 1; i < topOfTriangle; i++) {
            nextPart(i);
        }
        for (int i = topOfTriangle; i >= 1; i--) {
            nextPart(i);
        }

    }

    public static void nextPart(int lineNum) {
        for (int j = 1; j <= lineNum; j++) {
            System.out.print(j + " ");
        }
        System.out.println();

    }
}
