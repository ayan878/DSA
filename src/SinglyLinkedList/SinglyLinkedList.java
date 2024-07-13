//package SinglyLinkedList;
//
//public class SinglyLinkedList {
//
//    // Node class
//    class Node {
//        int value;
//        Node next;
//    }
//
//    // Head, tail, and size of the linked list
//    public Node head;
//    public Node tail;
//    public int size;
//
//    // Create a singly linked list
//    public Node createSinglyLinkedList(int nodeValue) {
//        head = new Node();
//        Node node = new Node();
//        node.next = null;
//        node.value = nodeValue;
//        head = node;
//        tail = node;
//        size = 1;
//        return head;
//    }
//
//    // Insert a node in the singly linked list
//    public void insertInLinkedList(int nodeValue, int location) {
//        Node node = new Node();
//        node.value = nodeValue;
//        if (head == null) {
//            createSinglyLinkedList(nodeValue);
//            return;
//        } else if (location == 0) {
//            node.next = head;
//            head = node;
//        } else if (location >= size) {
//            node.next = null;
//            tail.next = node;
//            tail = node;
//        } else {
//            Node tempNode = head;
//            int index = 0;
//            while (index < location - 1) {
//                tempNode = tempNode.next;
//                index++;
//            }
//            Node nextNode = tempNode.next;
//            tempNode.next = node;
//            node.next = nextNode;
//        }
//        size++;
//    }
//
//    // Traverse the singly linked list
//    public void traverseSinglyLinkedList() {
//        if (head == null) {
//            System.out.println("Singly Linked List not found");
//        } else {
//            Node tempNode = head;
//            for (int i = 0; i < size; i++) {
//                System.out.print(tempNode.value);
//                if (i != size - 1) {
//                    System.out.print(" -> ");
//                }
//                tempNode = tempNode.next;
//            }
//            System.out.println();
//        }
//    }
//
//    // Search for a node in the singly linked list
//    public boolean searchNode(int nodeValue) {
//        if (head != null) {
//            Node tempNode = head;
//            for (int i = 0; i < size; i++) {
//                if (tempNode.value == nodeValue) {
//                    System.out.println("Found the node at location " + i + "\n");
//                    return true;
//                }
//                tempNode = tempNode.next;
//            }
//        }
//        return false;
//    }
//    public Node deleteSinglyLinkedList(int nodeValue){
//        Node node=new Node();
//        if(head==null || tail==null){
//            head.next=null;
//            tail.next=null;
//        }
//    }
//}
