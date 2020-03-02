package testdome.racer;

public class Racer implements Runnable {
    private String name;

    public Racer(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(100);
            System.out.println(name);
        } catch (Exception e) {
            //
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Thread r1 = new Thread(new Racer("1"));
        Thread r2 = new Thread(new Racer("2"));
        Thread r3 = new Thread(new Racer("3"));
        Thread r4 = new Thread(new Racer("4"));
        Thread r5 = new Thread(new Racer("5"));

        r1.start();
        r2.start();
        r3.start();
        r3.join();
        r4.start();
        r4.start();
        r4.join();
        r5.start();
        r5.join();
    }
}
