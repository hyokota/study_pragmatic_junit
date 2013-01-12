package jp.co.hyokota.tutorial.junit.category;

import org.junit.Test;

public class BarTest {

    @Test
    public void fastTest(){
        System.out.println("fastTest at BarTest");
    }
    
    @Test
    public void slowTest(){
        System.out.println("slowTest at BarTest");        
    }
}
