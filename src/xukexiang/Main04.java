package xukexiang;


public class Main04 {
    public TreeNode reConstructBinaryTree(int[] pre, int[] in) {
        int len = pre.length;
        TreeNode root = new TreeNode(pre[0]);

        if (len == 1) {
            root.left = null;
            root.right = null;
            return root;
        }

        int in_root_idx = 0;
        for (int i = 0; i < len; i++) {
            if (in[i] == root.val) {
                in_root_idx = i;
                break;
            }

        }

        if (in_root_idx > 0) {
            int[] _pre = new int[in_root_idx];
            int[] _in = new int[in_root_idx];

            for (int i = 0; i < in_root_idx; i++) {
                _pre[i] = pre[i + 1];
                _in[i] = in[i];
            }
            root.left = reConstructBinaryTree(_pre, _in);
        } else {
            root.left = null;
        }

        if (len - in_root_idx - 1 > 0) {
            int[] _pre = new int[len - in_root_idx -1];
            int[] _in = new int[len - in_root_idx - 1];

            for (int i = in_root_idx + 1; i < len; i++) {
                _pre[i - in_root_idx - 1] = pre[i];
                _in[i - in_root_idx - 1] = in[i];
            }

            root.right = reConstructBinaryTree(_pre, _in);
        } else {
            root.right = null;
        }
        return root;
    }
}
