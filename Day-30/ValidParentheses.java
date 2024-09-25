
// 20. Valid Parentheses
import java.util.Stack;

class ValidParentheses {
    public static void main(String[] args) {
        String s = "()[]{}";
        System.out.println(isValid(s)); // true
    }

    private static boolean isValid(String s) {
        char ch[] = s.toCharArray();
        Stack<Character> st = new Stack<>();
        for (char c : ch) {
            switch (c) {
                case '(':
                    st.push(c);
                    break;
                case '{':
                    st.push(c);
                    break;
                case '[':
                    st.push(c);
                    break;
                case ')':
                    if (st.size() == 0 || st.peek() != '(')
                        return false;
                    st.pop();
                    break;
                case ']':
                    if (st.size() == 0 || st.peek() != '[')
                        return false;
                    st.pop();
                    break;
                case '}':
                    if (st.size() == 0 || st.peek() != '{')
                        return false;
                    st.pop();
                    break;
                default:
                    break;
            }
        }
        if (st.size() == 0)
            return true;
        return false;
    }
}
