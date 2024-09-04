// Merge Intervals

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class MergeIntervals {
    public static void main(String[] args) {
        int[][] intervals = { { 1, 3 }, { 2, 6 }, { 8, 10 }, { 15, 18 } };
        int ans[][] = mergeIntervalsUtil(intervals);
        for (int i = 0; i < ans.length; i++) {
            System.out.println("[" + ans[i][0] + "," + ans[i][1] + "]");
        }
    }

    private static int[][] mergeIntervalsUtil(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        List<List<Integer>> al = new ArrayList<>();
        List<Integer> l = new ArrayList<>();
        l.add(intervals[0][0]);
        l.add(intervals[0][1]);
        al.add(l);
        int x = 0;
        for (int i = 1; i < intervals.length; i++) {
            l = new ArrayList<>();
            if (al.get(x).get(1) >= intervals[i][0]) {
                al.get(x).set(1, Math.max(al.get(x).get(1), intervals[i][1]));
            } else {
                l.add(intervals[i][0]);
                l.add(intervals[i][1]);
                al.add(l);
                x++;
            }
        }
        int ans[][] = new int[al.size()][2];
        for (int i = 0; i < al.size(); i++) {
            ans[i][0] = al.get(i).get(0);
            ans[i][1] = al.get(i).get(1);
        }
        return ans;
    }
}