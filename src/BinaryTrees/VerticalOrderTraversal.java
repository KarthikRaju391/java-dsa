package BinaryTrees;
import java.util.*;

// Data structure to store the node, vertical level and the horizontal level
class Tuple {
    TreeNode node;
    int row;
    int col;
    public Tuple(TreeNode node, int col) {
        this.node = node;
        this.col = col;
    }
    public Tuple(TreeNode node, int row, int col) {
        this.node = node;
        this.row = row;
        this.col = col;
    }
}

public class VerticalOrderTraversal {
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

//        System.out.println(getVerticalOrderTraversal(root));
//        System.out.println(getTopView(root));
        System.out.println(getBottomView(root));
    }

    static List<Integer> getBottomView(TreeNode root) {
        TreeMap<Integer, Integer> map = new TreeMap<>();
        Queue<Tuple> q = new LinkedList<>();
        q.offer(new Tuple(root, 0));

        while(!q.isEmpty()) {
            Tuple t = q.poll();
            TreeNode node = t.node;
            int y = t.col;

            map.put(y, node.val);

            if(node.left != null) {
                q.offer(new Tuple(node.left, y - 1));
            }
            if(node.right != null) {
                q.offer(new Tuple(node.right, y + 1));
            }
        }

        System.out.println(map);
        return new ArrayList<>(map.values());
    }
    static List<Integer> getTopView(TreeNode root) {
        // we just need the vertical level of the nodes
        // use a TreeMap where the key is the level and the value is the node value
        TreeMap<Integer, Integer> map = new TreeMap<>();
        // use a Queue which contains a pair of vertical level and the node
        Queue<Tuple> q = new LinkedList<>();

        q.offer(new Tuple(root, 0));

        while(!q.isEmpty()) {
            Tuple t = q.poll();
            TreeNode node = t.node;
            int y = t.col;

            if(!map.containsKey(y)) {
                map.put(y, node.val);
            }

            if(node.left != null) {
                q.offer(new Tuple(node.left, y - 1));
            }
            if(node.right != null) {
                q.offer(new Tuple(node.right, y + 1));
            }
        }

        return new ArrayList<>(map.values());
    }
    // we still use level order traversal
    static List<List<Integer>> getVerticalOrderTraversal(TreeNode root) {
        // create a Queue such that it stores the node, vertical level and the horizontal level
            // Create a data structure to store the node, vertical level and the horizontal level
        Queue<Tuple> q = new LinkedList<>();
        // create a TreeMap to where the key is the horizontal level and the value is:
            // another TreeMap with the key as vertical level and the value as a Priority Queue
            // we need a priority queue because we want to maintain ascending order while adding the nodes of the same
            // vertical level
        TreeMap<Integer, TreeMap<Integer, PriorityQueue<Integer>>> map = new TreeMap<>();

        // Add the root node to the Queue
        q.offer(new Tuple(root, 0, 0));
        while(!q.isEmpty()) {
            Tuple t = q.poll();
            TreeNode node = t.node;
            int x = t.row;
            int y = t.col;

            if(!map.containsKey(x)) {
                map.put(x, new TreeMap<>());
            }
            if(!map.get(x).containsKey(y)) {
                map.get(x).put(y, new PriorityQueue<>());
            }
            map.get(x).get(y).offer(node.val);

            // now check if the popped node has child nodes
            if(node.left != null) {
                q.offer(new Tuple(node.left, x - 1, y + 1));
            }
            if (node.right != null) {
                q.offer(new Tuple(node.right, x + 1, y + 1));
            }
        }
        // create a new List<List>> to store the final result
        List<List<Integer>> list = new ArrayList<>();
        for(TreeMap<Integer, PriorityQueue<Integer>> submap : map.values()) {
            list.add(new ArrayList<>());
            for(PriorityQueue<Integer> pq: submap.values()) {
                while(!pq.isEmpty()) {
//                    System.out.println(pq.peek());
                    list.get(list.size() - 1).add(pq.poll());
                }
            }
        }
        return list;
    }
}
