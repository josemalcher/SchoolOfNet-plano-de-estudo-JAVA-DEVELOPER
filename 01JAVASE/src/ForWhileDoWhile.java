import java.util.ArrayList;
import java.util.List;

public class ForWhileDoWhile {
    public static void main(String[] args) {
        int[] idades = new int[1000];
        idades[0] = 10;
        idades[1] = 12;
        idades[2] = 15;

        List<Integer> idadesList = new ArrayList<>();
        idadesList.add(10);
        idadesList.add(20);
        idadesList.add(15);

        for (int i = 0; i < idadesList.size(); i++) {
            Integer number = idadesList.get(i);
            /* if(number > 1){
                System.out.println("É maior que um");
            }*/
            System.out.println(number);
        }

        int index = 0;
        while (index < idadesList.size()) {
            Integer number = idadesList.get(index);
            System.out.println(number);
            index++;
        }


        index = 0; //zerando o contador
        do {
            Integer number = idadesList.get(index);
            System.out.println(number);

            index++;
        } while (index < idadesList.size());


    }
}
