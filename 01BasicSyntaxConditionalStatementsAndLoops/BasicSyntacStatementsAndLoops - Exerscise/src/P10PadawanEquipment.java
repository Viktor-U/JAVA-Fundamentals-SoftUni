import java.util.Scanner;

public class P10PadawanEquipment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double amountMoney = Double.parseDouble(scanner.nextLine());
        int students = Integer.parseInt(scanner.nextLine());
        double lightSabers = Double.parseDouble(scanner.nextLine());
        double robes = Double.parseDouble(scanner.nextLine());
        double belts = Double.parseDouble(scanner.nextLine());


        double total = (lightSabers * Math.ceil(students * 1.1)) + (robes * students) + (belts * (students - Math.floor(students / 6)));


        if (total <= amountMoney){
            System.out.printf("The money is enough - it would cost %.2flv.", total);
        }else {
            System.out.printf("George Lucas will need %.2flv more.", total - amountMoney);
        }


    }
}
