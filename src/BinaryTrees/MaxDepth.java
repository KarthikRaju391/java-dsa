package BinaryTrees;

public class MaxDepth {
    public int findMaxDepth(TreeNode root) {
        if(root == null) {
            return 0;
        }

        int lh = findMaxDepth(root.left);
        int rh = findMaxDepth(root.right);

        return 1 + Math.max(lh, rh);
    }

    public int checkBalance(TreeNode root) {
        if(root == null) {
            return 0;
        }

        int lh = checkBalance(root.left);
        if(lh == -1) return -1;
        int rh = checkBalance(root.right);
        if(rh == -1) return -1;

        if(Math.abs(lh - rh) > 1) {
            return -1;
        }

        return Math.max(lh, rh) + 1;
    }

    public int getDiameter(TreeNode root, int[] diameter) {
        if(root == null) return 0;

        int lh = getDiameter(root.left, diameter);
        int rh = getDiameter(root.right, diameter);

        diameter[0] = Math.max(diameter[0], lh +  rh);
        return 1 + Math.max(lh, rh);
    }
}
