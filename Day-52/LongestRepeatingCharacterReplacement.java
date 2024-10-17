// 424. Longest Repeating Character Replacement

class LongestRepeatingCharacterReplacement {
    public static void main(String[] args) {
        String s = "ABAB";
        int k = 2;
        System.out.println(findLongestRepeatingCharacterReplacement(s, k));
    }

    private static int findLongestRepeatingCharacterReplacement(String s, int k) {
        int l = 0;
        int max_len = 0;
        int arr[] = new int[26];
        for (int i = 0; i < s.length(); i++) {
            arr[s.charAt(i) - 'A']++;
            while (((i - l + 1) - maxEle(arr)) > k) {
                arr[s.charAt(i) - 'A']--;
                l++;
            }
            max_len = Math.max(max_len, i - l + 1);
        }
        return max_len;
    }

    private static int maxEle(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            max = Math.max(max, arr[i]);
        }
        return max;
    }
}