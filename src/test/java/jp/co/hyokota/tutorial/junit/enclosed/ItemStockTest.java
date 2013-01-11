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
}
