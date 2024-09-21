
// 15. 3Sum
import java.util.*;

class ThreeSum {
    public static void main(String[] args) {
        int nums[] = { -1, 0, 1, 2, -1, -4 };
        List<List<Integer>> l = threeSum(nums);
        for (int i = 0; i < l.size(); i++) {
            for (int j = 0; j < l.get(i).size(); j++) {
                System.out.print(l.get(i).get(j) + " ");
            }
            System.out.println();
        }
    }

    private static List<List<Integer>> threeSum(int[] nums) {
        HashMap<Integer, Integer> mp = new HashMap<>();
        Set<List<Integer>> s = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            mp.put(nums[i], i);
        }
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                int complement = -nums[i] - nums[j];
                if (mp.containsKey(complement) && mp.get(complement) != i && mp.get(complement) != j) {
                    List<Integer> list = new ArrayList<>();
                    list.add(nums[i]);
                    list.add(nums[j]);
                    list.add(complement);
                    Collections.sort(list);
                    s.add(list);
                }
            }
        }
        return new ArrayList<>(s);
    }
}