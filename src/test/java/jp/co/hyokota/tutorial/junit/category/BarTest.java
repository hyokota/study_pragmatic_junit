package jp.co.hyokota.tutorial.junit.category;

import jp.co.hyokota.tutorial.junit.category.categorymark.FastTest;
import jp.co.hyokota.tutorial.junit.category.categorymark.SlowTest;

import org.junit.Test;
import org.junit.experimental.categories.Category;

public class BarTest {

    @Category(FastTest.class)
    @Test
    public void fastTest(){
        System.out.println("fastTest at BarTest");
    }
    
    @Category(SlowTest.class)
    @Test
    public void slowTest(){
        System.out.println("slowTest at BarTest");        
    }
}
