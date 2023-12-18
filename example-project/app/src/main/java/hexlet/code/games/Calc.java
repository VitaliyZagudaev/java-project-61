package hexlet.code.games;

import hexlet.code.Generator;
import hexlet.code.Game;

public class Calc {

    public static void calc() {

        Game.setGameManual("What is the result of the expression?");

        Game.setGameRandom(Generator.generator());
        int number1 = Game.getGameRandom();
        Game.setGameRandom(Generator.generator());
        int number2 = Game.getGameRandom();

        Game.setGameRandom(Generator.generatorThree());
        int operation = Game.getGameRandom();

        String operator = "";
        int result = 0;

        if (operation == 1) {
            operator = "+";
            result = (number1 + number2);

        } else if (operation == 2) {
            operator = "-";
            result = (number1 - number2);

        } else if (operation == 3) {
            operator = "*";
            result = (number1 * number2);
        }

        Game.setGameResult(Integer.toString(result));
        Game.setGameQwestion("Question: " + number1 + " " + operator + " " + number2);
    }
}
