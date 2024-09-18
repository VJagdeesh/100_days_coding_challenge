// 344 Reverse String
class ReverseString {
    public static void main(String[] args) {
        char s[] = { 'h', 'e', 'l', 'l', 'o' };
        reverse(s);
    }

    private static void reverse(char[] s) {
        for (int i = 0; i < s.length / 2; i++) {
            char t = s[i];
            s[i] = s[s.length - 1 - i];
            s[s.length - 1 - i] = t;
        }
        for (char c : s) {
            System.out.print(c + ", ");
        }
    }
}