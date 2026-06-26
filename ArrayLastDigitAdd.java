public class ArrayLastDigitAdd {
    public static void main(String[] args) {
        int[] nums = {12, 25, 37, 48, 59};
        int lastDigitSum = sumLastDigits(nums);
        System.out.println("Sum of last digits: " + lastDigitSum);
    }

    public static int sumLastDigits(int[] nums) {
        int sum = 0;
        for (int num : nums) {
            sum += num % 10;
        }
        return sum;
    }
}
