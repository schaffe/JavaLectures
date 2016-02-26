package ua.kiev.prog.multithreading;

/**
 * Created by dzidzoiev on 2/18/16.
 */
public class Incrementor {
    static volatile int number = 100000;
    static Object monitor = new Object();

    public static void main(String[] args) {
        Thread increment = new Thread( () -> {
            for (int i = 0; i < 50; i++) {
//                number = number + 1;
//                synchronized (ua.prog.multithreading.Incrementor.class) {
                    try {
                        Thread.sleep(1);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                        throw new IllegalStateException(e);
                    }
                    number++;
//                }
                System.out.println(number);
            }
        });

        Thread decrement = new Thread( () -> {
            for (int i = 0; i < 50; i++) {
//                synchronized (ua.prog.multithreading.Incrementor.class) {
//                    try {
//                        Thread.sleep(1);
//                    } catch (InterruptedException e) {
//                        e.printStackTrace();
//                        throw new IllegalStateException(e);
//                    }
                    number--;
//                }
                System.out.println(number);
            }
        });

        increment.start();
        decrement.start();
    }
}
