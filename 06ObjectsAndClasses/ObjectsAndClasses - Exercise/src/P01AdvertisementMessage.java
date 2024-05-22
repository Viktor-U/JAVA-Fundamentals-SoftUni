import java.util.Random;
import java.util.Scanner;

public class P01AdvertisementMessage {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);

        String[] phrases = {"Excellent product.",
                "Such a great product.",
                "I always use that product.",
                "Best product of its category.",
                "Exceptional product.",
                "I can’t live without this product."};

        String[] events = {"Now I feel good.",
                "I have succeeded with this product.",
                "Makes miracles. I am happy of the results!",
                "I cannot believe but now I feel awesome.",
                "Try it yourself, I am very satisfied.",
                "I feel great!"
        };

        String[] authors = {"Diana",
                "Petya",
                "Stella",
                "Elena",
                "Katya",
                "Iva",
                "Annie",
                "Eva"
        };
        String[] cities = {"Burgas",
            "Sofia",
            "Plovdiv",
            "Varna",
            "Ruse"
        };


        int num = Integer.parseInt(scanner.nextLine());
        Random random = new Random();

        for (int i = 0; i < num ; i++) {

            int phrase = random.nextInt(6);
            int event = random.nextInt(6);
            int author = random.nextInt(8);
            int city = random.nextInt(5);


            System.out.printf("%s %s %s - %s%n", phrases[phrase], events[event], authors[author], cities[city]);

        }





    }
}