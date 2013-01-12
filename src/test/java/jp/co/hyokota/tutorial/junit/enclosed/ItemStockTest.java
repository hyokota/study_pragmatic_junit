package jp.co.hyokota.tutorial.junit.enclosed;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.experimental.runners.Enclosed;

@RunWith(Enclosed.class)
public class ItemStockTest {

    public static class 商品が空の場合{
        private ItemStock sut;

        @Before
        public void setUp(){
            sut = new ItemStock();
        }
        
        @Test
        public void size_Aが0を返す() throws Exception{
            assertThat(sut.size("A"), is(0));
        }

        @Test
        public void contains_Aはfalseを返す() throws Exception{
            assertThat(sut.contains("A"), is(false));
        }
    }

    public static class 商品Aを1件含む場合{
        private ItemStock sut;
        
        @Before
        public void setUp(){
            sut = new ItemStock();
            sut.add("A", 1);
        }

        @Test
        public void size_Aが1を返す() throws Exception{
            assertThat(sut.size("A"), is(1));
        }

        @Test
        public void contains_Aはtrueを返す() throws Exception{
            assertThat(sut.contains("A"), is(true));
        }
    }
}
