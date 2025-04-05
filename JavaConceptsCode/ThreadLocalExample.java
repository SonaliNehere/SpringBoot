package src;

public class ThreadLocalExample {
    private static ThreadLocal<Integer> threadLocal = new ThreadLocal<>();

    public static void main(String[] args) {
        // Set thread-local value for main thread
        threadLocal.set(100);

        // Create and start a new thread
        Thread thread = new Thread(() -> {
            // Access thread-local value in the new thread
            System.out.println("ThreadLocal value in new thread: " + threadLocal.get());
            threadLocal.set(1000);
            System.out.println("ThreadLocal value in new thread: " + threadLocal.get());
        });
        thread.start();
    }
}
