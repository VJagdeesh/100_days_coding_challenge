// 209. Minimum Size Subarray Sum

class MinimumSizeSubarraySum {
    public static int minSubArrayLen(int s, int[] nums) {
        int l = 0;
        int min_len = Integer.MAX_VALUE;
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            while (sum >= s) {
                sum -= nums[l];
                min_len = Math.min(min_len, i - l + 1);
                l++;
            }
        }
        return min_len == Integer.MAX_VALUE ? 0 : min_len;
    }

    public static void main(String[] args) {
        int target = 7, nums[] = { 2, 3, 1, 2, 4, 3 };
        System.out.println(minSubArrayLen(target, nums));
    }
}