package xukexiang;

/**
 * 输入两棵二叉树A，B，判断B是不是A的子结构。（ps：我们约定空树不是任意一个树的子结构）
 * 思路：同时遍历树A和B的左右子树，若两个子树同时为空，说明已经遍历到叶子节点则返回true,
 * 如果A树还没到叶子节点，B树到叶子节点了，也返回true
 * 如果A数到叶子节点，B树没到叶子节点，则返回false
 * 如果结点的值相等才继续遍历，若不相等而且A和B树都没到达叶子节点，则返回false
 *
 */
public class Main17 {
    public boolean HasSubtree(TreeNode root1, TreeNode root2) {
        if(root1 == null || root2 == null) {
            return false;
        }
        return isSubTree(root1,root2) || isSubTree(root1.left,root2) || isSubTree(root1.right,root2);
    }

    public boolean isSubTree(TreeNode root1,TreeNode root2) {
        if(root1 == null && root2 == null){
            return true;
        }
        if(root1 == null){
            return false;
        }
        if(root2 == null){
            return true;
        }
        if(root1.val == root2.val) {
            return isSubTree(root1.left,root2.left) && isSubTree(root1.right,root2.right);
        }else{
            return false;
        }
    }
}
