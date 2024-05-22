package P05Students;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<Student> students = new ArrayList<>();

        String input = scanner.nextLine();
        while (!input.equals("end")) {

            String[] inputArr = input.split(" ");

            String firstName = inputArr[0];
            String lastName = inputArr[1];
            String age = inputArr[2];
            String town = inputArr[3];

            Student currentStudent = new Student(firstName, lastName, age, town);

            students.add(currentStudent);

            input = scanner.nextLine();
        }

        String needTown = scanner.nextLine();

        for (Student student : students) {
            if (student.getTown().equals(needTown)) {
                System.out.printf("%s %s is %s years old%n", student.getFirstName(), student.getLastName(), student.getAge());
            }
        }


    }


}
