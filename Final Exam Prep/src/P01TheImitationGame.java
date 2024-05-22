import java.util.Scanner;

public class P01TheImitationGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String activationKey = scanner.nextLine();

        String input = scanner.nextLine();

        while (!input.equals("Generate")){
            String[] commandArr = input.split(">>>");
            String command = commandArr[0];
            String secondPart = commandArr[1];

            switch (command){
                case "Contains":
                    if(activationKey.contains(secondPart)){
                        System.out.println(activationKey + " contains " + secondPart);
                    }else {
                        System.out.println("Substring not found!");
                    }
                    break;
                case "Flip":
                    int firstIndex = Integer.parseInt(commandArr[2]);
                    int secondIndex = Integer.parseInt(commandArr[3]);
                    String substring = activationKey.substring(firstIndex,secondIndex);

                    if (secondPart.equals("Upper")){

                        activationKey = activationKey.replace(substring, substring.toUpperCase());

                    }else {

                        activationKey = activationKey.replace(substring, substring.toLowerCase());

                    }
                    System.out.println(activationKey);

                    break;
                case "Slice":
                    int startIndex = Integer.parseInt(secondPart);
                    int lastIndex = Integer.parseInt(commandArr[2]);

                    substring = activationKey.substring(startIndex, lastIndex);

                    activationKey = activationKey.replace(substring, "");
                    System.out.println(activationKey);
                    break;
            }



            input = scanner.nextLine();
        }
        System.out.println("Your activation key is: " + activationKey);
    }
}