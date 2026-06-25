public class CountSubarrayMajorityElement {
    public static void main(String[] args) {
        int[] nums = {1, 2, 1, 1, 3};
        int majorityElement = 1;
        int count = countSubarraysWithMajorityElement(nums, majorityElement);
        System.out.println("Count of subarrays with majority element " + majorityElement + ": " + count);
    }   
    public static int countSubarraysWithMajorityElement(int[] nums, int majorityElement) {
        int count = 0;
        int n = nums.length;

        for (int start = 0; start < n; start++) {
            int majorityCount = 0;
            for (int end = start; end < n; end++) {
                if (nums[end] == majorityElement) {
                    majorityCount++;
                }
                if (majorityCount > (end - start + 1) / 2) {
                    count++;
                }
            }
        }

        return count;
    }
}
