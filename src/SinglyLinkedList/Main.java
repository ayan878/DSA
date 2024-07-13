package SinglyLinkedList;

public class Main {
    public static void main(String[] args) {
        SinglyLinkedList1 sll = new SinglyLinkedList1();
        sll.createSinglyLinkedList(6);
        System.out.println("Head value after creation: " + sll.head.value);

        sll.insertInLinkedList(7, 1);
        sll.insertInLinkedList(8, 0);
        sll.insertInLinkedList(9, 2);


        System.out.println("Head value after insertion: " + sll.head.value);
        System.out.println("Second node value: " + sll.head.next.value);

        sll.traverseSinglyLinkedList();
        sll.deleteLinkedList(2);
        sll.traverseSinglyLinkedList();
        sll.deleteSinglyLinkedList();
        sll.traverseSinglyLinkedList();
//        sll.searchNode(7);


    }
}
