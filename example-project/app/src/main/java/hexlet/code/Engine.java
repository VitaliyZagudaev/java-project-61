package hexlet.code;

import java.util.Scanner;

public class Engine {

    public static void engine() {

        String verdictVictory = "Congratulations, " + User.getUserName() + '!';
        String verdictDefeat = "Let's try again, " + User.getUserName() + '!';

        System.out.println(Game.getGameManual());

        int index = 0;
        while (index < 3) {

            Call.call();

            System.out.println(Game.getGameQuestion());
            System.out.print("Your answer: ");

            Scanner scanner = new Scanner(System.in);
            Game.setUserAnswer(scanner.next());

            if (Game.getGameResult().equals(Game.getUserAnswer())) {
                System.out.println("Correct!");
                index++;
            } else {
                System.out.println("'" + Game.getUserAnswer() + "' is wrong answer ;(. Correct answer was '" + Game.getGameResult() + "'.");
                break;
            }
        }
        if (index == 3) {
            System.out.println(verdictVictory);
        } else {
            System.out.println(verdictDefeat);
        }
    }
}
