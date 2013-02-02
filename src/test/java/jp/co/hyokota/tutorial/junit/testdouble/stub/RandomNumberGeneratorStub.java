package jp.co.hyokota.tutorial.junit.testdouble.stub;

public class RandomNumberGeneratorStub implements IRandomNumberGenerator {
    private int idx;

    public RandomNumberGeneratorStub(int idx) {
        this.idx = idx;
    }

    public int nextInt() {
        return this.idx;
    }
}
