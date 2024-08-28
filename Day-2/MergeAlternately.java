class MergeAlternately {

    public static String mergeWordsAlternately(String word1, String word2) {
        String ans = "";
        for (int i = 0; i < Math.max(word1.length(), word2.length()); i++) {
            ans += i < word1.length() ? word1.charAt(i) : "";
            ans += i < word2.length() ? word2.charAt(i) : "";
        }
        return ans;
    }

    public static void main(String[] args) {
        String word1 = "abc";
        String word2 = "pqr";
        System.out.println(mergeWordsAlternately(word1, word2));
    }
}