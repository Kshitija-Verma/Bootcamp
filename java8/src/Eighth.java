interface One{
    default void printOne(){
        System.out.println("One");
    }
}

interface Two{
    default void printTwo(){
        System.out.println("Two");
    }
}
public class Eighth implements One,Two {
    public static void main(String[] args) {
        Eighth ei = new Eighth();
        ei.printOne();
        ei.printTwo();
    }
}
