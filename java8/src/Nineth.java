import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Nineth {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,5,7,2,3,5,6,8,10,45,56,78,23,45);
        System.out.println(list.stream().filter(e->e%2==0).collect(Collectors.toList()));
    }
}
