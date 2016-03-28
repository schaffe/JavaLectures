package ua.kiev.prog.sort;

/**
 * Something todo
 */
public class bubble_sort
{
  public static int classVar1;

  private static int[] An_Array;
  public static void sort (int[] Array){
    int n = Array.length, temp = 0;

    for(int i = 0; i < n; i++)
    for (int j=1; j<(n-i);j++){

      if (Array[j - 1] > Array [j]){
        //swap the elements!
        temp = Array[j - 1];
      Array[j - 1] = Array[j];
      Array[j] = temp;
      }
    }
  }

  private static boolean DoAnother_Very_long_MethodName(boolean a, boolean b, boolean c, boolean d) {
    return (a == b && c == d);
  }
}
