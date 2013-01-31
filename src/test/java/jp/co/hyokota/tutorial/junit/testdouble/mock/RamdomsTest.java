package jp.co.hyokota.tutorial.junit.testdouble.mock;

import static org.junit.Assert.assertThat;
import static org.hamcrest.CoreMatchers.*;

import java.util.Arrays;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class RamdomsTest {

    private List<String> options;
    private Randoms sut;

    @Before
    public void setUp() {
        String[] optionsStr = {"A", "B"};
        this.options = Arrays.asList(optionsStr);
        this.sut = new Randoms();
    }

    @Test
    public void choiceでAを返す() {
        IRandomNumberGenerator generator_1 = new IRandomNumberGenerator() {
            @Override
            public int nextInt() {
                return 0;
            }
        };
        sut.setGenerator(generator_1);
        assertThat(sut.choice(options), is("A"));
    }

    @Test
    public void choiceでBを返す() {
        IRandomNumberGenerator generator_1 = new IRandomNumberGenerator() {
            @Override
            public int nextInt() {
                return 1;
            }
        };
        sut.setGenerator(generator_1);
        assertThat(sut.choice(options), is("B"));
    }
}
