import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P10SoftUniCoursePlanning {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        List<String> program = Arrays.stream(scanner.nextLine().split(", ")).collect(Collectors.toList());

        String input = scanner.nextLine();

        while (!input.equals("course start")) {
            String[] command = input.split(":");

            switch (command[0]) {
                case "Add":
                    if (!program.contains(command[1])) {
                        program.add(command[1]);
                    }
                    break;
                case "Insert"://Arrays, Lists, Methods
                    //Insert:Arrays:0
                    if (program.size() > Integer.parseInt(command[2])) {
                        if (!program.contains(command[1])) {
                            program.add(Integer.parseInt(command[2]), command[1]);
                        }
                    }
                    break;
                case "Remove":
                    program.remove(command[1]);
                    program.remove(command[1] + "-Exercise");
                    break;
                case "Swap"://Arrays, Lists, Methods
                    if (program.contains(command[1]) && program.contains(command[2])) {
                        if (!program.contains(command[1] + "-Exercise") && !program.contains(command[2] + "-Exercise")) {
                            String first = program.get(program.indexOf(command[1]));
                            String second = program.get(program.indexOf(command[2]));
                            int index = program.indexOf(command[1]);
                            int index2 = program.indexOf(command[2]);

                            program.set(index, second);
                            program.set(index2, first);

                        } else if (program.contains(command[1] + "-Exercise") && !program.contains(command[2] + "-Exercise")) {
                            String first = program.get(program.indexOf(command[1]));
                            String firstEx = program.get(program.indexOf(command[1] + "-Exercise"));
                            String second = program.get(program.indexOf(command[2]));
                            int index = program.indexOf(command[1]);
                            int index2 = program.indexOf(command[2]);


                            program.set(index, second);
                            program.set(index2, first);
                            program.add(index2 + 1, firstEx);

                        } else if (program.contains(command[2] + "-Exercise") && !program.contains(command[1] + "-Exercise")) {
                            String first = program.get(program.indexOf(command[2]));
                            String firstEx = program.get(program.indexOf(command[2] + "-Exercise"));
                            String second = program.get(program.indexOf(command[1]));
                            int index = program.indexOf(command[2]);
                            int index2 = program.indexOf(command[1]);

                            program.set(index, second);
                            program.set(index2, first);
                            program.remove(firstEx);
                            program.add(index2 + 1, firstEx);

                        } else {
                            String first = program.get(program.indexOf(command[1]));
                            String firstEx = program.get(program.indexOf(command[1] + "-Exercise"));
                            String second = program.get(program.indexOf(command[2]));
                            String secondEx = program.get(program.indexOf(command[2] + "-Exercise"));
                            int index = program.indexOf(command[1]);
                            int index2 = program.indexOf(command[2]);


                            program.set(index, second);
                            program.add(index + 1, secondEx);
                            program.remove(firstEx);
                            program.set(index2, first);
                            program.add(index2 + 1, firstEx);
                            program.remove(secondEx);


                        }
                    }
                    break;
                case "Exercise":
                    if (program.contains(command[1])) {
                        if (!program.contains(command[1] + "-Exercise")) {
                            int i = program.indexOf(command[1]);
                            program.add(i + 1, command[1] + "-Exercise");
                        }
                    } else {
                        program.add(command[1]);
                        program.add(command[1] + "-Exercise");
                    }
                    break;
            }


            input = scanner.nextLine();
        }
        int i = 1;
        for (String s : program) {

            System.out.println(i + "." + s);
            i++;
        }


    }
}
