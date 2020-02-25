@FunctionalInterface
interface MethodReference{
    int arithmeticCal(int a,int b);
}

public class Third {

    int add(int a , int b){
        int c = a+b;
        return c;
    }

    int subtract(int a , int b){
        int c = a-b;
        return c;
    }

  static  int multiply(int a , int b){
        int c = a*b;
        return c;
    }

    public static void main(String[] args) {
        Third th = new Third();

        System.out.println("********* Instance  method reference of add and subtract");

        MethodReference mr = th::add;
        System.out.println("Addition : "+ mr.arithmeticCal(7,4));

        mr = th::subtract;
        System.out.println("Subtraction: "+ mr.arithmeticCal(7,4));
        System.out.println("********************** Static method reference of multiply");
        mr = Third::multiply;
        System.out.println("Multiplication : " + mr.arithmeticCal(7,4));

    }
}
