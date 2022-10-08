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
    public void insertFirst(int value) {
        Node node = new Node(value);
        node.next = head;
        head = node;

        if(tail == null) {
            tail = head;
        }

        size += 1;
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
