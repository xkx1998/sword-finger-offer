package xukexiang;

public class Main07 {
    public int Fibonacci(int n) {
        int[] nums = new int[n+2];
        nums[0] = 0;
        nums[1] = 1;
        for(int i = 2;i <= n;i++) {
            nums[i] = nums[i-1] + nums[i-2];
        }
        return nums[n];
    }
}
