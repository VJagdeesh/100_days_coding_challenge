//150. Evaluate Reverse Polish Notation

import java.util.Stack;

class EvaluateReversePolishNotation {
    public static void main(String[] args) {
        String tokens[] = { "10", "6", "9", "3", "+", "-11", "*", "/", "*", "17", "+", "5", "+" };
        System.out.println(evaluateRPN(tokens));
    }

    private static int evaluateRPN(String[] tokens) {
        Stack<String> st = new Stack<>();
        int a = 0, b = 0;
        for (String s : tokens) {
            switch (s) {
                case "+":
                    a = Integer.parseInt(st.pop());
                    b = Integer.parseInt(st.pop());
                    st.push(String.valueOf(a + b));
                    break;
                case "-":
                    a = Integer.parseInt(st.pop());
                    b = Integer.parseInt(st.pop());
                    st.push(String.valueOf(b - a));
                    break;
                case "*":
                    a = Integer.parseInt(st.pop());
                    b = Integer.parseInt(st.pop());
                    st.push(String.valueOf(a * b));
                    break;
                case "/":
                    a = Integer.parseInt(st.pop());
                    b = Integer.parseInt(st.pop());
                    st.push(String.valueOf(b / a));
                    break;
                default:
                    st.push(s);
                    break;
            }
        }
        return Integer.parseInt(st.pop());
    }
}