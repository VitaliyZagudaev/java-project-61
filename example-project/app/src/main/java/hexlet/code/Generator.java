package hexlet.code;

import org.apache.commons.lang3.RandomUtils;
public class Generator {
    public static int generator() {
        return RandomUtils.nextInt(1, 100);
    }
    public static int generatorThree() {
        return RandomUtils.nextInt(1, 4);
    }
}
