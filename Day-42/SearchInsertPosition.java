// 35. Search Insert Position

class SearchInsertPosition {
    private static int searchInsert(int nums[], int target) {
        int l = 0;
        int h = nums.length - 1;
        while (l <= h) {
            int mid = (l + h) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] > target) {
                h = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        int mid = (l + h) / 2;
        if (target > nums[mid]) {
            return mid + 1;
        } else {
            return mid;
        }
    }

    public static void main(String[] args) {
        int[] nums = { 1, 3, 5, 6 };
        int target = 2;
        System.out.println(searchInsert(nums, target));
    }
}