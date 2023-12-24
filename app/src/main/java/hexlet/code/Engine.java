package hexlet.code;

import java.util.Scanner;

public class Engine {

    public static void engine() {

        String verdictVictory = "Congratulations, " + User.getUserName() + '!';
        String verdictDefeat = "Let's try again, " + User.getUserName() + '!';

        final int rounds = 3;

        System.out.println(Game.getGameManual());

        int index = 0;
        while (index < rounds) {

            Call.call();

            System.out.println(Game.getGameQuestion());
            System.out.print("Your answer: ");

            Scanner scanner = new Scanner(System.in);
            Game.setUserAnswer(scanner.next());

            String answer = Game.getUserAnswer();
            String result = Game.getGameResult();

            if (Game.getGameResult().equals(Game.getUserAnswer())) {
                System.out.println("Correct!");
                index++;
            } else {
                System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '" + result + "'.");
                break;
            }
        }
        if (index == rounds) {
            System.out.println(verdictVictory);
        } else {
            System.out.println(verdictDefeat);
        }
    }
}
