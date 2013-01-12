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
      new Fixture(1, 2, 3),  
      new Fixture(4, 5, 9),  
      new Fixture(1, 1, 2),  
      new Fixture(2, -1, 1),  
    };
    
    @Theory
    public void addTest(Fixture p){
        Calculator calc = new Calculator();
        System.out.println(p);
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
        
        @Override
        public String toString(){
            return String.format("x: %d, y: %d, expected: %d", x, y, expected);
        }
    }
}
