package com.ve.memory.leak;

import java.util.Map;

/**
 * Created by oskarflores on 11/7/17.
 */
public class MemLeak {
    public final String key;

    public MemLeak(String key) {
        this.key =key;
    }

    public static void main(String args[]) {
        try {
            Map map = System.getProperties();

            for(;;) {
                map.put(new MemLeak("key"), "value");
            }
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}
