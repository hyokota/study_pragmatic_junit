package jp.co.hyokota.tutorial.junit.enclosed;

import static org.junit.Assert.assertThat;
import static org.hamcrest.CoreMatchers.is;

import org.junit.Test;

public class ItemStockTest {

    @Test
    public void size_Aが0を返す() throws Exception{
        ItemStock sut = new ItemStock();
        assertThat(sut.size("A"), is(0));
    }

    @Test
    public void size_Aが1を返す() throws Exception{
        ItemStock sut = new ItemStock();
        sut.add("A", 1);
        assertThat(sut.size("A"), is(1));
    }
    
    @Test
    public void contains_Aはfalseを返す() throws Exception{
        ItemStock sut = new ItemStock();
        assertThat(sut.contains("A"), is(false));
    }
    
    @Test
    public void contains_Aはtrueを返す() throws Exception{
        ItemStock sut = new ItemStock();
        sut.add("A", 1);
        assertThat(sut.contains("A"), is(true));
    }

}
