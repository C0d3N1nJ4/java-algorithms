package com.example.javaalgorithms.linkedlists.deletebackoflist;

public class CustomLinkedList {

    Node head;

    public void displayContentsOfList() {
        Node currentNode = head;
        while(currentNode != null) {
            System.out.print(currentNode.data + "->");
            currentNode = currentNode.next;
        }
    }

    public void deleteBackHalf() {

        if (head == null || head.next == null) {
            head = null;
        }
        Node fast = head;
        Node slow = head;
        Node prev = null;
        while(fast != null && fast.next != null) {
            fast = fast.next.next;
            prev = slow;
            slow = slow.next;
        }
        prev.next = null;
    }
}
