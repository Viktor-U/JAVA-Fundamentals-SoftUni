import java.util.*;

public class P03ThePianist {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());

        Map<String, String> pieceKey = new LinkedHashMap<>();
        Map<String, String> pieceComposer = new LinkedHashMap<>();

        for (int i = 0; i < num; i++) {
            String[] input = scanner.nextLine().split("\\|");
            String piece = input[0];
            String composer = input[1];
            String key = input[2];

            pieceKey.putIfAbsent(piece,key);
            pieceComposer.putIfAbsent(piece,composer);

        }
        String input = scanner.nextLine();

        while (!input.equals("Stop")){
            String[] inputArr = input.split("\\|");
            String piece = inputArr[1];
            switch (inputArr[0]){
                case "Add":

                    String composer = inputArr[2];
                    String key = inputArr[3];

                    if (pieceKey.containsKey(piece)){
                        System.out.println(piece + " is already in the collection!");
                    }else {
                        pieceKey.putIfAbsent(piece, key);
                        pieceComposer.putIfAbsent(piece, composer);

                        System.out.printf("%s by %s in %s added to the collection!%n", piece, composer, key);
                    }
                    break;
                case "Remove":


                    if (pieceKey.containsKey(piece)){
                        pieceKey.remove(piece);
                        pieceComposer.remove(piece);
                        System.out.printf("Successfully removed %s!%n", piece);
                    }else {
                        System.out.printf("Invalid operation! %s does not exist in the collection.%n", piece);
                    }

                    break;
                case "ChangeKey":
                    String newKey = inputArr[2];

                    if (pieceKey.containsKey(piece)){
                        pieceKey.replace(piece, newKey);
                        System.out.printf("Changed the key of %s to %s!%n", piece, newKey);
                    }else {
                        System.out.printf("Invalid operation! %s does not exist in the collection.%n", piece);
                    }


                    break;
            }
            input = scanner.nextLine();
        }
        List<String> piece = new ArrayList<>();
        List<String> composer = new ArrayList<>();
        List<String> key = new ArrayList<>();


        for (Map.Entry<String, String> stringStringEntry : pieceKey.entrySet()) {
            piece.add(stringStringEntry.getKey());
            key.add(stringStringEntry.getValue());
        }
        for (Map.Entry<String, String> stringEntry : pieceComposer.entrySet()) {
            composer.add(stringEntry.getValue());
        }

        for (int i = 0; i < piece.size(); i++) {

            System.out.printf("%s -> Composer: %s, Key: %s%n", piece.get(i), composer.get(i), key.get(i));

        }


    }
}
