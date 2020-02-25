
interface CreateAccess{
    static void displayName(){
        System.out.println("Your name is Kshitija");


    }
    default void displayAge(){
        System.out.println("Your age is 21");

    }


}
public class Sixth implements CreateAccess {
    public static void main(String[] args) {
        Sixth cr = new Sixth();
        cr.displayAge();
        CreateAccess.displayName();

    }

}
