import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Fifth {
    public static void main(String[] args) {
        ////// Consumer Functional Interface ///////
        System.out.println("********** Consumer Interface ************");
        Consumer<Integer> con = (e)-> System.out.println(e);

        con.accept(20);

        /////// Supplier Functional Interface  //////////
        System.out.println("********** Supplier Interface ************");
        Supplier<Integer> sup = ()-> 5;

        System.out.println( sup.get());

        //////// Predicate Functional Interface /////////

        System.out.println("********** Predicate Interface ************");

        Predicate<String> str = (e)->{
            return e.startsWith("no");
        };
        System.out.println(str.test("snora"));

        ///////// Function Interface ////////////

        System.out.println("********** Function Interface ************");

        Function<Integer , Float> fu = (e)->{
            return e+1.3f;
        };
        System.out.println(fu.apply(6));
    }
}
