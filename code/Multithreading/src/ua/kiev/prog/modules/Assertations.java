package ua.kiev.prog.modules;

/**
 * Created by dzidzoiev on 3/20/16.
 */
public class Assertations {
    public static void main(String[] args) {
        assert Calculator.add(2,2) == 4;
        assert Calculator.add(2,2) == 3;
    }
}
