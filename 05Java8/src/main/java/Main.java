import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String... args) {
        /*
        Runnable run = new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello school of net - java 8");
            }
        };
        new Thread(run).start();

        Runnable run1 = () -> System.out.println("JAVA 8 - Lambda");
        new Thread(run1).start();

        new Thread(()-> System.out.println("JAVA 8 lambda")).start();
        */

        // Outro exemplo

        List<String> strs = Arrays.asList("Jose","Maria", "JAVA", "JAVA 8");
        for(String str: strs){
            System.out.println(str);
        }

        System.out.println( "Com lambda: ");
        strs.forEach(str-> System.out.println(str));

        System.out.println("Filtro com M");
        List<String> result = strs.stream()
                                .filter(str->str.startsWith("M"))
                                .collect(Collectors.toList());
        result.forEach(System.out::println);

    }
}
