package com.example.javaalgorithms.linkedlists;

import java.util.LinkedList;

public class LinkedListMethods {

    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");

        System.out.println(list);

        //Add an element to the start of the list
        list.addFirst("Z");

        //Check if the list contains an element
        System.out.println(list.contains("Z"));
        System.out.println(list);

        //Remove the first element from the list
        list.removeFirst();
        System.out.println(list);

        //iterate over the list
        for(String item : list) {
            System.out.print(item + "->");
        }

        //iterate over the list with streams
        list.stream().forEach(System.out::println);

        //iterate over the list with lambdas
        list.forEach(item -> System.out.print(item + "->"));

    }
}



