import java.lang.*;
public class Eighth {
    public static void main(String[] args) {

        StringBuffer sb = new StringBuffer("This is Kshitija Verma");
        sb.reverse();
        System.out.println(sb);
        sb.delete(4,9);
        System.out.println("Removed string: "+ sb);
    }
}
