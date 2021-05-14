package com.ss.jb.four;

/**
 * Creates a singleton instance on initialization to prevent
 * a thread locked structure on multiple getInstance calls
 * @author NickM13
 * @since 5/13/2021
 */
public class AssignmentOne {

    private static AssignmentOne instance;

    /**
     * Checks if the singleton instance is null, and if it is then lock other threads and set the instance to
     * a new object
     * @return Instance
     */
    public static AssignmentOne getInstance() {
        if (instance == null) {
            synchronized (instance) {
                if (instance == null) {
                    instance = new AssignmentOne();
                }
            }
        }
        return instance;
    }

    private int counter = 0;

    /**
     * Private constructor to prevent additional instances
     */
    private AssignmentOne() {

    }

    /**
     * Increment test counter by one
     */
    public void increment() {
        counter++;
    }

    /**
     * Get test counter value
     * @return
     */
    public int getCounter() {
        return counter;
    }

}
