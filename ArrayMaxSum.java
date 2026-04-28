public class ArrayMaxSum {
    public static void main(String[] args) {
        int[] arr = {1, -2, 3, 4, -5, 8};
        int maxSum = Integer.MIN_VALUE;
        int currentSum = 0;

        for (int num : arr) {
            currentSum += num;
            if (currentSum > maxSum) {
                maxSum = currentSum;
            }
            if (currentSum < 0) {
                currentSum = 0;
            }
        }

        System.out.println("Maximum subarray sum is: " + maxSum);
    }
}
