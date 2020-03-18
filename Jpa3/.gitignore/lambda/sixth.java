package lambda;
interface DefaultStatic
{
    default void display()
    {
        System.out.println("its is default");
    }
    static void show()
    {
        System.out.println("it is static method");
    }
}
public class sixth implements DefaultStatic
{
    public static void main(String[] args)
    {
        DefaultStatic ds=new sixth();
        ds.display();
        DefaultStatic.show();
    }
}
