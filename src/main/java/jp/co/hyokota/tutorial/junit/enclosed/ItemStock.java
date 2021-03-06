package jp.co.hyokota.tutorial.junit.enclosed;

import java.util.HashMap;
import java.util.Map;

public class ItemStock {
    private Map<String, Integer> stock = new HashMap<String, Integer>();

    public int size(String key) {
        if(!this.contains(key)){
            return 0;
        }
        return stock.get(key);
    }

    public void add(String string, int i) {
        stock.put(string, i);
    }

    public boolean contains(String key) {
        return stock.containsKey(key);
    }
}
