package BinaryTrees;

import java.util.*;

public class BinaryTree {
    TreeNode root;

    public void traverseTree(TreeNode node) {
        if(node != null) {
            traverseTree(node.left);
            System.out.println(node.val);
            traverseTree(node.right);
        }
    }

    public static void main(String[] args) {

        BinaryTree tree = new BinaryTree();
        tree.root = new TreeNode(1);
        tree.root.left = new TreeNode(2);
        tree.root.right = new TreeNode(3);
        tree.root.left.left = new TreeNode(4);
        tree.root.left.right = new TreeNode(5);
        tree.root.left.right.left = new TreeNode(6);
        tree.root.right.left = new TreeNode(7);
        tree.root.right.right = new TreeNode(8);
        tree.root.right.right.left = new TreeNode(9);
        tree.root.right.right.right = new TreeNode(10);

//        tree.traverseTree(tree.root);
//        System.out.println(levelOrder(tree.root));
//        System.out.println(preOrderIterative(tree.root));
        MaxDepth md = new MaxDepth();
//        System.out.println(md.findMaxDepth(tree.root));
        int[] diameter = new int[1];
        md.getDiameter(tree.root, diameter);
        System.out.println(diameter[0]);
//        System.out.println(inorderIterative(tree.root));

    }

    static List<Integer> inorderIterative(TreeNode root) {
        List<Integer> inorder = new ArrayList<>();
        Stack<TreeNode> st = new Stack<>();
        TreeNode node = root;
        while(true) {
            if(node != null) {
                st.push(node);
                node = node.left;
            }
            else {
                if(st.isEmpty()) {
                    break;
                }
                node = st.pop();
            inorder.add(node.val);
                node = node.right;
            }
        }
        return inorder;
    }
    static List<Integer> preOrderIterative(TreeNode root) {
        List<Integer> preorder = new ArrayList<>();
        Stack<TreeNode> st = new Stack<>();
        st.push(root);
        while(!st.isEmpty()) {
            TreeNode popped = st.pop();
            preorder.add(popped.val);
            if(popped.right != null) {
                st.push(popped.right);
            }
            if(popped.left != null) {
                st.push(popped.left);
            }
        }
        return preorder;
    }


    static List<Integer> postorderIterative(TreeNode root) {
        List<Integer> postorder = new ArrayList<>();
        Stack<TreeNode> st1 = new Stack<>();
        Stack<TreeNode> st2 = new Stack<>();

        if(root == null) return postorder;
        st1.push(root);
        while(!st1.isEmpty()) {
            root = st1.pop();
            st2.add(root);
            if(root.left != null) st1.push(root.left);
            if(root.right != null) st1.push(root.right);
        }
        while(!st2.isEmpty()) {
            postorder.add(st2.pop().val);
        }
        return postorder;
    }

    static List<Integer> postorderSingle(TreeNode root) {
        List<Integer> postorder = new ArrayList<>();
        Stack<TreeNode> st = new Stack<>();
        TreeNode curr = root;
        while (curr != null || !st.isEmpty()) {
            if(curr != null) {
                st.push(curr);
                curr = curr.left;
            } else {
                TreeNode temp = st.peek().right;
                if(temp == null) {
                    temp = st.peek();
                    st.pop();
                    postorder.add(temp.val);
                    while(!st.isEmpty() && temp == st.peek().right) {
                        temp = st.peek();
                        st.pop();
                        postorder.add(temp.val);
                    }
                }
                else {
                    curr = temp;
                }
            }
        }
        return postorder;
    }


    static List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        List<List<Integer>> wrapList = new LinkedList<>();
        if(root == null) {
            return wrapList;
        }
        queue.offer(root);
        while(!queue.isEmpty()) {
            List<Integer> subList = new LinkedList<>();
            int size = queue.size();

            for(int i = 0; i < size; i++) {
                if(queue.peek().left != null) queue.offer(queue.peek().left);
                if(queue.peek().right != null) queue.offer(queue.peek().right);

                subList.add(queue.poll().val);
            }
            wrapList.add(subList);
        }
        return wrapList;
    }
}

