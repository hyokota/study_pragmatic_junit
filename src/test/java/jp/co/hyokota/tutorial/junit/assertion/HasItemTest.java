package jp.co.hyokota.tutorial.junit.assertion;

import static org.junit.Assert.assertThat;
import static org.hamcrest.CoreMatchers.not;
import static org.hamcrest.CoreMatchers.hasItem;
import static org.hamcrest.CoreMatchers.hasItems;

import java.util.Arrays;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class HasItemTest {

    private List<String> actual;

    @Before
    public void setup(){
        String[] array = {"hoge", "fuga", "piyo"};
        actual = Arrays.asList(array);
    }
    
    @Test
    public void はじめて要素確認_リスト() {
        String expected = "hoge";

        assertThat(actual, hasItem(expected));
    }

    @Test
    public void はじめて要素一括確認_リスト() {
        String[] expected = {"hoge", "fuga"};

        assertThat(actual, hasItems(expected));
    }

    @Test
    public void はじめて要素一括確認_リスト_失敗するはず() {
        String[] expected = {"hoge", "fuga", "foo"};

        assertThat(actual, not(hasItems(expected)));
    }

}
