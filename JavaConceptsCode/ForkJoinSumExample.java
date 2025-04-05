package src;

import java.util.concurrent.RecursiveTask;
import java.util.concurrent.ForkJoinPool;

public class ForkJoinSumExample {
    // Define a task to compute the sum of elements in a given range of an array
    static class SumTask extends RecursiveTask<Integer> {
        private static final int THRESHOLD = 10; // Threshold for splitting tasks
        private int[] array;
        private int start, end;

        // Constructor to initialize the task with the array and range
        public SumTask(int[] array, int start, int end) {
            this.array = array;
            this.start = start;
            this.end = end;
        }

        // Override the compute() method to define the task logic
        protected Integer compute() {
            // If the range is small, compute the sum directly
            if (end - start <= THRESHOLD) {
                int sum = 0;
                for (int i = start; i < end; i++)
                    sum += array[i];
                return sum;
            } else {
                // If the range is large, split the task into subtasks
                int mid = (start + end) / 2;
                SumTask leftTask = new SumTask(array, start, mid);
                SumTask rightTask = new SumTask(array, mid, end);

                // Fork the subtasks to execute in parallel
                leftTask.fork();
                rightTask.fork();

                // Join the results of subtasks
                return leftTask.join() + rightTask.join();
            }
        }
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        // Create a ForkJoinPool with the default parallelism level
        ForkJoinPool pool = ForkJoinPool.commonPool();

        // Execute the main task and get the result
        int result = pool.invoke(new SumTask(array, 0, array.length));

        // Print the result
        System.out.println("Sum: " + result);
    }
}
