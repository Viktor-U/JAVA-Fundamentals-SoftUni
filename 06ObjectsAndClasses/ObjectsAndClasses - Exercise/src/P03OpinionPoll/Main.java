package P03OpinionPoll;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Person> peopleList = new ArrayList<>();

        int num = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < num; i++) {

            String input = scanner.nextLine();
            String name = input.split(" ")[0];
            int age = Integer.parseInt(input.split(" ")[1]);

            Person person = new Person(name, age);
            peopleList.add(person);

        }


        for (Person person : peopleList) {
            if (person.getAge() > 30){
                System.out.printf("%s - %d%n", person.getName(), person.getAge());
            }
        }
    }
}
