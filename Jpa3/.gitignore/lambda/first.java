package lambda;
interface  CheckGreater
{
    Boolean bool(int a,int b);
}
interface  Increment
{
    int inc(int a);
}
interface Concating
{
    String con(String a,String b);
}
interface UpperCase
{
    String upper(String a);
}
public class first
{
    public static void main(String args[])
    {
        CheckGreater cg = (int a,int b)->
        {
            if(a>b)
            {
                return true;
            }
            else
            {
                return false;
            }
        };
        Increment in=(int a)->
        {
            a++;
            return a;
        };
        Concating con=(String a,String b)->
        {
            return a+b;
        };
        UpperCase uc = (String a)->
        {
          return a.toUpperCase();
        };
        System.out.println(cg.bool(6,7));
        System.out.println(in.inc(4));
        System.out.println(con.con("spider","man"));
        System.out.println(uc.upper("adarsh"));
    }
}
