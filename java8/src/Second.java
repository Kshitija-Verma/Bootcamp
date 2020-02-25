@FunctionalInterface
interface IntReturn{
    int returnInt(int a,int b);

}
public class Second {
    public static void main(String[] args) {
        IntReturn ir = (e,e1)->{
            return e+e1;
        };
        System.out.println(ir.returnInt(4,5));

    }
}
