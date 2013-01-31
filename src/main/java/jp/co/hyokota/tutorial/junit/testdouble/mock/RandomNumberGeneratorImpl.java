package jp.co.hyokota.tutorial.junit.testdouble.mock;

import java.util.Random;

public class RandomNumberGeneratorImpl implements IRandomNumberGenerator {

    private final Random rand = new Random();

    public int nextInt() {
        return rand.nextInt();
    }
}
