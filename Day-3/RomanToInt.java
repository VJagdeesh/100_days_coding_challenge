import java.util.HashMap;

class RomanToInt {

    public static int romanToInt(String word) {
        HashMap<Character, Integer> mp = new HashMap<>();
        mp.put('I', 1);
        mp.put('V', 5);
        mp.put('X', 10);
        mp.put('L', 50);
        mp.put('C', 100);
        mp.put('D', 500);
        mp.put('M', 1000);
        int res = 0;
        for (int i = 0; i < word.length(); i++) {
            if (i < word.length() - 1 && mp.get(word.charAt(i)) < mp.get(word.charAt(i + 1))) {
                res -= mp.get(word.charAt(i));
            } else {
                res += mp.get(word.charAt(i));
            }
        }
        return res;
    }

    public static void main(String[] args) {
        String s = "MCMXCIV";
        System.out.println(romanToInt(s));
    }
}