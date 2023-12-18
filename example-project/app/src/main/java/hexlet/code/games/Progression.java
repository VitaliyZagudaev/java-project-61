package hexlet.code.games;

import hexlet.code.Game;
import hexlet.code.Generator;

public class Progression {
    public static void progression() {
        Game.setGameManual("What number is missing in the progression?");

        Game.setGameRandom(Generator.generatorFiveTen());
        int elementsInSequence = Game.getGameRandom();
        int firstNumber = Generator.generatorNine();
        int stepSequence = Generator.generatorTwoNine();
        int nextNumber = firstNumber;
        int elementToHide = Generator.generatorOneRandom();
        int numberHide = 0;

        String[] sequence = new String[elementsInSequence];
        String hide = "..";

        for (int i = 0; i < elementsInSequence; i++) {
            if (i == elementToHide - 1) {
                nextNumber += stepSequence;
                numberHide = nextNumber;
                sequence[i] = hide;
            } else {
                nextNumber = nextNumber + stepSequence;
                sequence[i] = Integer.toString(nextNumber);
            }
        }

        var sequenceToPrint = new StringBuilder();
        for (var element : sequence) {
            sequenceToPrint.append(element);
            sequenceToPrint.append(" ");
        }

        Game.setGameResult(Integer.toString(numberHide));
        Game.setGameQwestion("Question: " + sequenceToPrint);
    }
}
