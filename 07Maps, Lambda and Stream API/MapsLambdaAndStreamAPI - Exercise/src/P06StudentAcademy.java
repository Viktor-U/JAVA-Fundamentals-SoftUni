import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class P06StudentAcademy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Double> students = new LinkedHashMap<>();

        int num = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < num; i++) {

            String name = scanner.nextLine();
            double note = Double.parseDouble(scanner.nextLine());

            if (!students.containsKey(name)){

                students.put(name, note);

            }else {

                students.put(name, (students.get(name) + note) / 2);

            }
        }

        for (Map.Entry<String, Double> stringDoubleEntry : students.entrySet()) {

            if (stringDoubleEntry.getValue() >= 4.5){
                System.out.printf("%s -> %.2f%n", stringDoubleEntry.getKey(), stringDoubleEntry.getValue());
            }

        }


    }
}
