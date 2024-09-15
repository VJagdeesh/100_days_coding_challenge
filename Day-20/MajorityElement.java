// 169. Majority Element

class MajorityElement {
    public static void main(String[] args) {
        int[] nums = { 2, 2, 1, 1, 1, 2, 2 };
        System.out.println(majorityElement(nums)); // Output: 3
    }

    private static int majorityElement(int[] nums) {
        int cnt = 0;
        int ans = -1;
        for (int i = 0; i < nums.length; i++) {
            if (cnt == 0) {
                ans = nums[i];
                cnt++;
            } else if (ans == nums[i]) {
                cnt++;
            } else {
                cnt--;
            }
        }
        return ans;
    }
}