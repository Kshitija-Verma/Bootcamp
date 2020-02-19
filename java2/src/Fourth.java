class Singleton{
     int a , b ;
     private static Singleton sc = null;
     private Singleton(){
         a = 10;
         b=20;
     }
     public static Singleton getInstance(){
         if(sc==null){
             sc = new Singleton();

         }
         return sc;
     }

}
public class Fourth {
    public static void main(String[] args) {
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();
        Singleton s3 = Singleton.getInstance();
        System.out.println("Values before change :");
        System.out.println(s1.a+" " +s1.b);
        System.out.println(s2.a+" " +s2.b);
        System.out.println(s3.a+" " +s3.b);

        s1.a = 50;
        s1.b = 70;
        System.out.println("Values after change :");
        System.out.println(s1.a+ " " +s1.b);
        System.out.println(s2.a+" " +s2.b);
        System.out.println(s3.a +" "+ s3.b);
    }

}
