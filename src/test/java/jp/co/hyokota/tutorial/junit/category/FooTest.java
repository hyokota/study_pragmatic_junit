package jp.co.hyokota.tutorial.junit.category;

import jp.co.hyokota.tutorial.junit.category.categorymark.FastTest;

import org.junit.After;
import org.junit.Rule;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.rules.TestName;

@Category(FastTest.class)
public class FooTest {

    @Rule
    public TestName testName = new TestName();

    @After
    public void outputContext(){
        System.out.println(String.format("%s at %s", testName.getMethodName(), this.getClass()));        
    }
    
    
    @Test
    public void test1(){
    }
    
    @Test
    public void test2(){
    }
}
