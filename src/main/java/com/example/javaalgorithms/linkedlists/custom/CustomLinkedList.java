package com.example.javaalgorithms.linkedlists.custom;

public class CustomLinkedList {

    Node head;

    public void displayContentsOfList() {
        Node currentNode = head;
        while(currentNode != null) {
            System.out.print(currentNode.data + "->");
            currentNode = currentNode.next;
        }
    }

}


