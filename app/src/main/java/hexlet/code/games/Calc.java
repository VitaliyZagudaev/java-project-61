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

        int plus = 1;
        int minus = 2;
        int multiply = 3;
        int result = 0;

        if (operation == plus) {
            operator = "+";
            result = (number1 + number2);

        } else if (operation == minus) {
            operator = "-";
            result = (number1 - number2);

        } else if (operation == multiply) {
            operator = "*";
            result = (number1 * number2);
        }

        Game.setGameResult(Integer.toString(result));
        Game.setGameQuestion("Question: " + number1 + " " + operator + " " + number2);
    }
}
