package ua.kiev.prog.sort;

/**
 * Created by dzidzoiev on 3/28/16.
 */
public class Strings
{
  public static void main( String[] args )
  {
    String str1 = new String("test").intern();
    String str2 = new String("test").intern();
    String str3 = "test";
    System.out.println(str1 == str2);
    System.out.println(str1 == str3);
  }
}
