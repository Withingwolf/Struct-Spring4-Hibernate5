public class TreadTest extends Thread {
    public static void main(String[] args) {
        Thread thread = new TreadTest();
        thread.start();

    }

    @Override
    public synchronized void start() {
//        super.start();
    }

    @Override
    public void run() {
        super.run();
        System.out.println("12345");
    }
}
