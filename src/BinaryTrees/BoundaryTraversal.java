package BinaryTrees;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class BoundaryTraversal {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.left.left = new TreeNode(3);
        root.left.left.right = new TreeNode(4);
        root.left.left.right.left = new TreeNode(5);
        root.left.left.right.right = new TreeNode(6);
        root.right = new TreeNode(7);
        root.right.right = new TreeNode(8);
        root.right.right.left = new TreeNode(9);
        root.right.right.left.left = new TreeNode(10);
        root.right.right.left.right = new TreeNode(11);

        ArrayList<Integer> boundaryTraversalRes;
        boundaryTraversalRes = boundaryTraversal(root);
        System.out.println(boundaryTraversalRes);
    }

    static ArrayList<Integer> boundaryTraversal(TreeNode node) {
        ArrayList<Integer> ans = new ArrayList<>();
        if(!isLeaf(node)) ans.add(node.val);
        addLeftBoundary(node, ans);
        addLeafNodes(node, ans);
        addRightBoundary(node, ans);
        return ans;
    }

    static boolean isLeaf(TreeNode node) {
        return node.left == null && node.right == null;
    }

    static void addLeftBoundary(TreeNode root, ArrayList<Integer> res) {
        TreeNode curr = root.left;
        while(curr != null) {
            if(!isLeaf(curr)) res.add(curr.val);
            if(curr.left != null) curr = curr.left;
            else curr = curr.right;
        }
    }

    static void addLeafNodes(TreeNode root, ArrayList<Integer> res) {
        if(isLeaf(root)) {
            res.add(root.val);
            return;
        }

        if(root.left != null) addLeafNodes(root.left, res);
        if(root.right != null) addLeafNodes(root.right, res);
    }

    static void addRightBoundary(TreeNode root, ArrayList<Integer> res) {
        TreeNode curr = root.right;
        ArrayList<Integer> temp = new ArrayList<>();
        while(curr != null) {
            if(!isLeaf(curr)) temp.add(curr.val);
            if(curr.right != null) curr = curr.right;
            else curr = curr.left;
        }
        for(int i = temp.size() - 1; i >= 0; --i) {
            res.add(temp.get(i));
        }
    }
}
