package jp.co.hyokota.tutorial.junit.category;

import org.junit.Test;

public class FooTest {

    @Test
    public void fastTest(){
        System.out.println("fastTest at FooTest");
    }
    
    @Test
    public void slowTest(){
        System.out.println("slowTest at FooTest");        
    }
}
