// 567. Permutation in String

import java.util.Arrays;

class PermutationInString {
    public static void main(String[] args) {
        String s1 = "ab", s2 = "eidbaooo";
        System.out.println(checkInclusion(s1, s2));
    }

    private static boolean checkInclusion(String s1, String s2) {
        if (s1.length() > s2.length())
            return false;
        int a1[] = new int[26];
        int a2[] = new int[26];
        for (int i = 0; i < s1.length(); i++) {
            a1[s1.charAt(i) - 'a']++;
            a2[s2.charAt(i) - 'a']++;
        }
        if (Arrays.equals(a1, a2)) {
            return true;
        }
        for (int i = s1.length(); i < s2.length(); i++) {
            a2[s2.charAt(i) - 'a']++;
            a2[s2.charAt(i - s1.length()) - 'a']--;
            if (Arrays.equals(a1, a2)) {
                return true;
            }
        }
        return false;
    }
}