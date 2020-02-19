class Clone1{
    int a ;
    int b;
}
class Clone2 implements Cloneable{
    int x;
    int y;
    Clone1 c = new Clone1();
    public Object clone() throws CloneNotSupportedException
    {
        return super.clone();
    }
}
class Copyconstructor {
     int x;
     int y;

    public Copyconstructor () {
        x = 10;
        y = 20;

    }
}



    public class Fifth {
        public static void main(String[] args) throws CloneNotSupportedException {
            Clone2 c1 = new Clone2();
            c1.x = 5;
            c1.y = 6;
            c1.c.a = 7;
            c1.c.b = 8;

            Clone2 c2 = (Clone2) c1.clone();
            c2.c.b = 50;

            System.out.println(c1.x + " " + c1.y + " " + c1.c.a + " " + c1.c.b);
            System.out.println(c2.x + " " + c2.y + " " + c2.c.a + " " + c2.c.b);

            //BY using copy constructor

           Copyconstructor cc = new Copyconstructor();
           Copyconstructor cc1 =cc;
           cc1.x=20;
           System.out.println(cc.x+" "+cc.y+" "+cc1.x+" "+cc1.y);

        }

    }

