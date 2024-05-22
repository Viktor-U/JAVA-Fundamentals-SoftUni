import java.util.Scanner;

public class P05Messages {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
         int num = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < num; i++) {
            int letter = Integer.parseInt(scanner.nextLine());

            if (letter == 2) {
                System.out.print("a");
            } else if (letter == 22) {
                System.out.print("b");
            } else if (letter == 222) {
                System.out.print("c");
            } else if (letter == 3) {
                System.out.print("d");
            } else if (letter == 33) {
                System.out.print("e");
            } else if (letter == 333) {
                System.out.print("f");
            } else if (letter == 4) {
                System.out.print("g");
            } else if (letter == 44) {
                System.out.print("h");
            } else if (letter == 444) {
                System.out.print("i");
            } else if (letter == 5) {
                System.out.print("j");
            } else if (letter == 55) {
                System.out.print("k");
            } else if (letter == 555) {
                System.out.print("l");
            } else if (letter == 6) {
                System.out.print("m");
            } else if (letter == 66) {
                System.out.print("n");
            } else if (letter == 666) {
                System.out.print("o");
            } else if (letter == 7) {
                System.out.print("p");
            } else if (letter == 77) {
                System.out.print("q");
            } else if (letter == 777) {
                System.out.print("r");
            } else if (letter == 7777) {
                System.out.print("s");
            } else if (letter == 8) {
                System.out.print("t");
            } else if (letter == 88) {
                System.out.print("u");
            } else if (letter == 888) {
                System.out.print("v");
            } else if (letter == 9) {
                System.out.print("w");
            } else if (letter == 99) {
                System.out.print("x");
            } else if (letter == 999) {
                System.out.print("y");
            } else if (letter == 9999) {
                System.out.print("z");
            }else {
                System.out.print(" ");
            }
        }
    }
}
