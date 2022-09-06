package advJava;

public class FuzzzBuzzz {


    public static void main(String[] args) {

        for(int i=1; i<=125;i++) {

            if (i % 5 == 0) {
                System.out.println("its a Buzz");
            } else if (i % 3 == 0) {

                System.out.println("its a Fuzz");
            } else if (i % 3 == 0 && i % 5 == 0) {

                System.out.println("Its a FuzzBuzz");
            }

            else{
                System.out.println("Input values wriiten wrong");
            }



        }









    }










}
