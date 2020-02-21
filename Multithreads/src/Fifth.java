class Waitnotify
{
    public void myProducer() throws InterruptedException {
        synchronized (this)
        {
            System.out.println("By Producer->>>>Produced");
            wait();
            System.out.println("The item is consumed and resumed");
        }
    }
    public  void myConsumer() throws InterruptedException {
        synchronized (this)
        {
            Thread.sleep(3000);
            System.out.println("By Consumer ->>> Consumed");
            notify();
        }
    }

}


public class Fifth {
    public static void main(String[] args) {

        Waitnotify f1=new Waitnotify();

        Thread t1=new Thread(new Runnable() {
            @Override
            public void run() {

                try {
                    f1.myProducer();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });


        Thread t2=new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    f1.myConsumer();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        t1.start();
        t2.start();
    }

}