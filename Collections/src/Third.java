import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Third {
    public static void main(String[] args) {
        int count = 0;

        System.out.println("Enter a String : ");
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        HashMap<Character,Integer> hs = new HashMap<Character,Integer>();

        char[] ch = str.toCharArray();
        for(char c : ch){
            if(hs.containsKey(c)){
                hs.put(c,hs.get(c)+1);
            }
            else
                hs.put(c,1);
        }

            for (Map.Entry<Character,Integer> en : hs.entrySet()) {
                char key = en.getKey();
                int value = en.getValue();
                System.out.println(key + " " + value);


        }
    }
}