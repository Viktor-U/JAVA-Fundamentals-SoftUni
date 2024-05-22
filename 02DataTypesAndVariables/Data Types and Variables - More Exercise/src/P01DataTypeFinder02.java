import java.util.Scanner;

public class P01DataTypeFinder02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String input = scanner.nextLine();

        while (!input.equals("END")){

            String dataType = "";


            //boolean
            // char

            //floating point
            //integer
            //string


            if (input.equalsIgnoreCase("false") || input.equalsIgnoreCase("true")){

                dataType = "boolean";

            } else if (input.length() == 1) {


                if (input.charAt(0) >= 58 || input.charAt(0) <= 44 || input.charAt(0) == 47){

                    dataType = "character";

                }else {
                    dataType = "integer";
                }
            }else  {
                boolean isString = false;
                boolean isFloating = false;


                    for (int i = 0; i < input.length() ; i++) {
                        if (input.charAt(i) < 45 || input.charAt(i) > 57 ) {
                            isString = true;

                        }

                        if (input.charAt(i) == 46){
                            isFloating = true;
                    }
                }

                if (isString){
                    dataType = "string";
                }else if (isFloating) {
                    dataType = "floating point";
                }else {
                    dataType = "integer";
                }


            }
            System.out.printf("%s is %s type%n",input, dataType);

            input = scanner.nextLine();
        }



    }
}
