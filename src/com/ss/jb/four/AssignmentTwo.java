package com.ss.jb.four;

/**
 * @author NickM13
 * @since 5/13/2021
 */
public class AssignmentTwo {

    /**
     * Create a dead lock between two threads, meaning both threads are causing the other to hang
     * @param args
     */
    public static void main(String[] args) {
        Integer i = 5;
        Integer j = 20;

        Runnable r1 = () -> {
            synchronized (i) {
                System.out.println("Thread 1 is holding i");
                try {
                    Thread.sleep(100);
                    System.out.println("Thread 1 waiting for j...");
                    synchronized (j) {
                        System.out.println("Thread 1 is running");
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };

        Runnable r2 = () -> {
            synchronized (j) {
                System.out.println("Thread 2 is holding j");
                try {
                    Thread.sleep(100);
                    System.out.println("Thread 2 waiting for i...");
                    synchronized (i) {
                        System.out.println("Thread 2 is running");
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };

        new Thread(r1).start();
        new Thread(r2).start();
    }

}
