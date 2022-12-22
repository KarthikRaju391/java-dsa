package arrays.advanced;

import java.util.Collections;
import java.util.PriorityQueue;

public class KthLargestAndSmallest {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5, 6};
        int k = 2;
        System.out.println(findKthSmallest(arr, k));
        System.out.println(findKthLargest(arr, k));
    }

    static int findKthSmallest(int[] arr, int k) {
        PriorityQueue<Integer> q = new PriorityQueue<>(Collections.reverseOrder());
        for(int i = 0; i < arr.length; i++) {
            q.add(arr[i]);
            if(q.size() > k) {
                q.poll();
            }
        }
        return q.peek();
    }

    static int findKthLargest(int[] arr, int k) {
        PriorityQueue<Integer> q1 = new PriorityQueue<>();
        for (int i = 0; i < arr.length; i++) {
           q1.add(arr[i]);
           if(q1.size() > k) {
               q1.poll();
           }
        }
        return q1.peek();
    }
}
