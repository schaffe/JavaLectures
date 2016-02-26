package ua.kiev.prog.multithreading.legend;

/**
 * Created by dzidzoiev on 2/25/16.
 */
public class EggLobbyist extends Thread
{
  @Override
  public void run()
  {
    for ( int i = 0; i < 10; i++ )
    {
      try
      {
        Thread.sleep( 500 );
        System.out.println("Egg!");
      }
      catch ( InterruptedException e )
      {
        e.printStackTrace();
      }
    }
  }
}
