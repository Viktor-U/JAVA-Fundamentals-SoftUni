import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class P04Songs {
    private static class Song {
        String typeList;
        String name;
        String time;

        public Song (String typeList, String name , String time){

            this.typeList = typeList;
            this.name = name;
            this.time = time;


        }

        public String getName() {
            return name;
        }

        public String getTypeList() {
            return typeList;
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());

        List<Song> musicList = new ArrayList<>();

        for (int i = 0; i < num; i++) {

            String inputLine = scanner.nextLine();
            String[] songsArr = inputLine.split("_");

            String typeList = songsArr[0];
            String name = songsArr[1];
            String time = songsArr[2];

            Song currentSong = new Song(typeList, name, time);

            musicList.add(currentSong);

        }

        String command = scanner.nextLine();

        if (command.equals("all")){
            for (int i = 0; i < num; i++) {
                System.out.println(musicList.get(i).getName());
            }
        }else {
            for (int i = 0; i < num; i++) {
                if (musicList.get(i).getTypeList().equals(command)){

                    System.out.println(musicList.get(i).getName());
                }


            }

        }


    }
}
