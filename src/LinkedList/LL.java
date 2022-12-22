package LinkedList;

public class LL {
    private Node head;
    private Node tail;
    private int size;

    public LL() {
       this.size = 0;
    }

    public void insertEnd(int value) {
        Node node = new Node(value);
        if(head == null) {
            head = node;
            return;
        }

        Node curr = head;
        while(curr.next != null) {
            curr = curr.next;
        }
        curr.next = node;
        node.next = null;
        size += 1;
    }

    public void insertLast(int val) {
        if (tail == null) {
            insertFirst(val);
            return;
        }
        Node node = new Node(val);
        tail.next = node;
        tail = node;
        size++;
    }
    public void insertFirst(int value) {
        Node node = new Node(value);
        node.next = head;
        head = node;

        if(tail == null) {
            tail = head;
        }

        size += 1;
    }

    public void insertRec(int val, int index) {
        head = insertRec(val, index, head);
    }

    private Node insertRec (int val, int index, Node node) {
        if(index == 0) {
            Node temp = new Node(val, node);
            size++;
            return temp;
        }

        node.next = insertRec(val, --index, node.next);
        return node;
    }
    public void insert(int value, int index) {

        if(index == 0) {
            insertFirst(value);
            return;
        }
        if(index == size) {
            insertEnd(value);
            return;
        }

        Node temp = head;
        for(int i = 1; i < index; i++) {
            temp = temp.next;
        }
        Node node = new Node(value, temp.next);
        temp.next = node;
        size++;
    }

    public void deleteFirst() {

      int value = head.value;
      head = head.next;
      if(head == null) {
          tail = null;
      }
      System.out.println("Node deleted: " + value);
      size--;
    }

    public void deleteEnd() {
        Node prev = head;
        Node temp = head.next;
        if(temp == null) {
            int val = prev.value;
            System.out.println("Node deleted: " + val);
            head = null;
            tail = null;
            size--;
            return;
        }
        while(temp.next != null) {
            temp = temp.next;
            prev = prev.next;
        }
        int val = temp.value;
        prev.next = null;
        System.out.println("Node deleted: " + val);
        size--;
    }
    public void display() {
        Node curr = head;
        while(curr != null) {
            if(curr.next == null) {
                System.out.print(curr.value);
            } else {
                System.out.print(curr.value + " -> ");
            }
            curr = curr.next;
        }
    }

    public Node get(int index) {
        Node temp = head;
        for(int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp;
    }

    // Questions
    public Node deleteDuplicates(Node head) {
        Node node = head;
        if(node == null) {
            return head;
        }

        while(node.next != null) {
            Node n = node.next;
            if(n.value == node.value) {
                node.next = n.next;
            } else {
                node = node.next;
            }
        }
        return head;
    }

    public boolean cycleDetection(Node head) {
        Node slow = head;
        Node fast = head;

        while(fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;

            if(fast == slow) {
                return true;
            }
        }
        return false;
    }

    public int lengthOfCycle(Node head) {
        Node slow = head;
        Node fast = head;

        while(fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if(slow == fast) {
                Node temp = slow;
                int count = 0;
                do {
                    temp = temp.next;
                    count++;
                } while(temp != slow);
                return count;
            }
        }
        return 0;
    }
    public void bubbleSort(int row, int col) {
        if (row == 0) {
            return;
        }

        if (col < row) {
            Node first = get(col);
            Node second = get(++col);

            if (first.value > second.value) {
                // swap
                if (first == head) {
                    head = second;
                    first.next = second.next;
                    second.next = first;
                } else if (second == tail) {
                    Node prev = get(col - 1);
                    prev.next = second;
                    tail = first;
                    first.next = null;
                    second.next = tail;
                } else {
                    Node prev = get(col - 1);
                    prev.next = second;
                    first.next = second.next;
                    second.next = first;
                }
            }
            bubbleSort(row, col + 1);
        } else {
            bubbleSort(row - 1, 0);
        }
    }

    public void reverseIt() {
        Node prev = null;
        Node curr = head;
        Node next = curr.next;

        while(curr != null) {
            curr.next = prev;
            prev = curr;
            curr = next;
            if(next != null) {
                next = next.next;
            }
        }
        head = prev;
    }

    public void reverse(Node node) {
        if(node == tail) {
            head = tail;
            return;
        }
        reverse(node.next);
        tail.next = node;
        tail = node;
        tail.next = null;
    }
    public static void main(String[] args) {
        LL list = new LL();
        for (int i = 7; i > 0; i--) {
            list.insertLast(i);
        }
        list.reverse(list.head);
        list.display();
    }
    private class Node {
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }
}
