import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P03ShootForTheWin {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        String input = scanner.nextLine();
        int shotTargets = 0;

        while (!input.equals("End")){

            int index = Integer.parseInt(input);

// 1 2 3 -1
// index 3
            if (numbers.size() > index){

                shotTargets++;
                int num = numbers.get(index);//4
                numbers.set(index, -1);


                for (int i = 0; i < numbers.size(); i++) {

                    if (numbers.get(i) <= num && numbers.get(i) != -1) {

                        numbers.set(i,num + numbers.get(i));

                    }else if (numbers.get(i) > num && numbers.get(i) != -1) {

                        numbers.set(i,numbers.get(i) - num );

                    }
                }


            }

            input = scanner.nextLine();

        }
        System.out.printf("Shot targets: %d -> ", shotTargets);

        System.out.println(numbers.toString().replaceAll("[\\[\\],]", ""));
    }
}
