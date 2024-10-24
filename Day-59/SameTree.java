// 100. Same Tree

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int x) {
        val = x;
    }

    TreeNode(int val, TreeNode l, TreeNode r) {
        this.val = val;
        this.left = l;
        this.right = r;
    }
}

class SameTree {
    private static boolean isSameTree(TreeNode p, TreeNode q) {
        return isBalanced(p, q);
    }

    private static boolean isBalanced(TreeNode p, TreeNode q) {
        if (p == null && q == null) {
            return true;
        }
        if ((p == null && q != null) || (q == null && p != null)) {
            return false;
        }
        if (p.val != q.val) {
            return false;
        }
        return isBalanced(p.left, q.left) && isBalanced(p.right, q.right);
    }

    public static void main(String[] args) {
        TreeNode p = new TreeNode(1);
        TreeNode q = new TreeNode(1);
        System.out.println(isSameTree(p, q));
    }
}