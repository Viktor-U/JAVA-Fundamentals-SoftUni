import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class P03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Integer> animalFood = new LinkedHashMap<>();
        Map<String, String> animalHabitat = new LinkedHashMap<>();

        String input = scanner.nextLine();
        while (!input.equals("EndDay")){
            String command = input.split(": ")[0];
            String needInfo = input.split(": ")[1];

            String animal = needInfo.split("-")[0];
            int food = Integer.parseInt(needInfo.split("-")[1]);
            String habitat = "";

            if (command.equals("Add")){
                habitat = needInfo.split("-")[2];

                if (!animalFood.containsKey(animal)) {
                    animalFood.putIfAbsent(animal, food);
                    animalHabitat.putIfAbsent(animal, habitat);
                }else {
                    animalFood.replace(animal, animalFood.get(animal) + food);
                }

            }else {
                if (animalFood.containsKey(animal)) {
                    if (animalFood.get(animal) <= food) {

                        System.out.println(animal + " was successfully fed");

                        animalFood.remove(animal);
                        animalHabitat.remove(animal);

                    } else {

                        animalFood.replace(animal, animalFood.get(animal) - food);

                    }
                }
            }
            input = scanner.nextLine();
        }
        System.out.println("Animals:");

        for (Map.Entry<String, Integer> stringIntegerEntry : animalFood.entrySet()) {
            System.out.println(stringIntegerEntry.getKey().trim() + " -> " + stringIntegerEntry.getValue() + "g");
        }

        System.out.println("Areas with hungry animals:");

        Map<String,Integer> areaAnimal = new LinkedHashMap<>();

        for (Map.Entry<String, String> stringStringEntry : animalHabitat.entrySet()) {

            String habit =  stringStringEntry.getValue();

            if (!areaAnimal.containsKey(habit)){
                areaAnimal.put(habit, 1);
            }else {
                areaAnimal.replace(habit, areaAnimal.get(habit) + 1);
            }

        }

        for (Map.Entry<String, Integer> stringIntegerEntry : areaAnimal.entrySet()) {
            System.out.println(stringIntegerEntry.getKey() + ": " + stringIntegerEntry.getValue());
        }


    }
}
