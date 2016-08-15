/**
 * Created by inna on 15/08/2016.
 */
public class task1 {

    public static void main(String[] args){

        Word(); // Task 1
        Spaсe(); // Task 2 + BONUS 3
        WordWithM(); // BONUS 1

        String text = "Lorem  ipsum dolor sit amet, consectetur " +
                " adipiscing elit. Sed do eiusmod tempor incididunt ut labore et dolore  magna aliqua.";

    }

        private static void Spaсe() {

            String text = "Lorem  ipsum dolor sit amet, consectetur " +
                    " adipiscing elit. Sed do eiusmod tempor incididunt ut labore et dolore  magna aliqua.";

            char[] chArray = text.toCharArray();

            int a = 0;

            for(int i = 0; i<chArray.length; i++){

                if(chArray[i] == ' '){

                    a = a + 1;

                }
            }

            System.out.println("Spaces amount = " + a);

        }

        private static void Word() {

            String text = "Lorem  ipsum dolor sit amet, consectetur " +
                " adipiscing elit. Sed do eiusmod tempor incididunt ut labore et dolore  magna aliqua.";

            boolean isContain = true;

                while(isContain = text.contains("  ")) {

                text = text.replace("  ", " ");

            } // Bonus 3 Замінити подвійні пробіли одинарними

            String[] textParts = text.split(" ");

            System.out.println("Wolds amount = " + textParts.length);

    }

        private static void WordWithM() {

            String text = "Lorem  ipsum dolor sit amet, consectetur " +
                    " adipiscing elit. Sed do eiusmod tempor incididunt ut labore et dolore  magna aliqua.";

            boolean isContain = true;

                while(isContain = text.contains("  ")) {

                text = text.replace("  ", " ");
            }

            String[] textParts = text.split(" ");

            int WordWithM = 0;

            for(int i = 0; i<textParts.length; i++){

                if(textParts[i].contains("m")){

                    WordWithM = WordWithM + 1;
                }
            }

            System.out.println("Words with M amount = " + WordWithM);
        }
    }
