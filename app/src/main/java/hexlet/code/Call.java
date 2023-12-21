package hexlet.code;

import hexlet.code.games.Calc;
import hexlet.code.games.Even;
import hexlet.code.games.GCD;
import hexlet.code.games.Progression;
import hexlet.code.games.Prime;

public class Call {
    public static void call() {
        switch (Cli.getUserChoice()) {
            case "2":
                Even.even();
                break;

            case "3":
                Calc.calc();
                break;

            case "4":
                GCD.gcd();
                break;

            case "5":
                Progression.progression();
                break;

            case "6":
                Prime.prime();
                break;
        }
    }
}
