import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P01MatchFullName {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String text = scanner.nextLine();
        //Ivan Ivanov, Ivan ivanov, ivan Ivanov, IVan Ivanov, Georgi Georgiev, Ivan   Ivanov
//dasd


        Pattern pattern = Pattern.compile("\\b([A-Z][a-z]+) ([A-Z][a-z]+)");

        Matcher matcher = pattern.matcher(text);

        while (matcher.find()){
            System.out.print(matcher.group() + " ");
        }
    }
}