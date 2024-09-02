import java.util.ArrayList;
import java.util.List;

class SummaryRanges {
    public static List<String> summaryRangesUtil(int[] nums) {
        List<String> ls = new ArrayList<>();
        int i = 0;
        while (i < nums.length) {
            int start = nums[i];
            while (i < nums.length - 1 && nums[i] + 1 == nums[i + 1]) {
                i++;
            }
            if (start != nums[i]) {
                String t = String.valueOf(start) + "->" + String.valueOf(nums[i]);
                ls.add(t);
            } else {
                ls.add(String.valueOf(start));
            }
            i++;
        }
        return ls;
    }

    public static void main(String[] args) {
        int nums[] = { 0, 1, 2, 4, 5, 7 };
        List<String> ls = summaryRangesUtil(nums);
        for (int i = 0; i < ls.size(); i++) {
            System.out.print(ls.get(i) + ", ");
        }
    }
}