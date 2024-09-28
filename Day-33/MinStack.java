// 155. Min Stack

import java.util.Stack;

class MinStack {
    private Stack<Integer> stack;
    private Stack<Integer> minStack;

    // Constructor initializes the two stacks
    public MinStack() {
        stack = new Stack<>();
        minStack = new Stack<>();
    }

    // Push value onto the stack and minStack if necessary
    public void push(int val) {
        stack.push(val);
        if (minStack.isEmpty() || val <= minStack.peek()) {
            minStack.push(val);
        }
    }

    // Pop value from the stack and minStack if it's the minimum value
    public void pop() {
        if (stack.peek().equals(minStack.peek())) {
            minStack.pop();
        }
        stack.pop();
    }

    // Return the top value from the stack
    public int top() {
        return stack.peek();
    }

    // Get the minimum value from the minStack
    public int getMin() {
        return minStack.peek();
    }

    // Main method to demonstrate the functionality
    public static void main(String[] args) {
        MinStack minStack = new MinStack();

        // Push elements onto the stack
        minStack.push(-2);
        minStack.push(0);
        minStack.push(-3);

        // Get minimum value, should return -3
        System.out.println("Minimum: " + minStack.getMin()); // --> -3

        // Pop the top value (-3)
        minStack.pop();

        // Get the top value, should return 0
        System.out.println("Top: " + minStack.top()); // --> 0

        // Get minimum value, should return -2 after -3 is popped
        System.out.println("Minimum: " + minStack.getMin()); // --> -2
    }
}
