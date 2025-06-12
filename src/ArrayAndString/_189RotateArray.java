package ArrayAndString;

import java.util.Arrays;

public class _189RotateArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
//        int start = 0;
//        int end = arr.length - 1;
//        while (start < end) {
//            int temp = arr[start];
//            arr[start] = arr[end];
//            arr[end] = temp;
//            start++;
//            end--;
//        }
//        System.out.println(Arrays.toString(arr));
        rotate(arr, 3);
        System.out.println(Arrays.toString(arr));
        int[] arr1 = {-1, -100, 3, 99};
        rotate(arr1, 2);
        System.out.println(Arrays.toString(arr1));
    }

    public static void rotate(int[] nums, int k) {
        // 三次翻转
        reverse(nums, 0, nums.length - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, nums.length - 1);
    }

    private static void reverse(int[] nums, int i, int j) {
        while (i < j) {
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            i++;
            j--;
        }
    }
}
