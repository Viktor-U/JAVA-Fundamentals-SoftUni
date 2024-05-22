import java.util.Scanner;

public class P01Train {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        String [] arr = new String[n];
        int sum = 0;

        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(scanner.nextLine());
            sum += num;
            arr[i] = String.valueOf(num);
        }
        System.out.println(String.join(" ",arr));
        System.out.println(sum);


    }
}

