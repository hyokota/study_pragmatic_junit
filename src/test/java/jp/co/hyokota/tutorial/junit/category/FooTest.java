package jp.co.hyokota.tutorial.junit.category;

import jp.co.hyokota.tutorial.junit.category.categorymark.FastTest;

import org.junit.Test;
import org.junit.experimental.categories.Category;

@Category(FastTest.class)
public class FooTest {

    @Test
    public void test1(){
        System.out.println("test1 at FooTest");
    }
    
    @Test
    public void test2(){
        System.out.println("test2 at FooTest");        
    }
}
