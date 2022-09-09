package Algorythms.Practice;

public class SelectionSort {
    public static void main(String[] args) {
        int[] nums = {5, 2, 77, 42, 12, 3, 3, 5, 8};
        for (int i = 0; i < nums.length; i++) {
            int position = i;
            int min = nums[i];
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] < min) {
                    position = j;
                    min = nums[j];
                }
            }
            nums[position] = nums[i];
            nums[i] = min;
            System.out.println(nums[i]);
        }
        System.out.println();
    }
}
