package SinglyLinkedList;

public class SinglyLinkedList1 {
    // Node class definition should be included within the SinglyLinkedList1 class

    public Node head;
    public Node tail;
    int size;

    // Create a singly linked list with a single node
    public Node createSinglyLinkedList(int nodeValue) {
        Node node = new Node();
        node.value = nodeValue;
        node.next = null;
        head = node;
        tail = node;
        size = 1;
        return head;
    }

    // Insert a node into the singly linked list at a specific location
    public void insertInLinkedList(int nodeValue, int location) {
        Node node = new Node();
        node.value = nodeValue;
        if (head == null) {
            createSinglyLinkedList(nodeValue);
            return;
        } else if (location == 0) {
            node.next = head;
            head = node;
        } else if (location >= size) {
            node.next = null;
            tail.next = node;
            tail = node;
        } else {
            Node tempNode = head;
            int index = 0;
            while (index < location - 1) {
                tempNode = tempNode.next;
                index++;
            }
            Node nextNode = tempNode.next;
            tempNode.next = node;
            node.next = nextNode;
        }
        size++;
    }

    // Traverse the singly linked list and print the values
    public void traverseSinglyLinkedList() {
        if (head == null) {
            System.out.println("Singly Linked List not found");
            return;
        }
        Node tempNode = head;
        while (tempNode != null) {
            System.out.print(tempNode.value);
            if (tempNode.next != null) {
                System.out.print(" -> ");
            }
            tempNode = tempNode.next;
        }
        System.out.println();
    }

    // Delete a node from the singly linked list at a specific location
    public void deleteLinkedList(int location) {
        if (head == null) {
            System.out.println("Singly Linked List does not exist");
            return;
        } else if (location == 0) {
            head = head.next;
            size--;
            if (size == 0) {
                tail = null;
            }
        } else if (location >= size) {
            Node tempNode = head;
            for (int i = 0; i < size - 1; i++) {
                tempNode = tempNode.next;
            }
            if (tempNode == head) {
                head = null;
                tail = null;
                size--;
                return;
            }
            tempNode.next = null;
            tail = tempNode;
            size--;
        } else {
            Node tempNode = head;
            for (int i = 0; i < location - 1; i++) {
                tempNode = tempNode.next;
            }
            tempNode.next = tempNode.next.next;
            size--;
        }
    }

    // Delete the entire singly linked list
    public void deleteSinglyLinkedList() {
        head = null;
        tail = null;
        size = 0; // Reset the size to 0
        System.out.println("Deleted successfully");
    }
}
