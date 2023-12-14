package hexlet.code;

import hexlet.code.Cli;
import hexlet.code.games.Calc;
import hexlet.code.games.Even;

public class Call {
    public static void call() {
        switch (Cli.getUserChoice()) {
            case "2":
                Even.even();
                break;

            case "3":
                Calc.calc();
                break;
        }
    }
}
