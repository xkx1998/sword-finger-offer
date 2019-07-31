package xukexiang;

import java.util.LinkedList;

/**
 * 题目：包含min函数的栈
 */
public class Main20 {
    LinkedList<Integer> stack = new LinkedList<>();
    int min = Integer.MAX_VALUE;

    public void push(int node) {
        stack.push(node);
        if (min > node) {
            min = node;
        }
    }

    public void pop() {
        int num = stack.pop();
        if (num == min) {
            min = Integer.MAX_VALUE;
            for (int i : stack) {
                if (min > i)
                    min = i;
            }
        }
    }

    public int top() {
        return stack.peek();
    }

    public int min() {
        return min;
    }
}
