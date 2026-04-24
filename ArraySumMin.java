public class ArraySumMin {
    public static void main(String[] args) {
        int[] arr = {5, 2, 9, 1, 5, 6};
        int sum = 0;
        int min = arr[0];

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if (arr[i] < min) {
                min = arr[i];
            }
        }

        System.out.println("Sum: " + sum);
        System.out.println("Minimum: " + min);
    }
}
