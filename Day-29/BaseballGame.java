// 682. Baseball Game

import java.util.Stack;

class BaseballGame {
    public static void main(String[] args) {
        String op[] = { "5", "-2", "4", "C", "D", "9", "+", "+" };
        System.out.println(calPoints(op));
    }

    private static int calPoints(String[] op) {
        Stack<String> st = new Stack<>();
        for (String c : op) {
            switch (c) {
                case "C":
                    st.pop();
                    break;
                case "D":
                    st.push(String.valueOf(Integer.parseInt(st.peek()) * 2));
                    break;
                case "+":
                    int a = Integer.valueOf(st.get(st.size() - 1));
                    int b = Integer.valueOf(st.get(st.size() - 2));
                    st.push(String.valueOf(a + b));
                    break;
                default:
                    st.push(c);
                    break;
            }
        }
        int sum = 0;
        for (int i = 0; i < st.size(); i++) {
            sum += Integer.parseInt(st.get(i));
        }
        return sum;
    }
}