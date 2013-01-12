package jp.co.hyokota.tutorial.junit.parameterize;

import static org.junit.Assert.assertThat;
import static org.hamcrest.CoreMatchers.is;

import org.junit.experimental.theories.Theories;
import org.junit.experimental.theories.DataPoints;
import org.junit.experimental.theories.Theory;
import org.junit.runner.RunWith;

@RunWith(Theories.class)
public class CalculatorDatePointsTest {

    @DataPoints
    public static Fixture[] PARAMs = {
      new Fixture(3, 4, 7),  
    };
    
    @Theory
    public void addTest(Fixture p){
        Calculator calc = new Calculator();
        assertThat(calc.add(p.x, p.y), is(p.expected));
    }
    
    static class Fixture{
        int x;
        int y;
        int expected;

        Fixture(int x, int y, int expected){
            this.x = x;
            this.y = y;
            this.expected = expected;
        }
    }
}
