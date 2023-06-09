package com.example.javaalgorithms.linkedlists.custom;

public class Algorithm {

    public static void main(String[] args) {
        CustomLinkedList list = new CustomLinkedList();

        Node firstNode = new Node(1);
        Node secondNode = new Node(2);
        Node thirdNode = new Node(3);
        Node fourthNode = new Node(4);

        list.head = firstNode;
        firstNode.next = secondNode;
        secondNode.next = thirdNode;
        thirdNode.next = fourthNode;

        list.displayContentsOfList();

    }
}
