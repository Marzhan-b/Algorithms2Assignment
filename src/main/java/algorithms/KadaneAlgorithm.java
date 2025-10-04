package algorithms;

public class KadaneAlgorithm {


    public static int[] findMaxSubarray(int[] arr) {
        if (arr == null || arr.length == 0) {
            return new int[]{0, -1, -1};
        }

        int maxSum = arr[0];
        int currentSum = arr[0];
        int start = 0;
        int end = 0;
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
                start = tempStart;
                end = i;
            }
        }

        return new int[]{maxSum, start, end};
    }

    public static void main(String[] args) {
        int[] arr = {-8, 1, 4, -9, -1, 2, 1, -5, 4};
        int[] result = findMaxSubarray(arr);
        System.out.println("Max Sum: " + result[0]);
        System.out.println("Initial Index: " + result[1]);
        System.out.println("Final Index: " + result[2]);
    }
}
