// 1004. Max Consecutive Ones III

class MaxConsecutiveOnes_III {
    public static int longestOnes(int[] nums, int k) {
        int l = 0;
        int maxLen = 0;
        int max_zero = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                max_zero++;
            }
            while (max_zero > k) {
                if (nums[l] == 0) {
                    max_zero--;
                }
                l++;
            }
            maxLen = Math.max(maxLen, i - l + 1);
        }
        return maxLen;
    }

    public static void main(String[] args) {
        int nums[] = { 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 1, 0, 0, 0, 1, 1, 1, 1 }, k = 3;
        System.out.println(longestOnes(nums, k));
    }
}