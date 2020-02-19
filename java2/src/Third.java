class Test{
    public void display(){
        System.out.println("Displayed test");
    }
}
public class Third {
    public static void main(String[] args) throws Exception{


        Class clazz = Class.forName("Person");
        Test t1 =new Test();
        t1.display();
    }
}
