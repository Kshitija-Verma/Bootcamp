@FunctionalInterface
interface GreaterNumberInterface{
boolean greaterNumber(int a ,int b);
}
@FunctionalInterface
interface IncrementInterface{
    int increment(int a);

}
@FunctionalInterface
interface ConcatenateInterface{
    String concatenation(String s1,String s2);

}
@FunctionalInterface
interface UpperInterface{
    String upper(String s);

}
public class First {
    public static void main(String[] args) {


        GreaterNumberInterface gri = (a,b)->{
            return a>b;
        };
        System.out.println(gri.greaterNumber(5,6));
        IncrementInterface ii = (a)->{
          return ++a;
        };
        System.out.println(ii.increment(7));
    ConcatenateInterface ci = (s1,s2)->{
        return s1+s2;
    };
        System.out.println(ci.concatenation("hello","world"));
    UpperInterface ui = (s)->{
        return s.toUpperCase();
    };
        System.out.println(ui.upper("hello"));
    }
}
