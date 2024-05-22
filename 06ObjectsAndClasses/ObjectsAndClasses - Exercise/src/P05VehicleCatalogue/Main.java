package P05VehicleCatalogue;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Vehicle> vehiclesList = new ArrayList<>();

        String input = scanner.nextLine();
        while (!input.equals("End")){

            String type = input.split(" ")[0];
            String model = input.split(" ")[1];
            String color = input.split(" ")[2];
            int horsePower = Integer.parseInt(input.split(" ")[3]);

            Vehicle currentVehicle = new Vehicle(type, model, color, horsePower);
            vehiclesList.add(currentVehicle);

            input = scanner.nextLine();
        }

        String command = scanner.nextLine();
        while (!command.equals("Close the Catalogue")){

            for (Vehicle vehicle : vehiclesList) {
                if (vehicle.getModel().equals(command)){
                    System.out.print(vehicle);
                    System.out.println();
                }
            }

            command = scanner.nextLine();
        }

        int carsHorsepower = 0;
        int countCars = 0;

        int trucksHorsepower = 0;
        int countTrucks = 0;

        for (Vehicle vehicle : vehiclesList) {
            if (vehicle.getType().equals("car")){

                carsHorsepower += vehicle.getHorsePower();
                countCars++;

            } else if (vehicle.getType().equals("truck")) {

                trucksHorsepower += vehicle.getHorsePower();
                countTrucks++;

            }
        }
        double averageCarSpeed = 0;
        if (carsHorsepower != 0 && countCars != 0){
            averageCarSpeed = carsHorsepower * 1.0 / countCars;
        }
        double averageTruckSpeed = 0;
        if (trucksHorsepower != 0 && countTrucks !=0) {
            averageTruckSpeed = trucksHorsepower * 1.0 / countTrucks;
        }
        System.out.printf("Cars have average horsepower of: %.2f.%n", averageCarSpeed);
        System.out.printf("Trucks have average horsepower of: %.2f.", averageTruckSpeed);


    }
}
