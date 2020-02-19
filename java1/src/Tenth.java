public class Tenth {
    void Add(Integer a , Integer b)
    {
        Integer c = a +b;
        System.out.println("Sum of integer : "+c);

    }
    void Add(double a , double b)
    {
        double c = a+b;
        System.out.println("Sum of double : "+c);
    }
    void Multiply(float a , float b)
    {
        float c = a*b;
        System.out.println("Multiplication of float : "+ c);
    }
    void Multiply(int a , int b)
    {
        float c = a*b;
        System.out.println("Multiplication of int: "+ c);
    }
    void Concate(String s1,String s2)
    {
        String s3=s1+s2;
        System.out.println("Concatenation of two strings : " + s3 );

    }
    void Concate(String s1,String s2,String s3)
    {
        String s4=s1+s2+s3;
        System.out.println("Concatenation of three strings : " + s4 );

    }

    public static void main(String[] args) {
        Tenth t = new Tenth();
        Integer a = new Integer(5);
        Integer b = new Integer(6);

        t.Add(a,b);
        t.Add(5.6,8.7);
        t.Multiply(4,6);
        t.Multiply(3.4f,5.4f);
        t.Concate("hi","hello");
        t.Concate("hi","hello","namaste");
    }
}
