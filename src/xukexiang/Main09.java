package xukexiang;

public class Main09 {
    public int JumpFloorII(int target) {
        if (target == 0) {
            return 0;
        }
        int[] nums = new int[target + 2];
        nums[0] = 0;
        nums[1] = 1;
        nums[2] = 2;

        if (target > 0 && target < 3) {
            return nums[target];
        }

        for (int i = 2; i <= target; i++) {
            nums[i] = 2 * nums[i - 1];
        }

        return nums[target];
    }
}
