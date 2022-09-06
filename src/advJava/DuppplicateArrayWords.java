package advJava;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class DuppplicateArrayWords {

    public static void main(String[] args) {

        List<String>names= new ArrayList<>(
                Arrays.asList("Jannath","Abdullah","Tanzida","Sifath","Rezaul","Noor","Jannath","Abdullah")
        );

        System.out.println("List of Names"+names);


        List<String>NewNames= names.stream()
                .distinct()
                .collect(Collectors.toList());

        System.out.println();








    }











}
