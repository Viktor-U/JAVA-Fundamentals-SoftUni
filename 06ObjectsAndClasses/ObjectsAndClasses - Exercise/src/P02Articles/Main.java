package P02Articles;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        String title = input.split(", ")[0];
        String content = input.split(", ")[1];
        String author = input.split(", ")[2];


        Article article = new Article(title, content, author);

        int num = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < num; i++) {
            String command = scanner.nextLine();
            String commandAction = command.split(": ")[0];
            String commandPhrase = command.split(": ")[1];

            if (commandAction.equals("Edit")){

                article.Edit(commandPhrase);

            } else if (commandAction.equals("ChangeAuthor")) {

                article.changeAuthor(commandPhrase);

            }else if (commandAction.equals("Rename")){

                article.rename(commandPhrase);

            }
        }

        System.out.println(article);

    }
}
