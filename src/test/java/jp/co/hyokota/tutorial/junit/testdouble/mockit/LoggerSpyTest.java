package jp.co.hyokota.tutorial.junit.testdouble.mockit;

import static org.junit.Assert.assertThat;
import static org.hamcrest.CoreMatchers.*;

import java.util.logging.Logger;

import jp.co.hyokota.tutorial.junit.testdouble.spy.SpyExample;

import org.junit.Test;
import org.mockito.invocation.InvocationOnMock;
import org.mockito.stubbing.Answer;

import static org.mockito.Mockito.*;

public class LoggerSpyTest {

    @Test
    public void MockitのSpyLoggerを利用したテスト() {
        SpyExample sut = new SpyExample();
        Logger spyLog = spy(sut.logger);
        final StringBuilder infoLog = new StringBuilder();
        doAnswer(new Answer<Void>(){
            public Void answer(InvocationOnMock invocation) throws Throwable{
                infoLog.append(invocation.getArguments()[0]);
                invocation.callRealMethod();
                return null;
            }
        }).when(spyLog).info(anyString());
        sut.logger = spyLog;
        sut.doSomething("doSomething");
        assertThat(infoLog.toString(), is("doSomething"));
    }
}
