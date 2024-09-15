// 49 Group Anagrams

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class GroupAnagrams {
    public static void main(String[] args) {
        String[] strs = { "eat", "tea", "tan", "ate", "nat", "bat" };
        List<List<String>> result = groupAnagrams(strs);
        for (int i = 0; i < result.size(); i++) {
            for (int j = 0; j < result.get(i).size(); j++) {
                System.out.print(result.get(i).get(j) + " ");
            }
            System.out.println();
        }
    }

    private static List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> mp = new HashMap<>();
        for (String s : strs) {
            char[] ch = new char[26];
            for (char c : s.toCharArray()) {
                ch[c - 'a']++;
            }
            String key = "";
            for (int i = 0; i < 26; i++) {
                key += String.valueOf(ch[i]);
            }
            // mp.computeIfAbsent(key, k -> new ArrayList<>()).add(s);
            if (!mp.containsKey(key)) {
                List<String> l = new ArrayList<>();
                l.add(s);
                mp.put(key, l);
            } else {
                mp.get(key).add(s);
            }
        }
        return new ArrayList<>(mp.values());
    }
}