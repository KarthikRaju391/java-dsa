package LinkedList;

public class Main {
    public static void main(String[] args) {

        LL list = new LL();
        list.insertLast(1);
        list.insertLast(1);
        list.insertLast(2);
        list.insertLast(1);
        list.display();
        list.reverseIt();
        System.out.println();
        list.display();

    }
}
