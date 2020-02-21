import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class Second {
    public static void main(String[] args) {
        int flag = 0;
        System.out.println("Enter a String :");
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        HashSet<Character> hash = new HashSet();
        for(int i = 0 ; i<str.length();i++)
        {
             hash.add(str.charAt(i));

        }
        Iterator<Character> it = hash.iterator();
        while(it.hasNext())
        { flag++;
        System.out.print(it.next()+" ");}
        System.out.println();
        System.out.println("The number of unique  characters are: "+ flag);

    }
}
