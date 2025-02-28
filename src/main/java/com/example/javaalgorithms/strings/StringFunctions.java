package com.example.javaalgorithms.strings;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StringFunctions {

    public static void main(String[] args) {
        String text = "Humpty Dumpty sat on a wall, Humpty Dumpty had a great fall. All the king’s horses and all the king’s men, Could not put Humpty together again.";

        // Find the number of sentences
        long sentenceCount = text.split("\\. ").length;
        System.out.println("The number of sentences: " + sentenceCount);

        //Find the number of words
        List<String> words = Arrays.stream(text.split("[\\s\\.]+")) // Split on spaces or periods
                .map(word -> word.replaceAll(",$", "")) // Remove trailing commas
                .filter(word -> !word.isEmpty())
                .collect(Collectors.toList());

        System.out.println("The number of words: " + words.size());
        System.out.println(words);
    }
}