// 128. Longest Consecutive Sequence

import java.util.HashSet;
import java.util.Set;

class LongestConsecutiveSequence {
    public static void main(String[] args) {
        int arr[] = { 0, 3, 7, 2, 5, 8, 4, 6, 0, 1 };
        int n = longestConsecutiveSequenceUtil(arr);
        System.out.println(n);
    }

    private static int longestConsecutiveSequenceUtil(int[] arr) {
        Set<Integer> s = new HashSet<>();
        for (int i : arr) {
            s.add(i);
        }
        int ans = 0;
        for (int i : arr) {
            if (!s.contains(i - 1)) {
                int next_num = i;
                int length = 0;
                while (s.contains(next_num)) {
                    length++;
                    next_num++;
                }
                ans = Math.max(ans, length);
            }
        }
        return ans;
    }
}