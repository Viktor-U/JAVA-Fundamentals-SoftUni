import javax.sql.rowset.serial.SerialArray;
import java.sql.Array;
import java.util.*;
import java.util.stream.Collectors;

public class P08AnonymousThreat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> list = Arrays.stream(scanner.nextLine().split(" ")).collect(Collectors.toList());

        String input = scanner.nextLine();

        while (!input.equals("3:1")) {
            String[] inputArr = input.split(" ");

            String command = inputArr[0];
            int firstNum = Integer.parseInt(inputArr[1]);
            int secondNum = Integer.parseInt(inputArr[2]);

            if (command.equals("merge")) {
                List<String> insert = new ArrayList<>();
                int a = Math.min(secondNum, list.size() - 1);
                int b = Math.min(firstNum, list.size());
                for (int i = a; i >= b; i--) {

                    insert.add(list.get(i));
                    list.remove(i);
                }

                if (insert.size() > 0) {
                    String print = "";
                    Collections.reverse(insert);
                    for (String s : insert) {
                        print += s;
                    }
                    list.add(firstNum, print);
                }


            } else if (command.equals("divide")) {
                    //ab cd ef -3
                String word = list.get(Integer.parseInt(inputArr[1]));
                int wordLength = word.length();
                int indexWord = Integer.parseInt(inputArr[1]);
                list.remove(indexWord);
                List<String> newWords = new ArrayList<>();
                double num2 = Double.parseDouble(inputArr[2]);
                if(wordLength *1.0 / num2  % 2 == 0){
                    String littleWord = "";
                    int need = 1;
                    for (int i = 0; i < wordLength ; i++) {
                        char charAt = word.charAt(i);

                        littleWord+=charAt;
                        if (need % (wordLength / Integer.parseInt(inputArr[2])) == 0 ) {
                                newWords.add(littleWord);
                                littleWord = "";

                        }
                        need+= 1;
                    }


                }else {
                    String littleWord = "";
                    int need = 1;
                    for (int i = 0; i < wordLength ; i++) {
                        char charAt = word.charAt(i);

                        littleWord += charAt;

                            if (need % ((wordLength - 1) / Integer.parseInt(inputArr[2])) == 0) {
                                if (wordLength - need != 1) {
                                    newWords.add(littleWord);
                                    littleWord = "";

                                }
                            }

                        need += 1;
                    }
                    newWords.add(littleWord);

                }

                for (int i = 0; i < newWords.size(); i++) {
                    list.add(indexWord + i, newWords.get(i));
                }


            }



            input = scanner.nextLine();
        }

        for (String s : list) {
            System.out.print(s + " ");
        }



    }
}
