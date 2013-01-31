package jp.co.hyokota.tutorial.junit.testdouble.mock;

import static org.junit.Assert.assertThat;
import static org.hamcrest.CoreMatchers.*;

import java.util.Arrays;
import java.util.List;

import org.junit.Before;
import org.junit.experimental.theories.DataPoints;
import org.junit.experimental.theories.Theories;
import org.junit.experimental.theories.Theory;
import org.junit.runner.RunWith;

@RunWith(Theories.class)
public class RamdomsTest {
    @DataPoints
    public static final Fixture[] PARAMs = { new Fixture(0, "A"),
            new Fixture(1, "B"), new Fixture(2, "C"), new Fixture(3, "D"),
            new Fixture(4, "E"), new Fixture(5, "A") };

    private List<String> options;
    private Randoms sut;

    @Before
    public void setUp() {
        String[] optionsStr = { "A", "B", "C", "D", "E" };
        this.options = Arrays.asList(optionsStr);
        this.sut = new Randoms();
    }

    @Theory
    public void choiceのテスト(final Fixture p) {
        IRandomNumberGenerator generator_1 = new IRandomNumberGenerator() {
            @Override
            public int nextInt() {
                return p.idx;
            }
        };
        sut.setGenerator(generator_1);
        System.out.println(p);
        assertThat(p.toString(), sut.choice(options), is(p.expected));
    }

    static class Fixture {
        int idx;
        String expected;

        Fixture(int idx, String expected) {
            this.idx = idx;
            this.expected = expected;
        }

        @Override
        public String toString() {
            return String.format("idx: %d, expected: %s", this.idx,
                    this.expected);
        }
    }
}
