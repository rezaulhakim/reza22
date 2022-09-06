package advJava;

public class PellinnDDromme {


    public static void main(String[] args) {

        String a = "NOON";
        StringBuffer ref1 = new StringBuffer(a);
        ref1.reverse();
        String b = ref1.reverse().toString();

        if(a.equals(b)){
            System.out.println("NOON IS PELINDROME");
        }
        else{
            System.out.println("NOON IS NOT PELINDROME");
        }
        String d = "ROTATOR";
        StringBuffer ref2 = new StringBuffer(d);
        ref1.reverse();
        String e = ref2.reverse().toString();

        if(d.equals(e)){
            System.out.println("ROTATOR IS PELINDROME");
        }
        else {
            System.out.println("ROTATOR IS NOT PELINDROME");

        }

        String f = "KAYAK";
        StringBuffer ref3 = new StringBuffer(f);
        ref1.reverse();
        String g = ref3.reverse().toString();

        if(f.equals(g)){
            System.out.println("KAYAK IS PELINDROME");
        }
        else {
            System.out.println("KAYAK IS NOT PELINDROME");

        }





    }
}


