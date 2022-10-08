package LinkedList;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LL list = new LL();


        list.insertFirst(2);
        list.insertEnd(5);
        list.insertEnd(4);
        list.insert(3, 1);
        list.insertEnd(12);
        list.deleteEnd();
        list.deleteEnd();
        list.deleteEnd();
        list.deleteEnd();
        list.deleteEnd();
        list.display();
    }
}
