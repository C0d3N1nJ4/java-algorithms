package com.example.javaalgorithms.strings;

public class ConcatenateStrings {

    public static void main(String[] args) {

        //Concatenate strings
        String string1 = "Hello";
        String string2 = "World";
        String string3 = string1 + " " + string2;
        System.out.println(string3);

        //Concatenate strings using concat method
        String concatName = string1.concat(" ").concat(string2);
        System.out.println("CONCAT METHOD: " + concatName);

        //Concatenate strings using StringBuilder
        StringBuilder stringBuilder = new StringBuilder("STRING BUILDER: ");
        stringBuilder.append("A new string builder").append(" ").append("Another string builder");
        System.out.println(stringBuilder.toString());

        //Concatenate strings using StringBuffer
        StringBuffer stringBuffer = new StringBuffer("STRING BUFFER: ");
        stringBuffer.append("Testing append on string buffer").append(" ").append("with another string buffer");
        System.out.println(stringBuffer.toString());


    }
}
