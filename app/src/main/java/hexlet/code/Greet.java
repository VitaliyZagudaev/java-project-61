package hexlet.code;

import java.util.Scanner;

public class Greet {
    public static void greet() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");

        User.setUserName(scanner.next());
        System.out.println("Hello, " + User.getUserName() + "!");
        //Cli.cli();
    }
}
