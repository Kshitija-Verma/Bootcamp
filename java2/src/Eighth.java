import java.util.Scanner;

public class Eighth {
    public static void main(String[] args) {
        Eighth e = new Eighth();
        e.UsingWhile();
        e.UsingDoWhile();

    }

    void UsingWhile() {
        Scanner sc = new Scanner(System.in);
        String word = new String();
        while (!word.equals("done")) {
            System.out.println("Enter a word");
            word = sc.next();
            if (word.contains(" ")) {
                System.out.println("Enter only single word");
                return;
            }

            Character c1 = Character.toLowerCase(word.charAt(0));
            Character c2 = Character.toLowerCase(word.charAt(word.length() - 1));

            if (c1.compareTo(c2) == 0) {
                System.out.println("First and last character is same that is : " + c1);
            } else {
                System.out.println("Not matched");
            }

            System.out.println("Type done if you want to exit");
            word = sc.next();

        }
    }

    void UsingDoWhile() {
        Scanner sc = new Scanner(System.in);
        String word = new String();
        do {
                System.out.println("Enter a word");
                word = sc.next();
                if (word.contains(" ")) {
                    System.out.println("Enter only single word");
                    return;
                }

                Character c1 = Character.toLowerCase(word.charAt(0));
                Character c2 = Character.toLowerCase(word.charAt(word.length() - 1));

                if (c1.compareTo(c2) == 0) {
                    System.out.println("First and last character is same that is : " + c1);
                } else {
                    System.out.println("Not matched");
                }

                System.out.println("Type done if you want to exit");
                word = sc.next();

            }while (!word.equals("done")) ;


    }
}
