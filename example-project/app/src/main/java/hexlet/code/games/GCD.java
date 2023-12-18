package hexlet.code.games;

import hexlet.code.Generator;
import hexlet.code.Game;

public class GCD {
    public static void gcd() {

        Game.setGameManual("Find the greatest common divisor of given numbers.");

        Game.setGameRandom(Generator.generator());
        int number1 = Game.getGameRandom();
        Game.setGameRandom(Generator.generator());
        int number2 = Game.getGameRandom();

        int result = 1;

        int[] preDevisors1 = new int[number1];
        int[] preDevisors2 = new int[number2];

        int index1 = 1;
        int count1 = 0;
        while (index1 < number1 + 1) {
            if (number1 % index1 == 0) {
                preDevisors1[count1] = index1;
                index1++;
                count1++;
            } else {
                index1++;
            }
        }

        int index2 = 1;
        int count2 = 0;
        while (index2 < number2 + 1) {
            if (number2 % index2 == 0) {
                preDevisors2[count2] = index2;
                index2++;
                count2++;
            } else {
                index2++;
            }
        }

        int[] devisors1 = new int[count1];
        int[] devisors2 = new int[count2];

        for (int i = 0; i < count1; i++) {
            devisors1[i] = preDevisors1[i];
        }

        for (int i = 0; i < count2; i++) {
            devisors2[i] = preDevisors2[i];
        }

        index1 = 0;
        index2 = 0;
        while (index1 < devisors1.length && index2 < devisors2.length) {
            if (devisors1[index1] == devisors2[index2]) {
                result = devisors1[index1];
                index1++;
                index2++;
            } else if (devisors1[index1] < devisors2[index2]) {
                index1++;
            } else {
                index2++;
            }
        }

        Game.setGameResult(Integer.toString(result));
        Game.setGameQwestion("Question: " + number1 + " " + number2);
    }
}
