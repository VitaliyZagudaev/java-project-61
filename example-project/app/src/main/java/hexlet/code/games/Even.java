package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Game;
import hexlet.code.Generator;

public class Even {
    public static void even() {

        Game.setGameManual("Answer 'yes' if the number is even, otherwise answer 'no'.");

        Game.setGameRandom(Generator.generator());
        int number = Game.getGameRandom();

        String result = ((number % 2) == 0) ? "yes" : "no";
        Game.setGameResult(result);
        Game.setGameQwestion("Question: " + number);
    }
}
