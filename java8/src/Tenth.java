import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Tenth {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,4,3,7,9,10,12);
        System.out.println(list.stream().filter(e->e>5).collect(Collectors.summingInt(e->e)));
    }
}
