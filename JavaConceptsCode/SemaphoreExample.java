package src;

import java.util.concurrent.Semaphore;

public class SemaphoreExample {
    private static final int NUM_THREADS = 5;
    private static final Semaphore semaphore = new Semaphore(2); // Allow only 2 threads to access the resource simultaneously

    public static void main(String[] args) {
        // Create and start multiple threads
        for (int i = 0; i < NUM_THREADS; i++) {
            Thread thread = new Thread(() -> {
                try {
                    semaphore.acquire(); // Acquire permit
                    System.out.println(Thread.currentThread().getName() + " is accessing the resource");
                    Thread.sleep(1000); // Simulate resource usage
                    System.out.println(Thread.currentThread().getName() + " released the resource");
                    semaphore.release(); // Release permit
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            });
            thread.start();
        }
    }
}
