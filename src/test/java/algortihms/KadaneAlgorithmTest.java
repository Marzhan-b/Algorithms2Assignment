package algortihms;

import algorithms.KadaneAlgorithm;
<<<<<<< HEAD
import metrics.PerformanceTracker;
=======
>>>>>>> f95722a85ba89f45e8625b805746cdeb416d5415
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class KadaneAlgorithmTest {

    @Test
<<<<<<< HEAD
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
=======
    void testEmptyArray() {
        int[] arr = {};
        int[] result = KadaneAlgorithm.findMaxSubarray(arr);
        assertArrayEquals(new int[]{0, -1, -1}, result);
    }

    @Test
    void testSingleElement() {
        int[] arr = {5};
        int[] result = KadaneAlgorithm.findMaxSubarray(arr);
        assertArrayEquals(new int[]{5, 0, 0}, result);
    }

    @Test
    void testAllNegative() {
        int[] arr = {-8, -3, -6, -2, -5, -4};
        int[] result = KadaneAlgorithm.findMaxSubarray(arr);
        assertArrayEquals(new int[]{-2, 3, 3}, result);
    }

    @Test
    void testMixedNumbers() {
        int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int[] result = KadaneAlgorithm.findMaxSubarray(arr);
        assertArrayEquals(new int[]{6, 3, 6}, result); // подмассив [4,-1,2,1]
    }

    @Test
    void testAllPositive() {
        int[] arr = {1, 2, 3, 4};
        int[] result = KadaneAlgorithm.findMaxSubarray(arr);
        assertArrayEquals(new int[]{10, 0, 3}, result); // весь массив
    }

    @Test
    void testSingleMaximumAtStart() {
        int[] arr = {5, -1, -2, -3};
        int[] result = KadaneAlgorithm.findMaxSubarray(arr);
        assertArrayEquals(new int[]{5, 0, 0}, result);
    }

    @Test
    void testSingleMaximumAtEnd() {
        int[] arr = {-1, -2, -3, 4};
        int[] result = KadaneAlgorithm.findMaxSubarray(arr);
        assertArrayEquals(new int[]{4, 3, 3}, result);
>>>>>>> f95722a85ba89f45e8625b805746cdeb416d5415
    }
}
