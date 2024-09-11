// 1189. Maximum Number of Balloons

import java.util.HashMap;

class MaximumNumberOfBalloons {
    public static int maxNumberOfBalloons(String text) {
        HashMap<Character, Integer> hm = new HashMap<>();
        String tar = "balloon";
        for (char c : text.toCharArray()) {
            if (tar.indexOf(c) != -1) {
                hm.put(c, hm.getOrDefault(c, 0) + 1);
            }
        }
        if (!hm.containsKey('b') || !hm.containsKey('a') || !hm.containsKey('l') || !hm.containsKey('o')
                || !hm.containsKey('n')) {
            return 0;
        } else {
            // return
            // Math.min(Math.min(hm.get('b'),hm.get('a')),Math.min(hm.get('l')/2,hm.get('o')/2),hm.get('m'));
            return Math.min(Math.min(hm.get('b'), hm.get('a')),
                    Math.min(hm.get('l') / 2, Math.min(hm.get('o') / 2, hm.get('n'))));
        }
    };

    public static void main(String[] args) {
        System.out.println(maxNumberOfBalloons("leetcode"));
    }
}