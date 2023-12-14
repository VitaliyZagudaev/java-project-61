package hexlet.code;

import hexlet.code.games.Calc;
import hexlet.code.games.Even;

import java.util.Scanner;

public class Cli {

    private static String userChoice;

    Cli(String choice) {
        this.userChoice = choice;
    }

    public static void setUserChoice(String choice) {
        userChoice = choice;
    }

    public static String getUserChoice() {
        return userChoice;
    }

    public static void cli() {

        Scanner scanner = new Scanner(System.in);
        String choice = scanner.next();
        Cli.setUserChoice(choice);

        switch (choice) {
            case "1":
                Greet.greet();
                break;

            case "2":
                Greet.greet();
                Even.even();
                Engine.engine();
                break;

            case "3":
                Greet.greet();
                Calc.calc();
                Engine.engine();
                break;

            case "0":
                break;

            default:
                System.out.println("Please enter the correct value.");
                break;
        }
    }
}
