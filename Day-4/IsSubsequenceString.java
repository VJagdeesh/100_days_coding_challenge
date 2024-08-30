class IsSubsequenceString {
    static boolean isSubsequence(String s, String t) {
        if (s.length() == 0)
            return true;
        int s_ptr = 0;
        int t_ptr = 0;
        while (t_ptr < t.length()) {
            if (s.charAt(s_ptr) == t.charAt(t_ptr)) {
                s_ptr++;
                if (s_ptr == s.length()) {
                    return true;
                }
            }
            t_ptr++;
        }
        return false;
    }

    public static void main(String[] args) {
        String s1 = "abc";
        String s2 = "ahbgdc";
        System.out.println(isSubsequence(s1, s2)); // true
    }
}