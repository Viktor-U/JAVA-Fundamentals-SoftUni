package Exam;

import java.util.Scanner;

public class P01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double needExperience = Double.parseDouble(scanner.nextLine());
        int countBattles = Integer.parseInt(scanner.nextLine());
        double experience = 0;
        int battleCounter = 0;

        for (int i = 1; i <= countBattles; i++) {

            double experiencePerBattle = Double.parseDouble(scanner.nextLine());

            if (i % 3 == 0){
                experiencePerBattle = experiencePerBattle * 1.15;
            }
            if (i % 5 == 0){
                experiencePerBattle = experiencePerBattle * 0.9;
            }
            if (i % 15 == 0){
                experiencePerBattle = experiencePerBattle * 1.05;
            }
            experience += experiencePerBattle;
            battleCounter = i;
            if (experience >= needExperience){

                break;
            }
        }

        if (experience >= needExperience){
            System.out.printf("Player successfully collected his needed experience for %d battles.", battleCounter);
        }else {
            System.out.printf("Player was not able to collect the needed experience, %.2f more needed.", needExperience - experience);
        }



    }
}
