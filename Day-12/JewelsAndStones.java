// 771 Jewels And Stones

import java.util.HashMap;

class JewelsAndStones {
    public static void main(String[] args) {
        String jewels = "aA";
        String stones = "aAAbbbb";
        int numJewelsInStones = numJewelsInStones(jewels, stones);
        System.out.println(numJewelsInStones);
    }

    private static int numJewelsInStones(String jewels, String stones) {
        HashMap<Character, Integer> hm = new HashMap<>();
        for (int i = 0; i < jewels.length(); i++) {
            if (hm.containsKey(jewels.charAt(i))) {
                hm.put(jewels.charAt(i), hm.get(jewels.charAt(i)) + 1);
            } else {
                hm.put(jewels.charAt(i), 1);
            }
        }
        int count = 0;
        for (int i = 0; i < stones.length(); i++) {
            if (hm.containsKey(stones.charAt(i))) {
                count = count + hm.get(stones.charAt(i));
            }
        }
        return count;
    }
}