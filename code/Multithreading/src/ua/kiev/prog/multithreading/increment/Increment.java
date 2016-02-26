package ua.kiev.prog.multithreading.increment;

/**
 * Created by dzidzoiev on 2/26/16.
 */
public class Increment
{
  static volatile int counter;
  public static int INCREMENT_COUNT = 1_000_000;

  public static void main( String[] args ) throws InterruptedException
  {
    Runnable incrementorRunnable = new Runnable()
    {
      @Override
      public void run()
      {
        for ( int i = 0; i < INCREMENT_COUNT; i++ )
        {
//          synchronized ( Increment.class )
//          {
            counter++;
//          }
        }
      }
    };

    Thread incrementor1 = new Thread(incrementorRunnable);
    Thread incrementor2 = new Thread(incrementorRunnable);
    incrementor1.start();
    incrementor2.start();

    incrementor1.join();
    incrementor2.join();

    System.out.println(counter);
  }
}
