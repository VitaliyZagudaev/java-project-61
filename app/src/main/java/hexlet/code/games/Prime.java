package hexlet.code.games;

import hexlet.code.Game;
import hexlet.code.Generator;

public class Prime {
    public static void prime() {
        Game.setGameManual("Answer 'yes' if given number is prime. Otherwise answer 'no'.");

        int random = Generator.generator();

        int index = 1;
        int count = 0;
        while (index <= random) {
            if (random % index == 0) {
                index++;
                count++;
            } else {
                index++;
            }
        }

        var result = "";
        if (count == 2) {
            result = "yes";
        } else {
            result = "no";
        }

        Game.setGameResult(result);
        Game.setGameQuestion("Question: " + random);
    }
}
