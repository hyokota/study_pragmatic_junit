package jp.co.hyokota.tutorial.junit.parameterize;

import static org.junit.Assert.assertThat;
import static org.hamcrest.CoreMatchers.is;

import org.junit.Test;

public class CalculatorDatePointsTest {

    @Test
    public void addTest(){
        int x = 3;
        int y = 4;
        int expected = 7;
        Calculator calc = new Calculator();
        assertThat(calc.add(x, y), is(expected));
    }
}
