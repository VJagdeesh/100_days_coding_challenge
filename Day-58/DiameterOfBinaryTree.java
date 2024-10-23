// 543. Diameter of Binary Tree

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int x) {
        val = x;
    }

    TreeNode(int x, TreeNode left, TreeNode right) {
        val = x;
        this.left = left;
        this.right = right;
    }
}

class DiameterOfBinaryTree {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        System.out.println(diameterOfBinaryTree(root));
    }

    private static int diameterOfBinaryTree(TreeNode root) {
        int res[] = new int[1];
        check(root, res);
        return res[0];
    }

    private static int check(TreeNode root, int res[]) {
        if (root == null) {
            return 0;
        }
        int l = check(root.left, res);
        int r = check(root.right, res);
        res[0] = Math.max(res[0], (l + r));
        return Math.max(l, r) + 1;
    }
}