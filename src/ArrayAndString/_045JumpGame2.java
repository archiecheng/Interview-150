package ArrayAndString;

public class _045JumpGame2 {
    public static void main(String[] args) {
         int[] nums = {2, 3, 1, 1, 4};
         int[] nums1 = {2, 3, 0, 1, 4};
        System.out.println(jump(nums));
        System.out.println(jump(nums1));
    }

    public static int jump(int[] nums) {
        int maxReach = 0; // 当前能到达的最远下标, 初始化为0
        int jumps = 0; // 跳跃次数, 初始为0
        int end = 0; // 当前跳跃的最大边界, 初始为0
        for (int i = 0; i < nums.length - 1; i++) {
            maxReach = Math.max(maxReach, i + nums[i]);
            if(i == end){ // 表示到达当前跳跃的边界
                jumps++; // 计数
                end = maxReach; // 新边界
            }
        }
        return jumps;
    }
}
