import java.util.*;

public class P08CompanyUsers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        Map<String, ArrayList<String>> courses = new LinkedHashMap<>();

        while (!input.equals("End")){
            String courseName = input.split(" -> ")[0];
            String student = input.split(" -> ")[1];

            if (!courses.containsKey(courseName)){

                courses.put(courseName, new ArrayList<>());
                courses.get(courseName).add(student);

            }else {
                boolean isTrue = true;
                for (int i = 0; i < courses.get(courseName).size(); i++) {
                    if (courses.get(courseName).get(i).equals(student)){
                        isTrue = false;
                    }
                }

                if (isTrue) {
                    courses.get(courseName).add(student);
                }
            }
            input = scanner.nextLine();
        }

        for (Map.Entry<String, ArrayList<String>> entry : courses.entrySet()) {
            int counter = entry.getValue().size();

            System.out.printf("%s%n", entry.getKey());

            for (int i = 0; i < counter; i++) {
                System.out.printf("-- %s%n", entry.getValue().get(i));
            }
        }


    }
}
