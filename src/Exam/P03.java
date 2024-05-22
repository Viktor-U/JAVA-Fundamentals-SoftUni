package Exam;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> priceRating = Arrays.stream(scanner.nextLine().split(", ")).map(Integer::parseInt).collect(Collectors.toList());
        int entryPoint = Integer.parseInt(scanner.nextLine());
        String typeItems = scanner.nextLine();

        int entryPointNum = priceRating.get(entryPoint);

        List<Integer> left = new ArrayList<>();
        List<Integer> right = new ArrayList<>();

        for (int i = 0; i < entryPoint; i++) {
            left.add(priceRating.get(i));
        }

        for (int i = entryPoint + 1; i < priceRating.size(); i++) {
            right.add(priceRating.get(i));
        }

        int leftPrice = 0;
        int rightPrice = 0;

        if (typeItems.equals("cheap")){

            for (Integer value : left) {
                if (value < entryPointNum) {
                    leftPrice += value;
                }
            }
            for (Integer integer : right) {
                if (integer < entryPointNum) {
                    rightPrice += integer;
                }
            }

        }if (typeItems.equals("expensive")){
            for (Integer value : left) {
                if (value >= entryPointNum) {
                    leftPrice += value;
                }
            }
            for (Integer integer : right) {
                if (integer >= entryPointNum) {
                    rightPrice += integer;
                }
            }
        }

        if (leftPrice >= rightPrice){

            System.out.println("Left - " + leftPrice);

        }else {

            System.out.println("Right - " + rightPrice);

        }
    }
}
