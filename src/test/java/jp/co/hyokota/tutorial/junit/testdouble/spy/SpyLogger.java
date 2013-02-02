package jp.co.hyokota.tutorial.junit.testdouble.spy;

import java.util.logging.Logger;

/**
 * wrap Logger for test
 * @author hyokota
 *
 */
public class SpyLogger extends Logger{

    StringBuffer logBuffer = new StringBuffer();
    private Logger baseLogger;

    public SpyLogger(Logger baseLogger) {
        super(baseLogger.getName(), baseLogger.getResourceBundleName());
        this.baseLogger = baseLogger;
    }

    public void info(String msg){
        logBuffer.append(msg);
        this.baseLogger.info(msg);
    }
}
