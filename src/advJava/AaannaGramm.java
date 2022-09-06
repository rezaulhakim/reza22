package advJava;

import java.util.Arrays;

public class AaannaGramm {

    public static void main(String[] args) {

        String a= "PEACH";
        String b= "STATE";
        String c= "CHEAP";
        String d="TASTE";

        char e[]= a.toCharArray();
        char f[]=b.toCharArray();
        char g[]=c.toCharArray();
        char h[]=d.toCharArray();

        Arrays.sort(e);
        Arrays.sort(f);
        Arrays.sort(g);
        Arrays.sort(h);

        if(Arrays.equals(e,g)){
            System.out.println("this is Anagarm");
        }else {
            System.out.println("this is not Anagarm");
        }
        if(Arrays.equals(f,h)){
            System.out.println("This is Anagram");
        }else{
            System.out.println("This is not Anagram");
        }








    }









}
