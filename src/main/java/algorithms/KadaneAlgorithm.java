package algorithms;

import metrics.PerformanceTracker;
import java.time.Instant;

public class KadaneAlgorithm {

    public static int[] findMaxSubarray(int[] arr) {
        PerformanceTracker tracker = new PerformanceTracker();
        Instant start = Instant.now();
        tracker.startTimer();

        if (arr == null || arr.length == 0) {
            tracker.stopTimer(start, Instant.now());
            tracker.exportToCSV("kadane_metrics.csv");
            return new int[]{0, -1, -1};
        }

        int maxSum = arr[0];
        int currentSum = arr[0];
        int startIndex = 0;
        int endIndex = 0;
        int tempStart = 0;

        for (int i = 1; i < arr.length; i++) {
            tracker.incrementComparisons();
            if (currentSum < 0) {
                tracker.incrementAssignments();
                currentSum = arr[i];
                tempStart = i;
            } else {
                tracker.incrementAssignments();
                currentSum += arr[i];
            }

            tracker.incrementComparisons();
            if (currentSum > maxSum) {
                tracker.incrementAssignments();
                maxSum = currentSum;
                startIndex = tempStart;
                endIndex = i;
            }
        }

        Instant end = Instant.now();
        tracker.stopTimer(start, end);
        tracker.exportToCSV("kadane_metrics.csv");

        return new int[]{maxSum, startIndex, endIndex};
    }

    public static int kadane(int[] arr) {
        if (arr == null || arr.length == 0) return 0;
        int maxSoFar = arr[0];
        int maxEndingHere = arr[0];

        for (int i = 1; i < arr.length; i++) {
            maxEndingHere = Math.max(arr[i], maxEndingHere + arr[i]);
            maxSoFar = Math.max(maxSoFar, maxEndingHere);
        }

        return maxSoFar;
    }

}