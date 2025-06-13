package ArrayAndString;

public class _055JumpGame {
    public static void main(String[] args) {
        int[] arr = {2,3,1,1,4};
        int[] arr1 = {3,2,1,0,4};
        System.out.println(canJump(arr));
        System.out.println(canJump(arr1));
    }
    public static boolean canJump(int[] nums) {
        if (nums.length == 1) {
            return true;
        }
        int maxReach = 0; // 当前最大能到达的最远下标
        for (int i = 0; i <= maxReach && i < nums.length; i++) {
            maxReach = Math.max(maxReach, i + nums[i]);
            if (maxReach >= nums.length - 1) {
                return true;
            }
        }
        return false;
    }
}
