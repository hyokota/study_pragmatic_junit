package jp.co.hyokota.tutorial.junit.testdouble.mock;

public class RandomNumberGeneratorStub implements IRandomNumberGenerator {
    private int idx;

    public RandomNumberGeneratorStub(int idx) {
        this.idx = idx;
    }

    @Override
    public int nextInt() {
        return this.idx;
    }
}
