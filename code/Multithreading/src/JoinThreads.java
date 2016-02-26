import java.util.Scanner;

/**
 * Created by dzidzoiev on 2/18/16.
 */
public class JoinThreads {
    public static void main(String[] args) throws InterruptedException
    {
        Scanner scanner = new Scanner(System.in);
        scanner.next();

        Thread a = new Thread(() -> {
            // job a
        });

        a.start();

        Thread b = new Thread(() -> {
            // job b
        });

        b.start();

        a.join();
        b.join();

        Thread.currentThread().interrupt();
        Thread.interrupted();
    }
}
