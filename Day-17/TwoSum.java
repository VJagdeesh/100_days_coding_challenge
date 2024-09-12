// 1. Two Sum

import java.util.HashMap;

class TwoSum {
    public static void main(String[] args) {
        int[] nums = { 2, 7, 11, 15 };
        int target = 9;
        int[] result = twoSum(nums, target);
        for (int i : result) {
            System.out.println(i);
        }
    }

    private static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        int res[] = new int[2];
        for (int i = 0; i < nums.length; i++) {
            if (hm.containsKey(target - nums[i])) {
                res[0] = i;
                res[1] = hm.get(target - nums[i]);
            } else {
                hm.put(nums[i], i);
            }
        }
        return res;
    }
}