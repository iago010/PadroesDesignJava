package com.iago010.padroesdesignjava.Singleton;

/**
 *
 * @author iago
 */
public class Singleton {
    
    private static Singleton instance;

    private Singleton() {}

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
    
}
