
// 242. Valid Anagram

import java.util.Arrays;

class ValidAnagram {
    public static void main(String[] args) {
        String s = "anagram";
        String t = "nagaram";
        System.out.println(isValidAnagram(s, t));

    }

    private static boolean isValidAnagram(String s, String t) {
        char c1[] = s.toCharArray();
        char c2[] = t.toCharArray();
        // if(s.length() != t.length()){
        // return false;
        // }else{
        // for(int i=0;i<s.length();i++){
        // if(c1[i]!=c2[i]){
        // return false;
        // }
        // }
        // }
        // return true;
        Arrays.sort(c1);
        Arrays.sort(c2);
        return Arrays.equals(c1, c2);
    }
}