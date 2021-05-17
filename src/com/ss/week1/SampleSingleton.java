package com.ss.week1;

import java.sql.Connection;

/**
 * Not a static class
 */
public /*static*/ class SampleSingleton {

    // Connection shouldn't be static, program should access it through the instance
    private /*static*/ Connection conn = null;

    // Can be final since we are safely instantiating here instead of on call in getInstance
    private static final SampleSingleton instance = new SampleSingleton();

    /**
     * If an instance does not already exist, create one and return it,
     * otherwise return the instance that already exists
     * @return
     */
    public static SampleSingleton getInstance() {
        return instance;
    }

    /**
     * Requires a private constructor to prevent more than one instance
     */
    private SampleSingleton() {
        // Set up connection here?
    }

    public Connection getConn() {
        return conn;
    }

}
