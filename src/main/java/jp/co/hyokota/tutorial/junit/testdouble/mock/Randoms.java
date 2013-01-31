package jp.co.hyokota.tutorial.junit.testdouble.mock;

import java.util.List;

public class Randoms {
    private IRandomNumberGenerator generator;

    public Randoms() {
        this.generator = new RandomNumberGeneratorImpl();
    }

    public String choice(List<String> options) {
        int idx = this.nextIndex(options.size());
        return options.get(idx);
    }

    public void setGenerator(IRandomNumberGenerator generator) {
        this.generator = generator;
    }

    private int nextIndex(int size) {
        int rand = this.generator.nextInt();
        return rand % size;
    }

}
