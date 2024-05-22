import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class P05Courses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, ArrayList<String>>courses = new LinkedHashMap<>();

        String input = scanner.nextLine();

        while (!input.equals("end")){

            String courseName = input.split(" : ")[0];
            String student = input.split(" : ")[1];

            if (!courses.containsKey(courseName)){

                courses.put(courseName, new ArrayList<>());
                courses.get(courseName).add(student);

            }else {

                courses.get(courseName).add(student);

            }
            input = scanner.nextLine();
        }

        for (Map.Entry<String, ArrayList<String>> entry : courses.entrySet()) {
            int counter = entry.getValue().size();

            System.out.printf("%s: %d%n", entry.getKey(), counter);

            for (int i = 0; i < counter; i++) {
                System.out.printf("-- %s%n", entry.getValue().get(i));
            }
        }






    }
}
