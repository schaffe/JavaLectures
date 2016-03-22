package ua.kiev.prog.calculator;

import java.util.Scanner;

/**
 * Created by Admin on 21.03.2016.
 */
public class Executor {
    public static void main(String[] args) {
        execute();
    }

    private static void execute() {
        Scanner scanner = new Scanner(System.in);

        String readValue = "";
        while (true) {
            readValue = scanner.nextLine();
            if( readValue.equals("exit"))
                break;
            String[] commands = readValue.split(" ");
            String result = ConsoleInterface.interpret(commands);
            System.out.println(result);
        }
        System.out.println("Bue-bue");
    }
}
