public class SecondLargest {
    public int findSecondLargest(int[] nums) {
        if (nums.length < 2) {
            throw new IllegalArgumentException("Array must contain at least two elements.");
        }
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int num : nums) {
            if (num > largest) {
                secondLargest = largest;
                largest = num;
            } else if (num > secondLargest && num != largest) {
                secondLargest = num;
            }
        }

        if (secondLargest == Integer.MIN_VALUE) {
            throw new IllegalArgumentException("There is no second largest element.");
        }

        return secondLargest;
    }
    public static void main(String[] args) {
        SecondLargest solution = new SecondLargest();
        int[] nums = {3, 1, 4, 1, 5, 9};
        int result = solution.findSecondLargest(nums);
        System.out.println("The second largest element is: " + result);
    }
}
