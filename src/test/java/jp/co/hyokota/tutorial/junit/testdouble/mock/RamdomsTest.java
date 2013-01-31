package jp.co.hyokota.tutorial.junit.testdouble.mock;

import static org.junit.Assert.assertThat;
import static org.hamcrest.CoreMatchers.*;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class RamdomsTest {
    @Test
    public void choiceでAを返す() {
        List<String> options;
        {
            String[] optionsStr = {"A", "B"};
            options = Arrays.asList(optionsStr);
        }
        Randoms sut = new Randoms();
        IRandomNumberGenerator generator_1 = new IRandomNumberGenerator(){
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
        List<String> options;
        {
            String[] optionsStr = {"A", "B"};
            options = Arrays.asList(optionsStr);
        }
        Randoms sut = new Randoms();
        IRandomNumberGenerator generator_1 = new IRandomNumberGenerator(){
            @Override
            public int nextInt() {
                return 1;
            }
        };
        sut.setGenerator(generator_1);
        assertThat(sut.choice(options), is("B"));
    }
}
