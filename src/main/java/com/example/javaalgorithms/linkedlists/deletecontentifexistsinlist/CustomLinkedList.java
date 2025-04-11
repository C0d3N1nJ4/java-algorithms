package com.example.javaalgorithms.linkedlists.deletecontentifexistsinlist;

public class CustomLinkedList {

  Node head;

  public void displayContentsOfList() {
    Node currentNode = head;
    while (currentNode != null) {
      System.out.print(currentNode.data + "->");
      currentNode = currentNode.next;
    }
  }

  /*This code is a method named deleteContentIfExistsInList that takes an integer data as an argument.
  The method is used to delete a node from a linked list if the node’s data is equal to the input data.

  The method starts by initializing two variables: currentNode and prev. currentNode is set to the head of the linked list and prev is set to null.
  The method then enters a while loop that continues until currentNode is null.

  Inside the loop, the method checks if the data of the current node is equal to the input data.
  If it is, the method checks if prev is null. If prev is null, it means that the current node is the head of the linked list.
  In this case, the head of the linked list is set to the next node.
  If prev is not null, it means that the current node is not the head of the linked list. In this case, the next node of prev is set to the next node of the current node.

          After this check, prev is set to the current node and currentNode is set to its next node. This moves both pointers one step forward in the linked list.

  This process continues until all nodes in the linked list have been checked. If a node with data equal to the input data was found, it would have been removed from the linked list.*/
  public void deleteContentIfExistsInList(int data) {
    Node currentNode = head;
    Node prev = null;
    while (currentNode != null) {
      if (currentNode.data == data) {
        if (prev == null) {
          head = currentNode.next;
        } else {
          prev.next = currentNode.next;
        }
      }
      prev = currentNode;
      currentNode = currentNode.next;
    }
  }
}
