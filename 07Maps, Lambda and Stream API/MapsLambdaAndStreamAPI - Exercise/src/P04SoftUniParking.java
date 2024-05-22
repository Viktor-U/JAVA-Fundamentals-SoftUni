import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class P04SoftUniParking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, String> cars = new LinkedHashMap<>();

        int num = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < num; i++) {

            String[] input = scanner.nextLine().split(" ");
            String command = input[0];
            String name = input[1];



            switch (command){
                case "register":
                    String plateNum = input[2];
                    if (!cars.containsKey(name)){

                        cars.put(name, plateNum);
                        System.out.printf("%s registered %s successfully%n", name, plateNum);

                    }else {
                        System.out.printf("ERROR: already registered with plate number %s%n", plateNum );
                    }

                    break;
                case "unregister":

                    if (!cars.containsKey(name)){

                        System.out.printf("ERROR: user %s not found%n", name);

                    }else {

                        cars.remove(name);
                        System.out.printf("%s unregistered successfully%n", name);
                    }

                    break;
            }
        }

        cars.forEach((key, value) -> System.out.printf("%s => %s%n",key, value));

//        for (Map.Entry<String, String> stringStringEntry : cars.entrySet()) {
//            System.out.printf("%s => %s%n",stringStringEntry.getKey(), stringStringEntry.getValue());
//        }


    }
}
