import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.Semaphore;

 class Connection {

    private static Connection instance = new Connection();

    private Semaphore sem = new Semaphore(10, true);
    private int connections = 0;

    private Connection() {
    }

    public static Connection getInstance() {
        return instance;
    }

    public void connect() {
        try {


            sem.acquire();


            doConnect();

        } catch (InterruptedException ignored) {
        } finally {

            sem.release();
        }
    }

    public void doConnect() {
        synchronized (this) {
            connections++;
            System.out.println("Current connections (max 10 allowed): " + connections);
        }
        try {
            System.out.println("Working on connections " + Thread.currentThread().getName());
            Thread.sleep(2000);
        } catch (InterruptedException ignored) {}

        synchronized (this) {
            connections--;
            System.out.println("I'm done " + Thread.currentThread().getName() + " Connection is released , connection count: " + connections);
        }
    }
}

 class Connectionn {

    private static Connectionn instance = new Connectionn();

    private Semaphore sem = new Semaphore(10, true);

    private Connectionn() {
    }

    public static Connectionn getInstance() {
        return instance;
    }

    public void connect() {
        try {


            sem.acquire();

            System.out.printf("%s:: Current connections (max 10 allowed): %d\n",
                    Thread.currentThread().getName(),
                    sem.availablePermits());


            System.out.printf("%s:: WORKING...\n",
                    Thread.currentThread().getName());
            Thread.sleep(2000);

            System.out.printf("%s:: Connection released. Permits Left = %d\n",
                    Thread.currentThread().getName(),
                    sem.availablePermits());

        } catch (InterruptedException ignored) {
        } finally {
            sem.release();
        }
    }
}

public class Eighth {
    public static void main(String[] args) throws Exception {
        ExecutorService executor = Executors.newCachedThreadPool();

        for (int i = 0; i < 20; i++) { //200 hundred times will be called
            executor.submit(new Runnable() {
                public void run() {
                    Connectionn.getInstance().connect();
                }
            });
        }

        executor.shutdown();
        executor.awaitTermination(1, TimeUnit.DAYS);
    }
}
