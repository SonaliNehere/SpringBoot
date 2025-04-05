package src;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

//Define a class that extends Thread
class MyThread extends Thread {
	public void run() {
		// Code to be executed by the thread
		System.out.println("Thread running: " + Thread.currentThread().getName());
	}
}

// Define a class that implements the Runnable interface
class MyRunnable implements Runnable {
	public void run() {
		// Code to be executed by the thread
		System.out.println("Thread running: " + Thread.currentThread().getName());
	}
}

//Volatile
class VolatileExample {
	private volatile boolean flag;

	public void setFlag(boolean value) {
		flag = value;
	}

	public boolean getFlag() {
		return flag;
	}
}

//Atomic
class AtomicExample {
	private AtomicInteger counter = new AtomicInteger(0);

	public void increment() {
		counter.incrementAndGet();
	}

	public int getCount() {
		return counter.get();
	}
}

//Synchronized
class SynchronizedExample {
	private int count;

	public synchronized void increment() {
		count++;
	}

	public synchronized int getCount() {
		return count;
	}
}

public class Multithreading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Create an instance of MyThread
//        MyThread myThread = new MyThread();
		// Start the thread
//        myThread.start();

		// Create an instance of MyRunnable
//        MyRunnable myRunnable = new MyRunnable();
		// Create a Thread instance and pass MyRunnable as a parameter
//        Thread thread = new Thread(myRunnable);
		// Start the thread
//        thread.start();

//        Daemon Thread
//        Thread daemonThread = new Thread(() -> {
//            while (true) {
//                System.out.println("Daemon thread is running...");
//                try {
//                    Thread.sleep(1000); // Simulate some task
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//            }
//        });
//        daemonThread.setDaemon(true); // Set the thread as daemon
//        daemonThread.start(); // Start the daemon thread

		// Fixed Thread Pool
		// Create a FixedThreadPool with 3 threads
//		ExecutorService fixedThreadPool = Executors.newFixedThreadPool(3);
//
//		System.out.println("\nFixed Thread Pool:");
//		// Submit tasks to the FixedThreadPool
//		for (int i = 1; i <= 5; i++) {
//		    final int taskId = i;
//		    fixedThreadPool.execute(() -> {
//		        // Task execution
//		        System.out.println("Fixed Thread Task " + taskId +
//		                " executed by Thread: " +
//		                Thread.currentThread().getName());
//		    });
//		}

		// Cached Thread Pool
		// Create a CachedThreadPool
//		ExecutorService cachedThreadPool = Executors.newCachedThreadPool();
//
//		System.out.println("\nCached Thread Pool:");
//		// Submit tasks to the CachedThreadPool
//		for (int i = 1; i <= 5; i++) {
//		    final int taskId = i;
//		    cachedThreadPool.execute(() -> {
//		        // Task execution
//		        System.out.println("Cached Thread Task " + taskId +
//		                " executed by Thread: " +
//		                Thread.currentThread().getName());
//		    });
//		}

		// Single Thread Executor
		// Create a SingleThreadExecutor
//		ExecutorService singleThreadExecutor = Executors.newSingleThreadExecutor();
//
//		System.out.println("\nSingle Thread Executor:");
//		// Submit tasks to the SingleThreadExecutor
//		for (int i = 1; i <= 5; i++) {
//		    final int taskId = i;
//		    singleThreadExecutor.execute(() -> {
//		        // Task execution
//		        System.out.println("Single Thread Task " + taskId +
//		                " executed by Thread: " +
//		                Thread.currentThread().getName());
//		    });
//		}

		// Scheduled Thread Pool
		// Create a ScheduledThreadPool with 2 threads
//		ScheduledExecutorService scheduledThreadPool = Executors.newScheduledThreadPool(2);
//
//		// Schedule a task to execute after 5 seconds
//		scheduledThreadPool.schedule(() ->
//		        System.out.println("Scheduled Task"),
//		        5, TimeUnit.SECONDS);
//
//		// Schedule a task to execute every 1 second, starting immediately
//		scheduledThreadPool.scheduleAtFixedRate(() ->
//		        System.out.println("Scheduled Task"),
//		        0, 1, TimeUnit.SECONDS);

//		virtual thread
//		  Thread virtualThread = Thread.startVirtualThread(() -> {
//              System.out.println("Running task with virtual thread: "
//                      + Thread.currentThread().getName());
//          });
//
//          // Waiting for virtual threads to complete
//          try {
//              virtualThread.join();
//          } catch (InterruptedException e) {
//              e.printStackTrace();
//          }

//		yield method
		Runnable r = () -> {
			int counter = 0;
			while (counter < 2) {
				System.out.println(Thread.currentThread().getName());
				counter++;
				Thread.yield();
			}
		};
		new Thread(r).start();
		new Thread(r).start();

	}

}
