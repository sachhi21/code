package THread;

class DataInitializer {
}

public class Lock {
    static int initialVal;

    public static void increase() {
        initialVal = initialVal + 1;
    }

    public static void main(String[] args) throws InterruptedException {
        Runnable ch1 = () -> {
            for (int i = 0; i <= 100; i++) {
                increase();
            }
        };
        Runnable ch2 = () -> {
            for (int i = 0; i <= 100; i++) {
                increase();
            }
        };
        Thread t1 = new Thread(ch1);
        Thread t2 = new Thread(ch2);

        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println(initialVal);
    }
}