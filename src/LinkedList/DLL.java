package LinkedList;

public class DLL {

    private Node head;
    private int size;
    public void insertFirst(int val) {
        Node node = new Node(val);
        node.next = head;
        if(head != null) {
            head.prev = node;
        }
        head = node;
        size+=1;
    }

    public void insert(int val, int index) {
        if(index == 0) {
            insertFirst(val);
            return;
        }
        if(index == size) {
            insertLast(val);
            return;
        }
        Node temp = head;

        for(int i = 1; i < index; i++) {
            temp = temp.next;
        }
        Node node = new Node(val);
        node.next = temp;
        node.prev = temp.prev;
        temp.prev.next = node;
        temp.prev = node;
        size+=1;
    }
    public void insertLast(int val) {
        Node node = new Node(val);
        Node temp = head;
        if(head == null) {
            head = node;
        } else {
            while(temp.next != null) {
                temp = temp.next;
            }
            temp.next = node;
            node.prev = temp;
        }
        size+=1;
    }

    public void display() {
        Node node = head;
        while(node != null) {
            System.out.print(node.value + " -> ");
            node = node.next;
        }
        System.out.println("END");
    }

    public void displayReverse() {
        Node node = head;
        Node last = null;
        while(node != null) {
            last = node;
            node = node.next;
        }

        while(last != null) {
            System.out.print(last.value + " -> ");
            last = last.prev;
        }
        System.out.println("START");
    }
    private class Node {
        private int value;
        private Node next;
        private Node prev;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node prev, Node next) {
            this.value = value;
            this.prev = prev;
            this.next = next;
        }
    }
}
