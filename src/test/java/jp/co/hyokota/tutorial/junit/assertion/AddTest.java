package jp.co.hyokota.tutorial.junit.assertion;

import static org.junit.Assert.assertThat;
import static org.hamcrest.CoreMatchers.is;

import org.junit.Test;

public class AddTest {

    @Test
    public void 足し算3と4() {
        int expected = 7;
        int actual = Add.add(3, 4);
        assertThat(actual, is(expected));
    }
}
