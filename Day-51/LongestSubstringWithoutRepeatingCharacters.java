// 3. Longest Substring Without Repeating Characters

import java.util.HashSet;
import java.util.Set;

class LongestSubstringWithoutRepeatingCharacters {
    public static void main(String[] args) {
        String s = "abcabcbb";
        System.out.println(lengthOfLongestSubstring(s));
    }

    private static int lengthOfLongestSubstring(String s) {
        int l = 0;
        int max_len = 0;
        Set<Character> st = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            while (st.contains((char) s.charAt(i))) {
                st.remove((char) s.charAt(l));
                l++;
            }
            st.add((char) s.charAt(i));
            max_len = Math.max(max_len, i - l + 1);
        }
        return max_len;
    }
}