/**
 * Created by inna on 15/08/2016.
 */
public class task1 {

    public static void main(String[] args){

        Spaсe();

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
            System.out.println(a);
        }
    }
