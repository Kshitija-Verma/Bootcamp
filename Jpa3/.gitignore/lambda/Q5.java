package lambda;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Q5
{
    public static void main(String args[])
    {
        System.out.println("******consumer Interface*******");
        Consumer<Integer> con=e->
        {
            System.out.println(e);


        };
        con.accept(2);
        System.out.println("******Supplier Interface*******");
        Supplier<Double> sup=()-> Math.random();
        System.out.println(sup.get());

        System.out.println("******Predicate Interface*******");
        Predicate<String> pred=(e)->
        {
            return e.startsWith("no");
        };
        System.out.println(pred.test("nokk"));

        System.out.println("******Function Interface*******");
        Function<Integer,Double> fun= e->e/2.0;
        {
            System.out.println(fun.apply(10));
        };
    }
}

