package lambda;
interface Override
{
    default void show(){};
}
public class seventh implements Override
{
    public void show()
    {
        System.out.println("Overridded Default");
    }
    public static void main(String arg[])
    {
        seventh s=new seventh();
        s.show();
    }
}
