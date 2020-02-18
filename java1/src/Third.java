import java.util.Scanner;

public class Third {
    public static void main(String[] args) {
        String str = "Hello world ! this is Kshitija Verma From To The New.";
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the character ");
                String  c = sc.next();
        int count = str.length()-str.replace(c,"").length();
        System.out.println(" Number of occurence of "+ c + "is" + count);
    }
}
