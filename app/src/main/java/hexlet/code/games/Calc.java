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
        String operation = Integer.toString(Game.getGameRandom());

        String operator = "";
        int result = 0;

        switch (operation) {
            case "1":
                operator = "+";
                result = (number1 + number2);
                break;

            case "2":
                operator = "-";
                result = (number1 - number2);
                break;

            case "3":
                operator = "*";
                result = (number1 * number2);
                break;
            default:
                break;
        }

        Game.setGameResult(Integer.toString(result));
        Game.setGameQuestion("Question: " + number1 + " " + operator + " " + number2);
    }
}
