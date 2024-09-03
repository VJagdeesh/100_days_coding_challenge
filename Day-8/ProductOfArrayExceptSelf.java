// leetcode 238. Product of Array Except Self
class ProductOfArrayExceptSelf {
    public static void main(String[] args) {
        int nums[] = { 1, 2, 3, 4 };
        int ans[] = productOfArrayExceptSelfUtil(nums);
        for (int i : ans) {
            System.out.print(i + " ");
        }
    }

    private static int[] productOfArrayExceptSelfUtil(int[] nums) {
        // TODO Auto-generated method stub
        int left[] = new int[nums.length];
        int right[] = new int[nums.length];
        int result[] = new int[nums.length];
        left[0] = 1;
        right[nums.length - 1] = 1;
        for (int i = 1; i < nums.length; i++) {
            left[i] = nums[i - 1] * left[i - 1];
        }
        for (int i = nums.length - 2; i >= 0; i--) {
            right[i] = nums[i + 1] * right[i + 1];
        }
        for (int i = 0; i < nums.length; i++) {
            result[i] = right[i] * left[i];
        }
        return result;
    }
}