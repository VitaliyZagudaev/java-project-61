package hexlet.code;

import org.apache.commons.lang3.RandomUtils;
public class Generator {
    public static int generator() {
        return RandomUtils.nextInt(1, 100);
    }
    public static int generatorThree() {
        return RandomUtils.nextInt(1, 4);
    }
    public static int generatorNine() {
        return RandomUtils.nextInt(1, 10);
    }
    public static int generatorTwoNine() {
        return RandomUtils.nextInt(2, 10);
    }
    public static int generatorTen() {
        return RandomUtils.nextInt(1, 11);
    }
    public static int generatorFiveTen() {
        return RandomUtils.nextInt(5, 11);
    }
    public static int generatorOneRandom() {
        return RandomUtils.nextInt(1, Game.getGameRandom());
    }
}
