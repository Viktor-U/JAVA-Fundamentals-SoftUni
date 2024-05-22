package P04Students;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Student> studentsList = new ArrayList<>();

        int num = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < num; i++) {

            String input = scanner.nextLine();
            String firstName = input.split(" ")[0];
            String lastName = input.split(" ")[1];
            double great = Double.parseDouble(input.split(" ")[2]);

            Student currentStudent = new Student(firstName, lastName, great);

            studentsList.add(currentStudent);

        }

        Collections.sort(studentsList, Comparator.comparingDouble(Student::getGrade).reversed());

        for (Student student : studentsList) {
            System.out.println(student);
        }


    }
}
