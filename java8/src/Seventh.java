interface OverRideMethod{
    default void displayName(){
        System.out.println("your name is Kshitija");
    }
}
public class Seventh implements OverRideMethod {

    public void displayName(){
        System.out.println("your age is 21");
    }


    public static void main(String[] args) {
        Seventh ss = new Seventh();
        ss.displayName();



    }
}
