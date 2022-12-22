package LinkedList;

public class MergeSortLL {
    public ListNode sortList(ListNode head) {
        if(head == null || head.next == null) {
            return head;
        }

        ListNode mid = getMiddle(head);
        ListNode left = sortList(head);
        ListNode right = sortList(mid);

        return merge(left, right);
    }

    // function to get the middle of the linked list
    ListNode getMiddle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;

        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }


    // function to merge the two linked lists
    ListNode merge(ListNode l1, ListNode l2) {
        ListNode left = l1;
        ListNode right = l2;
        ListNode merged = new ListNode();
        ListNode curr = merged;

        while(left != null && right != null) {
            if(left.value <= right.value) {
                curr.next = left;
                left = left.next;
            } else {
                curr.next = right;
                right = right.next;
            }
            curr = curr.next;
        }

        while(left != null) {
            curr.next = left;
            left = left.next;
            curr = curr.next;
        }

        while(right != null) {
            curr.next = right;
            right = right.next;
            curr = curr.next;
        }

        return merged.next;
    }

    private class ListNode {
        private int value;

        private ListNode next;

        public ListNode(int val) {
            this.value = val;
        }

        public ListNode(int val, ListNode next) {
            this.value = val;
            this.next = next;
        }

        public ListNode() {

        }
    }
}

