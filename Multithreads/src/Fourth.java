class even extends Thread
{
    public void run() {
        int i;
        for (i = 1; i <= 20; i++) {
            if (i % 2 == 0) {

                System.out.println("even "+i);
            }
        }
    }
}
class odd extends Thread
{
    public void run() {
        int i;
        for (i = 1; i <= 20; i++) {
            if (i % 2 != 0) {
                System.out.println("odd "+i);
            }
        }
    }
}

public class Fourth {
    public static void main(String args[])
    {
        even e=new even();
        odd o=new odd();
        e.start();
        o.start();
    }
}