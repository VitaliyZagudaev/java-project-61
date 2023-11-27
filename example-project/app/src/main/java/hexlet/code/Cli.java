package hexlet.code;

import java.util.Scanner;

public class Cli {
    public static void cli() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the game number and press Enter.");

        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("3 - Calc");
        System.out.println("0 - Exit");

        System.out.print("Your choice: ");
        String choice = scanner.next();

        switch (choice) {
            case "1":
                Greet.greet();
                break;

            case "2":
                Even.even();
                break;

            case "3":
                Calc.calc();

            case "0":
                break;

            default:
                System.out.println("Please enter the correct value.");
        }
    }
}
