package advJava;

public class PrimmeeNmberr {


    public static void main(String[] args) {


        for(int a=2;a<=10000;a++){

            boolean keynumber= true;

            for(int b=2;b<a;b++){

                if(a%b == 0){

                    keynumber= false;
                    break;

                }

            }
            if(keynumber==true){
                System.out.println(a);
            }

        }

    }
}








