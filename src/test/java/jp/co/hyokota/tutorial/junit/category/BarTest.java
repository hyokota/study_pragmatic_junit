package jp.co.hyokota.tutorial.junit.category;

import jp.co.hyokota.tutorial.junit.category.categorymark.FastTest;
import jp.co.hyokota.tutorial.junit.category.categorymark.SlowTest;

import org.junit.After;
import org.junit.Rule;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.rules.TestName;

public class BarTest {

    @Rule
    public TestName testName = new TestName();
    
    @After
    public void outputContext(){
        System.out.println(String.format("%s at %s", testName.getMethodName(), this.getClass()));        
    }

    @Category(FastTest.class)
    @Test
    public void fastTest(){
    }
    
    @Category(SlowTest.class)
    @Test
    public void slowTest(){
    }
}
