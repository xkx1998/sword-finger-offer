package xukexiang;

/**
 * 题目：二叉树镜像
 * 题目描述：操作给定的二叉树，将其变换为源二叉树的镜像。
 * 思路：遍历二叉树，根结点的左右子树交换
 */
public class Main18 {
    public void Mirror(TreeNode root) {
        if (root != null) {
            TreeNode temp = root.left;
            root.left = root.right;
            root.right = temp;

            if (root.left != null)
                Mirror(root.left);
            if (root.right != null)
                Mirror(root.right);
        }
    }
}
