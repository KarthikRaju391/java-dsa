package BinaryTrees;

import java.util.*;

public class SymmetricCheck {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(2);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(4);
        root.right.left = new TreeNode(4);
        root.right.right = new TreeNode(3);
//        root.left.left.right = new TreeNode(8);
//        root.left.left.right.right  = new TreeNode(9);
        if(root != null) {
            System.out.println(isSymmetric(root.left, root.right));
        }
    }

    static boolean isSymmetric(TreeNode left, TreeNode right) {
       if(left == null || right == null) {
           return left == right;
       }
       if(left.val != right.val) {
           return false;
       }

       return isSymmetric(left.left, right.right) && isSymmetric(left.right, right.left);
    }
}
