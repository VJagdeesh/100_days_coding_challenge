// 704. Binary Search

class BinarySearch {
    public static void main(String[] args) {
        int nums[] = { -1, 0, 3, 5, 9, 12 };
        int target = 2;
        int result = binarySearch(nums, target);
        System.out.println("Index of " + target + " is " + result);
    }

    private static int binarySearch(int[] nums, int target) {
        int l = 0;
        int h = nums.length - 1;
        while (l <= h) {
            int mid = (l + h) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                l = mid + 1;
            } else {
                h = mid - 1;
            }
        }
        return -1;
    }
}