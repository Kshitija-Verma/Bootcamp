interface Furniture{
    void StressTest();
    void FireTest();
}
class Woodenchair implements Furniture{
public void StressTest() {
    System.out.println("Stress Test for Wooden chair : PASS");

}
public void FireTest(){
    System.out.println("Fire Test for Wooden chair : FAIL");
}
}
class Woodentable implements Furniture{

    public void StressTest(){
        System.out.println("Stress Test for Wooden table : PASS");
    }
    public void FireTest(){
        System.out.println("Fire Test for Wooden chair : FAIL");
    }
}
class Metalchair implements Furniture{
    public void StressTest(){
        System.out.println("Stress Test for Metal chair : FAIL");
    }
    public void FireTest(){
        System.out.println("Fire Test for Metal chair : PASS");
    }

}
class Metaltable implements Furniture{
    public void StressTest(){
        System.out.println("Stress Test for Metal table : FAIL");
    }
    public void FireTest(){
        System.out.println("Fire Test for Metal table : PASS");
    }

}

public class Nineth {
    public static void main(String[] args) {

        Furniture f1 = new Woodenchair();
        Furniture f2 = new Woodentable();
        Furniture f3 = new Metalchair();
        Furniture f4 = new Metaltable();
        f1.StressTest();
        f1.FireTest();
        f2.StressTest();
        f2.FireTest();
        f3.StressTest();
        f3.FireTest();
        f4.StressTest();
        f4.FireTest();


    }

}
