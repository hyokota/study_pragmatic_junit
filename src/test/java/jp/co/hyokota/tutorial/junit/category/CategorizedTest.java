package jp.co.hyokota.tutorial.junit.category;

import jp.co.hyokota.tutorial.junit.category.categorymark.FastTest;
import jp.co.hyokota.tutorial.junit.category.categorymark.SlowTest;

import org.junit.experimental.categories.Categories;
import org.junit.experimental.categories.Categories.ExcludeCategory;
import org.junit.experimental.categories.Categories.IncludeCategory;
import org.junit.runner.RunWith;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Categories.class)
@IncludeCategory(FastTest.class)
@ExcludeCategory(SlowTest.class)
@SuiteClasses({FooTest.class, BarTest.class})
public class CategorizedTest {
}
