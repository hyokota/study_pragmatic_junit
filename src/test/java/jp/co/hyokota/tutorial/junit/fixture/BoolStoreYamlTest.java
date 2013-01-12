package jp.co.hyokota.tutorial.junit.fixture;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

import org.junit.Test;
import org.yaml.snakeyaml.Yaml;

public class BoolStoreYamlTest {

    @Test
    public void getTotalPrice(){
        BookStore store = new BookStore();
        Yaml yaml = new Yaml();
        Book book = (Book)yaml.load(getClass().getResourceAsStream("book_fixtures.yaml"));
        store.addToCart(book, 1);
        assertThat(store.getTotalPrice(), is(4500));
    }
}
