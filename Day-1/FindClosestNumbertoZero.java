class FindClosestNumbertoZero {

    public static int findClosestNumber(int[] nums) {
        int min_ele = Integer.MAX_VALUE;
        int min_index = 0;
        for (int i = 0; i < nums.length; i++) {
            int dist = Math.abs(nums[i] - 0);
            if (min_ele >= dist) {
                if (min_ele == dist) {
                    min_ele = nums[i] > 0 ? nums[i] : min_ele;
                    min_index = nums[i] > 0 ? i : min_index;
                    // break;
                } else {
                    min_ele = dist;
                    min_index = i;
                }
            }
        }
        return nums[min_index];
    }

    public static void main(String[] args) {
        int[] arr = { 2, -1, 1 };
        System.out.println(findClosestNumber(arr));
    }
}