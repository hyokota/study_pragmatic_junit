package jp.co.hyokota.tutorial.junit.assertion;

import static org.junit.Assert.assertThat;
import static org.hamcrest.CoreMatchers.hasItem;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class HasItemTest {

    @Test
    public void はじめて要素確認_リスト() {
        String[] array = {"hoge", "fuga", "piyo"};
        List<String> list = Arrays.asList(array);
        String expected = "hoge";

        assertThat(list, hasItem(expected));
    }
}
