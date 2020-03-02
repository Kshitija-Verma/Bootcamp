
public class First {
    public volatile int count;
    public static void main(String[] args) {
        First fi = new First();
        fi.example();

    }

        public void example() {
            Thread thread1 = new Thread(new Runnable() {
                public void run() {
                    for (int i = 0; i < 100; i++) {

                        count++;
                        System.out.println(count);


                    }
                }
            });
            thread1.start();
            Thread thread2 = new Thread(new Runnable() {
                public void run() {
                    for (int i = 0; i < 100; i++) {

                        count++;
                        System.out.println(count);


                    }
                }
            });
            thread2.start();

            try {
                thread1.join();
                thread2.join();
            } catch (InterruptedException ignored) {}


    }

}
