package jp.co.hyokota.tutorial.junit.fixture;

import static org.junit.Assert.assertThat;
import static org.hamcrest.CoreMatchers.is;

import org.junit.Test;

public class BoolStoreYamlTest {

    @Test
    public void getTotalPrice(){
        BookStore store = new BookStore();
        Book book = new Book();
        store.addToCart(book, 1);
        assertThat(store.getTotalPrice(), is(4500));
    }
}
