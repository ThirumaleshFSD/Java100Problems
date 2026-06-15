public class TwoListCombine {
    public static void main(String[] args) {
        int[] list1 = {1, 3, 5, 7};
        int[] list2 = {2, 4, 6, 8};
        int[] combinedList = combineLists(list1, list2);

        for (int num : combinedList) {
            System.out.print(num + " ");
        }
    }

    public static int[] combineLists(int[] list1, int[] list2) {
        int[] combined = new int[list1.length + list2.length];
        int index = 0;

        for (int num : list1) {
            combined[index++] = num;
        }

        for (int num : list2) {
            combined[index++] = num;
        }

        return combined;
    }
}
