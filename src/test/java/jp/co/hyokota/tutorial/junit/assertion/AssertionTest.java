package jp.co.hyokota.tutorial.junit.assertion;

import static org.junit.Assert.assertThat;
import static org.hamcrest.CoreMatchers.is;

import org.junit.Test;

public class AssertionTest {

	@Test
	public void assertion(){
		String actual = "";
		actual = "Hello" + " " + "World!";
		assertThat(actual, is("Hello World!"));
	}
}
