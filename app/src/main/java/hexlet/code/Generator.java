package hexlet.code;

import org.apache.commons.lang3.RandomUtils;
public class Generator {

    private static int randomLimitBasic = 100;
    private static int randomLimitFour = 4;
    private static int randomLimitFive = 5;
    private static int randomLimitTen = 10;
    private static int randomLimitEleven = 11;

    public static int generator() {
        return RandomUtils.nextInt(1, randomLimitBasic);
    }
    public static int generatorThree() {
        return RandomUtils.nextInt(1, randomLimitFour);
    }
    public static int generatorNine() {
        return RandomUtils.nextInt(1, randomLimitTen);
    }
    public static int generatorTwoNine() {
        return RandomUtils.nextInt(2, randomLimitTen);
    }
    public static int generatorTen() {
        return RandomUtils.nextInt(1, randomLimitEleven);
    }
    public static int generatorFiveTen() {
        return RandomUtils.nextInt(randomLimitFive, randomLimitEleven);
    }
    public static int generatorOneRandom() {
        return RandomUtils.nextInt(1, Game.getGameRandom());
    }
}
