package lambda;
interface MethodMaking
{
    int add(int a,int b);
}
public class second {
    public static void main(String args[]) {
        MethodMaking mm = (int a, int b) ->
        {
            a = a + b;
            return a;
        };
        System.out.println(mm.add(4, 6));
    }
}
