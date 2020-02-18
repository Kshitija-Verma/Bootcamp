import java.sql.SQLOutput;
import java.util.Scanner;

public class Seventh{
    static private int age;
    static private String firstname;
    static private String lastname;
    static{
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter firstname");
firstname = sc.next();
        System.out.println("Enter lastname");
        lastname = sc.next();
        System.out.println("Enter age");
        age = sc.nextInt();
        getDetails();

    }
static void getDetails()
{
    System.out.println("Hi " + firstname + " " + lastname + " your age is " + age);
}

    public static void main(String[] args) {

    }
}
