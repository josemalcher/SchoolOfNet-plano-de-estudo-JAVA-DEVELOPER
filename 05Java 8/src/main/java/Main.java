import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String... args) {

        List<String> strs = Arrays.asList("Jose", "Malcher", "Email", "Java");

        /*for(String str : strs){
            System.out.println(str);
        }

        System.out.println("---------Lambdas----------");
        strs.forEach(str -> System.out.println(str));
        */
        List<String> result = strs.stream()
                .filter(str -> str.startsWith("E"))
                .collect(Collectors.toList());

        result.forEach(System.out::println);

    }
}
