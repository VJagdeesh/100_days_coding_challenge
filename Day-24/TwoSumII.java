// 167. Two Sum II - Input Array Is Sorted

class TwoSumII {
    public static void main(String[] args) {
        int[] nums = { 2, 7, 11, 15 };
        int target = 9;
        int[] result = twoSum(nums, target);
        for (int i : result) {
            System.out.println(i + "  ");
        }
    }

    private static int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        int l = 0;
        int r = nums.length - 1;
        while (l <= r) {
            int sum = nums[l] + nums[r];
            if (sum == target) {
                result[0] = l + 1;
                result[1] = r + 1;
                break;
            } else if (sum > target) {
                r--;
            } else {
                l++;
            }
        }
        return result;
    }
}