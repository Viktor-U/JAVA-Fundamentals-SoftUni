import java.util.*;

public class P03Pirates {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map <String, Integer> cityPopulation = new LinkedHashMap<>();
        Map <String, Integer> cityGold = new LinkedHashMap<>();

        String input = scanner.nextLine();
        while (!input.equals("Sail")){

            String[] inputArr = input.split("\\|\\|");
            String city = inputArr[0];
            int population = Integer.parseInt(inputArr[1]);
            int gold = Integer.parseInt(inputArr[2]);

            if (!cityPopulation.containsKey(city)) {

                cityPopulation.put(city, population);
                cityGold.put(city, gold);

            }else {

                int oldGold = cityGold.get(city);
                int oldPopulation = cityPopulation.get(city);

                cityGold.remove(city);
                cityPopulation.remove(city);

                cityGold.put(city,oldGold + gold);
                cityPopulation.put(city, population + oldPopulation);

            }
            input = scanner.nextLine();
        }

        input = scanner.nextLine();
        while (!input.equals("End")){

            String command = input.split("=>")[0];
            String town = input.split("=>")[1];
            int gold = 0;

            switch (command){
                case "Plunder":

                    int people = Integer.parseInt(input.split("=>")[2]);
                    gold = Integer.parseInt(input.split("=>")[3]);

                    if (people >= cityPopulation.get(town) || gold >= cityGold.get(town)){

                        cityPopulation.remove(town);
                        cityGold.remove(town);

                        System.out.printf("%s plundered! %d gold stolen, %d citizens killed.%n", town, gold, people);
                        System.out.println(town + " has been wiped off the map!");

                    }else {

                        cityGold.replace(town, cityGold.get(town), cityGold.get(town) - gold);
                        cityPopulation.replace(town, cityPopulation.get(town), cityPopulation.get(town) - people);

                        System.out.printf("%s plundered! %d gold stolen, %d citizens killed.%n", town, gold, people);

                    }

                    break;
                case "Prosper":

                    gold = Integer.parseInt(input.split("=>")[2]);

                    if (gold < 0 ){

                        System.out.println("Gold added cannot be a negative number!");

                    }else {

                        cityGold.replace(town, cityGold.get(town), cityGold.get(town) + gold);

                        System.out.printf("%d gold added to the city treasury. %s now has %d gold.%n", gold, town, cityGold.get(town));

                    }


                    break;
            }
            input = scanner.nextLine();
        }

        List<String> town = new ArrayList<>();
        List<Integer> gold = new ArrayList<>();
        List<Integer> people = new ArrayList<>();


        for (Map.Entry<String, Integer> stringIntegerEntry : cityGold.entrySet()) {

            town.add(stringIntegerEntry.getKey());
            gold.add(stringIntegerEntry.getValue());

        }
        for (Map.Entry<String, Integer> stringIntegerEntry : cityPopulation.entrySet()) {

            people.add(stringIntegerEntry.getValue());

        }


        if (town.size() > 0) {
            System.out.printf("Ahoy, Captain! There are %d wealthy settlements to go to:%n", town.size());

            for (int i = 0; i < town.size(); i++) {


                System.out.printf("%s -> Population: %d citizens, Gold: %d kg%n", town.get(i), people.get(i), gold.get(i));

            }
        }else {

            System.out.println("Ahoy, Captain! All targets have been plundered and destroyed!");

        }
    }
}
