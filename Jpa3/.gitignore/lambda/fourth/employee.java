package lambda.third;
interface employee1
{
    void getemp(String name,int age,String city);
}
class employee2
{
    String name;
    int age;
    String city;
    public employee2(String name,int age,String city)
    {
        this.name=name;
        this.age=age;
        this.city=city;
        printDetails();
    }
    void printDetails()
    {
        System.out.println(name+" "+age+" "+city);
    }
}
public class employee
{
    public static void main(String args[])
    {


        employee1 em = employee2::new;
        em.getemp("Adarsh",22,"LKO");

    }
}
