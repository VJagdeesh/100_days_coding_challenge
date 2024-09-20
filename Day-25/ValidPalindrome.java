// 125. Valid Palindrome

class ValidPalindrome {
    public static void main(String[] args) {
        System.out.println(isValidPalindrome("A man, a plan, a canal: Panama"));
    }

    private static boolean isValidPalindrome(String s) {
        s = s.toLowerCase();
        int l = 0;
        int r = s.length() - 1;
        while (l < r) {
            if (Character.isLetterOrDigit(s.charAt(l)) && Character.isLetterOrDigit(s.charAt(r))) {
                if (Character.toLowerCase(s.charAt(l)) == Character.toLowerCase(s.charAt(r))) {
                    l++;
                    r--;
                } else {
                    return false;
                }
            } else {
                if (!Character.isLetterOrDigit(s.charAt(l))) {
                    l++;
                } else {
                    r--;
                }
            }
        }
        return true;
    }
}