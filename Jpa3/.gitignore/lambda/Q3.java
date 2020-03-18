package lambda;
/*Using (instance) Method reference create and apply add and subtract
method and using (Static) Method reference create and apply multiplication
 method for the functional interface created.
 */
interface Arithmatic
{
    void arithmatic(int a,int b);
}

public class Q3
{
    public static void add(int a,int b)
    {
        a=a+b;
        System.out.println(a);
    }
    public static void sub(int a,int b)
    {
        a=a-b;
        System.out.println(a);
    }
    void mul(int a,int b)
    {
        a=a*b;
        System.out.println(a);
    }

    public static void main(String[] args) {
        Arithmatic staticmethod=Q3::add;
        staticmethod.arithmatic(3,4);
        Arithmatic staticsub=Q3::sub;
        staticsub.arithmatic(3,4);
        Arithmatic nonstaticmul=new Q3()::mul;
        nonstaticmul.arithmatic(3,4);
    }
}
