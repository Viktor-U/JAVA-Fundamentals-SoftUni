package P06OrderByAge;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Person> peopleList = new ArrayList<>();

        String input = scanner.nextLine();
        while (!input.equals("End")){

            String name = input.split(" ")[0];
            String id = input.split(" ")[1];
            int age = Integer.parseInt(input.split(" ")[2]);

            Person currentPerson = new Person(name, id, age);
            peopleList.add(currentPerson);

            input = scanner.nextLine();
        }

        Collections.sort(peopleList, Comparator.comparingInt(Person::getAge));

        for (Person person : peopleList) {
            System.out.println(person);
        }

    }
}
