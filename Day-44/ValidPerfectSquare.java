// 367. Valid Perfect Square

class ValidPerfectSquare {

    public static boolean isPerfectSquare(int num) {
        int l = 1;
        int h = num;
        while (l <= h) {
            int mid = l + (h - l) / 2;
            if (Math.pow(mid, 2) == num) {
                return true;
            } else if (Math.pow(mid, 2) > num) {
                h = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int n = 25;
        System.out.println(isPerfectSquare(n));
    }
}