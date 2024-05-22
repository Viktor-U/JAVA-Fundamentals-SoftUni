import java.util.Scanner;

public class P07NxNMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());

        nxn(num);


    }
    public static void nxn(int n){

        for (int i = 0; i < n ; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(n + " ");
            }
            System.out.println();
        }
    }
}
