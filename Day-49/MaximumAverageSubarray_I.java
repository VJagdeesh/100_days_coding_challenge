// 643. Maximum Average Subarray I

class MaximumAverageSubarray_I {
    public static void main(String[] args) {
        int nums[] = { 1, 12, -5, -6, 50, 3 }, k = 4;
        System.out.println("Maximum average is " + findMaximumAverageSubarray(nums, k));
    }

    private static double findMaximumAverageSubarray(int[] nums, int k) {
        double sum = 0;
        double maxiAvg = Double.NEGATIVE_INFINITY;
        for (int i = 0; i < k; i++) {
            sum += nums[i];
        }
        maxiAvg = sum / k;
        for (int i = k; i < nums.length; i++) {
            sum += nums[i];
            sum -= nums[i - k];
            maxiAvg = Math.max(maxiAvg, sum / k);
        }
        return maxiAvg;
    }
}