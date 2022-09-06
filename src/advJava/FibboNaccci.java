package advJava;

public class FibboNaccci {

    public static void main(String[] args) {

        int x = 40, FirstTerm = 0, SecondTerm = 1;
        int fibo;

        for (int i = 0; i < x; i++) {

            fibo = FirstTerm + SecondTerm;
            FirstTerm = SecondTerm;
            SecondTerm = fibo;

            System.out.println(fibo);
        }


    }











}
