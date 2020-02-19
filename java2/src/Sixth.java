import java.util.Scanner;

public class Sixth {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        System.out.println("Enter two numbers:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int ar[] = new int[]{1,2,3,4,5,6};
        System.out.println("Enter the index of array");
        int i1 = sc.nextInt();
        String str = "This is kshitija";
        System.out.println("Enter the index of character to be searched");
        int i2 = sc.nextInt();
        try{
            float c = a/b;
            ar[i1] = 5;
            System.out.println(str.charAt(i2));
        }
        catch(ArithmeticException ae){
            System.out.println("Denominator must be non-zero");
        }
        catch (ArrayIndexOutOfBoundsException aie){
            System.out.println("insufficient array size");
        }
        catch(Exception e){
            System.out.println(" Parent Exception occurs");
        }
        finally {
            System.out.println("End of the code reached5");
        }
    }


}
