// 875. Koko Eating Bananas

class KokoEatingBananas {
    public static void main(String[] args) {
        int piles[] = { 3, 6, 7, 11 };
        int h = 8;
        System.out.println(kokoEatingBananas(piles, h));
    }

    private static int utilFn(int piles[], int mid) {
        int res = 0;
        for (int i : piles) {
            res += Math.ceil((double) i / mid);
        }
        return res;
    }

    private static int kokoEatingBananas(int[] piles, int h) {
        int maxi = 0;
        for (int i : piles) {
            maxi = Math.max(maxi, i);
        }
        int l = 1;
        int r = maxi;
        while (l <= r) {
            int mid = (l + r) / 2;
            int ans = utilFn(piles, mid);
            if (ans <= h) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return l;
    }
}