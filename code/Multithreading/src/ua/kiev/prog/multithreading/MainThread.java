package ua.kiev.prog.multithreading;

/**
 * Created by dzidzoiev on 2/18/16.
 */
public class MainThread {
    Object monior;

    void a() {
        synchronized (MainThread.class) {
            System.out.println("a");
        }
    }

    synchronized void b() {
        System.out.println("b");
    }

    public static void main(String[] args) {
        Thread thread = new Thread(  );
        thread.destroy();
        thread.suspend();
        thread.stop();
    }
}
