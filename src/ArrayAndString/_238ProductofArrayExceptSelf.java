package ArrayAndString;

import java.util.Arrays;

public class _238ProductofArrayExceptSelf {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
//        int[] nums1 = {-1, 1, 0, -3, 3};
        System.out.println(Arrays.toString(productExceptSelf(nums)));
    }


    // {2, 3, 4}
    public static int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] left = new int[n]; // 存左边乘积
        int[] right = new int[n]; // 存右边乘积
        int[] answer = new int[n]; // 存结果

        // 算左边乘积
        left[0] = 1;
        for (int i = 1; i < n; i++){
            left[i] = left[i - 1] * nums[i - 1];
        }
        // 算右边乘积
        right[n - 1] = 1;
        for (int i = n - 2; i >= 0; i--){
            right[i] = right[i + 1] * nums[i + 1];
        }
        // 组合结果
        for(int i = 0; i < n; i++){
            answer[i] = left[i] * right[i];
        }
        return answer;
    }
}
