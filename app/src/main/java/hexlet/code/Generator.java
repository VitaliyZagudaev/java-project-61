package hexlet.code;

import org.apache.commons.lang3.RandomUtils;
public class Generator {

    static final int MAX_100 = 100;
    static final int MAX_4 = 4;
    static final int MIN_5 = 5;
    static final int MAX_10 = 10;
    static final int MAX_11 = 11;

    public static int generator() {
        return RandomUtils.nextInt(1, MAX_100);
    }
    public static int generatorThree() {
        return RandomUtils.nextInt(1, MAX_4);
    }
    public static int generatorNine() {
        return RandomUtils.nextInt(1, MAX_10);
    }
    public static int generatorTwoNine() {
        return RandomUtils.nextInt(2, MAX_10);
    }
    public static int generatorTen() {
        return RandomUtils.nextInt(1, MAX_11);
    }
    public static int generatorFiveTen() {
        return RandomUtils.nextInt(MIN_5, MAX_11);
    }
    public static int generatorOneRandom() {
        return RandomUtils.nextInt(1, Game.getGameRandom());
    }
}
