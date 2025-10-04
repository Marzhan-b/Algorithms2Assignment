package algorithms;

import metrics.PerformanceTracker;
import java.time.Instant;

public class KadaneAlgorithm {

    public static int[] findMaxSubarray(int[] arr) {
        // Подключаем трекер
        PerformanceTracker tracker = new PerformanceTracker();
        Instant start = Instant.now();
        tracker.startTimer();

        // Алгоритм Кадане
        if (arr == null || arr.length == 0) {
            tracker.stopTimer(start, Instant.now());
            tracker.exportToCSV("kadane_metrics.csv");
            return new int[]{0, -1, -1};
        }

        int maxSum = arr[0];
        int currentSum = arr[0];
        int startIdx = 0;
        int endIdx = 0;
        int tempStart = 0;

        for (int i = 1; i < arr.length; i++) {
            if (currentSum < 0) {
                currentSum = arr[i];
                tempStart = i;
            } else {
                currentSum += arr[i];
            }

            if (currentSum > maxSum) {
                maxSum = currentSum;
                startIdx = tempStart;
                endIdx = i;
            }

            // Можно добавить счётчики операций
            tracker.incrementComparisons();
            tracker.incrementAssignments();
        }

        Instant end = Instant.now();
        tracker.stopTimer(start, end);

        // Экспортируем все метрики в CSV
        tracker.exportToCSV("kadane_metrics.csv");

        return new int[]{maxSum, startIdx, endIdx};
    }
}
