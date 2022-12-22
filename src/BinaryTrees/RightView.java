package BinaryTrees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class RightView {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);
        root.left.left.right = new TreeNode(8);
        root.left.left.right.right  = new TreeNode(9);

        System.out.println(getRightView(root));
        System.out.println(getLeftView(root));
    }

    static ArrayList<Integer> getLeftView(TreeNode root) {
        ArrayList<Integer> leftView = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();

        if(root == null) return leftView;

        queue.offer(root);

        while(!queue.isEmpty()) {
            int size = queue.size();
            for(int i = 0; i < size; i++) {
                TreeNode curr = queue.poll();
                if(i == 0) {
                    leftView.add(curr.val);
                }

                if(curr.left != null) {
                    queue.offer(curr.left);
                }
                if(curr.right != null) {
                    queue.offer(curr.right);
                }
            }
        }
        return leftView;
    }

    static ArrayList<Integer> getRightView(TreeNode root) {
        ArrayList<Integer> rightView = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();

        if(root == null) {
            return rightView;
        }
        queue.add(root);

        while(!queue.isEmpty()) {
            int size = queue.size();

            for(int i = 0; i < size; i++) {
                TreeNode curr = queue.poll();
                if(i == size - 1) {
                    rightView.add(curr.val);
                }

                if(curr.left != null) {
                    queue.offer(curr.left);
                }
                if(curr.right != null) {
                    queue.offer(curr.right);
                }
            }
        }
        return rightView;
    }
}

