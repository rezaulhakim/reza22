package advJava;

import java.util.Arrays;

public class LowestDiffRRentArray {


    public static void main(String[] args) {


        int[]x= {211, 110, 99, 34, 67,};

        Arrays.sort(x);

        int diff = Integer.MAX_VALUE;

        for(int y=0; y<x.length-1;y++){

            if(x[y+1]-x[y] <diff){

                diff=x[y+1]-x[y];

            }


        }
        System.out.println(diff);





    }
}












