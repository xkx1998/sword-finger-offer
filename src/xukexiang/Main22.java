package xukexiang;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * 题目：从上往下打印二叉树
 * 描述：从上往下打印出二叉树的每个节点，同层节点从左至右打印
 * 思路：层序遍历二叉树,遍历树，用一个队列存放每个结点的左右子树，然后结点不断出队列打印结点值
 */
public class Main22 {
    public ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {
        ArrayList<Integer> list = new ArrayList<>();
        if (root == null) return list;
        LinkedList<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();
            list.add(node.val);
            if (node.left != null)
                queue.add(node.left);
            if (node.right != null)
                queue.add(node.right);
        }
        return list;
    }
}
