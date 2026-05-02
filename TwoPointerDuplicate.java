
import java.util.Arrays;

public class TwoPointerDuplicate {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 5, 6,1};
        Arrays.sort(arr); // Sort the array to ensure duplicates are adjacent

        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            if (arr[left] == arr[right]) {
                System.out.println("Duplicate found: " + arr[left]);
                return;
            } else if (arr[left] < arr[right]) {
                left++;
            } else {
                right--;
            }
        }

        System.out.println("No duplicate found.");
    }
}
