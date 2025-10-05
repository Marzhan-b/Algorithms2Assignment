package algortihms;

import algorithms.KadaneAlgorithm;
import metrics.PerformanceTracker;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class KadaneAlgorithmTest {

    @Test
    public void testPositiveNumbers() {
        int[] arr = {1, 2, 3, 4, 5};
        PerformanceTracker tracker = new PerformanceTracker();
        int result = KadaneAlgorithm.findMaxSubarray(arr, tracker);
        assertEquals(15, result);
    }

    @Test
    public void testMixedNumbers() {
        int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        PerformanceTracker tracker = new PerformanceTracker();
        int result = KadaneAlgorithm.findMaxSubarray(arr, tracker);
        assertEquals(6, result);
    }

    @Test
    public void testAllNegative() {
        int[] arr = {-3, -5, -2, -8, -1};
        PerformanceTracker tracker = new PerformanceTracker();
        int result = KadaneAlgorithm.findMaxSubarray(arr, tracker);
        assertEquals(-1, result);
    }

    @Test
    public void testSingleElement() {
        int[] arr = {7};
        PerformanceTracker tracker = new PerformanceTracker();
        int result = KadaneAlgorithm.findMaxSubarray(arr, tracker);
        assertEquals(7, result);
    }

    @Test
    public void testEmptyArray() {
        int[] arr = {};
        PerformanceTracker tracker = new PerformanceTracker();
        int result = KadaneAlgorithm.findMaxSubarray(arr, tracker);
        assertEquals(0, result);
    }

    @Test
    public void testZeros() {
        int[] arr = {0, 0, 0, 0};
        PerformanceTracker tracker = new PerformanceTracker();
        int result = KadaneAlgorithm.findMaxSubarray(arr, tracker);
        assertEquals(0, result);
    }

    @Test
    public void testAlternating() {
        int[] arr = {1, -1, 1, -1, 1, -1};
        PerformanceTracker tracker = new PerformanceTracker();
        int result = KadaneAlgorithm.findMaxSubarray(arr, tracker);
        assertEquals(1, result);
    }
}
