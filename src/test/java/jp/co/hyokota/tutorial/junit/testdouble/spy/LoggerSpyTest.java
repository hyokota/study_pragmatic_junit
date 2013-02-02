package jp.co.hyokota.tutorial.junit.testdouble.spy;

import static org.junit.Assert.assertThat;
import static org.hamcrest.CoreMatchers.*;

import org.junit.Test;

public class LoggerSpyTest {

    @Test
    public void SpyLoggerを利用したテスト() {
        SpyExample sut = new SpyExample();
        SpyLogger spy = new SpyLogger(sut.logger);
        sut.logger = spy;
        sut.doSomething("doSomething");
        assertThat(spy.logBuffer.toString(), is("doSomething"));
    }
}
