import java.util.Scanner;

public class P02Grades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double grades = Double.parseDouble(scanner.nextLine());

        grade(grades);


    }

    public static void grade (double grades){

        if (grades >= 2 && grades < 3){
            System.out.println("Fail");
        }else if (grades >= 3 && grades < 3.5){
            System.out.println("Poor");
        } else if (grades >= 3.5 && grades < 4.5){
            System.out.println("Good");
        }else if (grades >= 4.5 && grades < 5.5){
            System.out.println("Very good");
        }else if (grades >= 5.5 && grades < 6){
            System.out.println("Excellent");
        }
    }
}
