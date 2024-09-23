// 42. Trapping Rain Water
class TrappingRainWater {
    public static void main(String[] args) {
        int height[] = { 0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1 };
        System.out.println(trap(height));
    }

    private static int trap(int[] height) {
        int max_l[] = new int[height.length];
        int max_r[] = new int[height.length];
        int maxi = 0;
        for (int i = 1; i < height.length; i++) {
            maxi = Math.max(maxi, height[i - 1]);
            max_l[i] = maxi;
        }
        maxi = 0;
        for (int i = height.length - 2; i >= 0; i--) {
            maxi = Math.max(maxi, height[i + 1]);
            max_r[i] = maxi;
        }
        int sum = 0;
        for (int i = 0; i < height.length; i++) {
            int res = Math.min(max_l[i], max_r[i]) - height[i];
            if (res > 0) {
                sum += res;
            }
        }
        return sum;
    }
}