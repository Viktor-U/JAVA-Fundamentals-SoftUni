import java.util.Scanner;

public class P04RefactoringPrimeChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int n = Integer.parseInt(scanner.nextLine());
        
        for (int i = 2; i <= n; i++) {
            
            boolean isPrimeNumber = true;
            
            for (int j = 2; j < i; j++) {
                
                if (i % j == 0) {
                    isPrimeNumber = false;
                    break;
                }
                
            }
            System.out.printf("%d -> %b%n", i, isPrimeNumber);
        }



    }
}
