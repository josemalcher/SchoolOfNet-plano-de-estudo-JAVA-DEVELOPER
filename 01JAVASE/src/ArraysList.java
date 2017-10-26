import java.util.ArrayList;
import java.util.List;

public class ArraysList {
    public static void main(String[] args) {

        int[] idades = new int[1000];
        idades[0] = 10;
        idades[1] = 12;
        idades[2] = 15;

        List<Integer> idadesList = new ArrayList<>();
        idadesList.add(10);
        idadesList.add(20);
        idadesList.add(15);

        //idadesList.remove(idadesList.indexOf(20));

        for(Integer idade : idadesList){
            System.out.println(idade);
        }


    }
}
