import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class String_to_UpperCase {
    
    public static void main(String[] args) {
        
        List<String> words = Arrays.asList("java","oracle Sql","spring","hibernate");

        List<String> upper = words.stream()
                                  .map(String::toUpperCase)
                                  .collect(Collectors.toList());

        System.out.println(upper);

    }
}
