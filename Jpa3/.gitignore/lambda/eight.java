package lambda;
interface i1
{
    default void display(){
        System.out.println("i1");
    };
}
interface i2
{
    default void display(){
        System.out.println("i2");
    };
}
public class eight implements i1,i2
{
    public void display()
    {
        System.out.println("Hello");
    }

    public static void main(String[] args) {
        eight e=new eight();
        e.display();
    }
}
