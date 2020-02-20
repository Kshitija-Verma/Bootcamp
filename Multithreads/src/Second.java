class ExampleThread extends Thread{
    public void run(){
        for(int i=0;i<10;i++)
            System.out.println(i);
    }
}
class ExampleRunnable implements Runnable{
    public void run(){
        for (int i=10;i<20;i++)
            System.out.println(i);
    }

}


public class Second {
    public static void main(String[] args) {
        ExampleThread et = new ExampleThread();
        et.start();
        Thread er = new Thread(new ExampleRunnable());
        er.start();
    }
    }

