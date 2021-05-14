package com.ss.jb.four;

/**
 * @author NickM13
 * @since 5/13/2021
 */
public class AssignmentThree {

    /**
     * @param args
     */
    public static void main(String[] args) {
        initThreads();
    }

    private static final long THREAD_LIFE = 10000;

    private static final long PRODUCE_DELAY = 10;

    private static final int BUFFER_SIZE = 10;
    private static final Integer[] BUFFER = new Integer[BUFFER_SIZE];

    /**
     * Create and start a producer and consumer thread
     * Both threads will terminate at about the same time once the
     * current time minus start is greater than thread life
     */
    public static void initThreads() {
        long startTime = System.currentTimeMillis();

        System.out.println("Starting threads, running for " + THREAD_LIFE / 1000 + " seconds");

        // Producer thread continually updates the contents of buffer in index order
        // with values increasing by 1 each time
        Thread producer = new Thread(() -> {
            int i = 0;
                while (startTime > System.currentTimeMillis() - THREAD_LIFE) {
                    synchronized (BUFFER) {
                        BUFFER[i % BUFFER_SIZE] = i;
                    }
                    i++;
                    try {
                        Thread.sleep(PRODUCE_DELAY);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            System.out.println("Terminating producer thread");
        });

        // Consumer thread prints the contents of the buffer after a delay to see
        // the continual updates by producer
        Thread consumer = new Thread(() -> {
            while (startTime > System.currentTimeMillis() - THREAD_LIFE) {
                try {
                    Thread.sleep(PRODUCE_DELAY * (BUFFER_SIZE));
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (BUFFER) {
                    for (int i = 0; i < BUFFER_SIZE; i++) {
                        System.out.print((i > 0 ? ", " : "") + BUFFER[i]);
                    }
                }
                System.out.println();
            }
            System.out.println("Terminating consumer thread");
        });

        producer.start();
        consumer.start();
    }

}
