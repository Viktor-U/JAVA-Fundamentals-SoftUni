import java.util.Scanner;

public class P07StringExplosion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        StringBuilder result = new StringBuilder();
        char[] text = input.toCharArray();

        int explosionStrength = 0;

        for (int i = 0; i < text.length; i++) {

            if (text[i] == '>'){
                explosionStrength += Integer.parseInt(String.valueOf(text[i + 1]));
                result.append(text[i]);
            }else {
                if (explosionStrength == 0){
                    result.append(text[i]);

                }else {
                    explosionStrength--;
                }
            }

        }


        System.out.println(result);

    }
}
