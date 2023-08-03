package com.example.javaalgorithms.treealgorithms;

public class TestRecursiveTreeAlgorithm {

    public static void main(String[] args) {
        Node root = new Node();
        root.data = 5;

        BinarySearchTree tree = new BinarySearchTree();
        tree.root = root;

        tree.insert(3);
        tree.insert(7);
        tree.insert(2);
        tree.insert(4);
        tree.insert(6);

    }
}
