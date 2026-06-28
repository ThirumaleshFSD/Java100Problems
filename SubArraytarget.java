public class SubArraytarget {
   public static void main(String[] args) {
      int[] arr = {1, 2, 3, 4, 5};
      int target = 9;
      boolean result = hasSubArrayWithTarget(arr, target);
      System.out.println("Subarray with target sum exists: " + result);
   } 
    public static boolean hasSubArrayWithTarget(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
             int sum = 0;
             for (int j = i; j < arr.length; j++) {
                sum += arr[j];
                if (sum == target) {
                 return true;
                }
             }
        }
        return false;
     }
}
