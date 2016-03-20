package ua.kiev.prog.modules;

/**
 * Created by dzidzoiev on 3/20/16.
 */
public class PureExample {
    static int counter;

    public static int add(int a, int b) {
        return a + b;
    }

    public static int add(int... a) {
        int res = 0;
        for (int element : a) {
            res += element;
        }
        return res;
    }

    public static int inpureAdd(int a, int b) {
        counter++;
        int result = a + b;
        System.out.println(result);
        return result;
    }
}
