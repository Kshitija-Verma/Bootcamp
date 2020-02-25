import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Twelth {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,5,7,2,3,5,6,74,56);
        System.out.println( list.stream().sorted().filter(e->e>3).filter(e->e%2==0).limit(1).collect(Collectors.toList()));
    }
}
