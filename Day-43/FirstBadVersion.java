// 278. First Bad Version

class FirstBadVersion {
    public static void main(String[] args) {
        int n = 2126753390;
        System.out.println(firstBadVersion(n));
    }

    private static int firstBadVersion(int n) {
        int l = 1;
        int h = n;
        while (l < h) {
            int mid = l + (h - l) / 2;
            if (isBadVersion(mid)) {
                h = mid;
            } else {
                l = mid + 1;
            }
        }
        return l;
    }

    private static boolean isBadVersion(int mid) {
        int bad = 1702766719;
        if (mid == bad)
            return true;
        return false;
    }
}