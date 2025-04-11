package com.example.javaalgorithms.hashmaps;

import com.example.javaalgorithms.linkedlists.custom.CustomLinkedList;
import java.util.HashSet;

public class DetectCyclicLinkedList {

  static Node head;

  public static void main(String[] args) {
    CustomLinkedList list = new CustomLinkedList();
    Node node1 = new Node(1);
    Node node2 = new Node(2);
    Node node3 = new Node(3);
    Node node1Duplicate = new Node(1);
  }

  public static boolean hasCycle() {
    HashSet<Node> map = new HashSet<>();
    Node current = head;
    while (current != null) {
      if (map.contains(current)) {
        return true;
      }
      map.add(current);
      current = current.next;
    }
    return false;
  }
}
