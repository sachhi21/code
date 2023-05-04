package THread;

class ChildThreadTwo implements Runnable {
    public void run() {
        for (int i = 0; i <= 5; i++) {
            System.out.println("one Show");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }
}

public class SecondRunnable {
    public static void main(String[] args) {
        Runnable ch1 = () -> {
            for (int i = 0; i <= 5; i++) {
                System.out.println("two   Show");
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        };
        ChildThreadTwo ch2 = new ChildThreadTwo();
        System.out.println(Thread.currentThread().getName());

        // ch1.setPriority(Thread.MAX_PRIORITY);
        // System.out.println(ch1.getPriority());
        // System.out.println(ch2.getPriority());
        Thread t1 = new Thread(ch1);
        Thread t2 = new Thread(ch2);
        t1.start();
        t2.start();
    }
}
