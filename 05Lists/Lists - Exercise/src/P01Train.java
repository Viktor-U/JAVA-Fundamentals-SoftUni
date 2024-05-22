import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P01Train {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        List<Integer> wagons = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        int maxCapacity = Integer.parseInt(scanner.nextLine());
        String input = scanner.nextLine();

        while (!input.equals("end")){

            if (input.contains("Add") ){
                String [] add = input.split(" ");
                wagons.add(Integer.parseInt(add[1]));

            }else{
                int num = Integer.parseInt(input);

                for (int i = 0; i < wagons.size(); i++) {
                    if (wagons.get(i) + num <= maxCapacity){
                        wagons.set(i, wagons.get(i) + num);
                        break;
                    }
                }
            }
            input = scanner.nextLine();
        }

        for (int n:wagons) {
            System.out.print(n + " ");
        }
    }
}