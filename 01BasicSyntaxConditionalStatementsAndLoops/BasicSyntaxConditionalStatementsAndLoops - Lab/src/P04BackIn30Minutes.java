import java.util.Scanner;

public class P04BackIn30Minutes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hours = Integer.parseInt(scanner.nextLine());
        int minutes = Integer.parseInt(scanner.nextLine());

        int time = hours * 60 + minutes;
        int appropriateTime = time + 30;

        int lastHours = appropriateTime / 60;
        int lastMinutes = appropriateTime - lastHours * 60;

        if (lastHours == 24){
            lastHours=0;
        }

        System.out.printf("%d:%02d", lastHours, lastMinutes);
    }
}
