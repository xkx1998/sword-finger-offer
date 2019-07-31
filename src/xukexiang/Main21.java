package xukexiang;

import java.util.LinkedList;

/**
 * 题目：栈的压入、弹出序列
 * 题目描述：输入两个整数序列，第一个序列表示栈的压入顺序，请判断第二个序列是否可能为该栈的弹出顺序。
 * 假设压入栈的所有数字均不相等。例如序列1,2,3,4,5是某栈的压入顺序，序列4,5,3,2,1是该压栈序列对应的一个弹出序列，
 * 但4,3,5,1,2就不可能是该压栈序列的弹出序列。（注意：这两个序列的长度是相等的）
 */
public class Main21 {
    /**
     * 思路：如果栈顶元素和出栈数组某个元素相等，那么就从栈顶开始出栈直到栈为空或者栈顶和出栈数组元素不相等
     */

    public boolean IsPopOrder(int[] pushA, int[] popA) {
        LinkedList<Integer> stack = new LinkedList<>();
        if (pushA == null || popA == null)
            return false;

        int index = 0;
        for (int i = 0; i < pushA.length; i++) {
            stack.push(pushA[i]);
            while (!stack.isEmpty() && popA[index] == stack.peek()) {
                index++;
                stack.pop();
            }
        }
        return stack.isEmpty();
    }
}
