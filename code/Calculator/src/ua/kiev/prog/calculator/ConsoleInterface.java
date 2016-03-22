package ua.kiev.prog.calculator;

/**
 * Created by Admin on 21.03.2016.
 */
public class ConsoleInterface {

    public static String interpret(String... args) {
        String action = args[0];
        int a = Integer.parseInt(args[1]);
        int b = Integer.parseInt(args[2]);

        switch (action) {
            case "add":
                return toResult(Calculator.add(a, b));
            case "sub":
                return toResult(Calculator.subtract(a, b));
//                break;
            case "div":
                return toResult(Calculator.divide(a, b));
//                break;
            case "mul":
                return toResult(Calculator.multiply(a, b));
//                break;
            default:
                return "NoSuchMethodError!";
        }

    }

    private static String toResult(int result) {
            return Integer.toString(result);
        }
    }
