package THread;

class ThreadClass extends Thread {
    public void run() {
        for (int i = 0; i <= 5; i++) {
            System.out.println("one thread");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }
}

class ThreadClasstwo extends Thread {
    public void run() {
        for (int i = 0; i <= 5; i++) {
            System.out.println("2nd thread");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }

        }
    }
}

class ThreadDemo {

    public static void main(String[] args) {

        ThreadClass t = new ThreadClass();
        ThreadClasstwo t1 = new ThreadClasstwo();

        t.start();
        t1.start();
    }

}