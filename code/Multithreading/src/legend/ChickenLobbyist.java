package legend;

/**
 * Created by dzidzoiev on 2/25/16.
 */
public class ChickenLobbyist
{
  public static void main( String[] args )
  {
    EggLobbyist eggLobbyist = new EggLobbyist();
    eggLobbyist.start();

    for ( int i = 0; i < 10; i++ )
    {
      try
      {
        Thread.sleep( 500 );
        System.out.println("Chicken!");
      }
      catch ( InterruptedException e )
      {
        e.printStackTrace();
      }
    }

    if( eggLobbyist.isAlive() ) {
      try
      {
        eggLobbyist.join();
        System.out.println("Egg was firs!!!");
      }
      catch ( InterruptedException e )
      {
        e.printStackTrace();
      }
    } else {
      System.out.println("Chicken was first!!!");
    }
  }
}
