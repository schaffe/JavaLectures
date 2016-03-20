package ua.kiev.prog.modules;

/**
 * Created by dzidzoiev on 3/20/16.
 */
public class CallByValueExample {

    public static void changeValue(int foo) {
        foo = 4;
    }

    public static void changeValue(int[] foo) {
        foo[0] = 4;
    }

    public static void main(String[] args) {
        int foo = 5;
        changeValue(foo);

        System.out.println(foo);

        int[] fooReference = {5};
        changeValue(fooReference);

        System.out.println(fooReference[0]);
    }

}
