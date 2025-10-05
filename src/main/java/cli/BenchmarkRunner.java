package cli;

import algorithms.KadaneAlgorithm;
import metrics.PerformanceTracker;
import java.time.Instant;
import java.util.Random;

public class BenchmarkRunner {

    public static void main(String[] args) {
        int[] sizes = {100, 1000, 2000, 5000, 10000};
        Random random = new Random();

        for (int size : sizes) {
            int[] arr = new int[size];
            for (int i = 0; i < size; i++) {
                arr[i] = random.nextInt(2000) - 1000; // значения от -1000 до 999
            }

            PerformanceTracker tracker = new PerformanceTracker();
            Instant start = Instant.now();
            tracker.startTimer();

            KadaneAlgorithm.findMaxSubarray(arr);

            Instant end = Instant.now();
            tracker.stopTimer(start, end);

            tracker.exportToCSV("benchmark_metrics.csv");
            System.out.println("Benchmark completed for size: " + size);
        }
    }
}