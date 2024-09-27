// 739. Daily Temperatures

import java.util.Stack;

class Pair {
    int num;
    int ind;

    Pair(int num, int ind) {
        this.num = num;
        this.ind = ind;
    }
}

class DailyTemperatures {
    public static void main(String[] args) {
        int arr[] = { 73, 74, 75, 71, 69, 72, 76, 73 };
        dailyTemperatures(arr);
    }

    private static void dailyTemperatures(int arr[]) {
        Stack<Pair> st = new Stack<>();
        int ans[] = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            while (!st.isEmpty() && st.peek().num < arr[i]) {
                ans[st.peek().ind] = i - st.peek().ind;
                st.pop();
            }
            st.push(new Pair(arr[i], i));
        }
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i] + " ");
        }
    }
}