package jp.co.hyokota.tutorial.junit.testdouble.spy;

import java.util.logging.Logger;

public class SpyExample {
    public Logger logger;
    
    public SpyExample(){
        logger = Logger.getLogger(SpyExample.class.getName());        
    }
    
    public void doSomething(String msg) {
        logger.info(msg);
    }

}
