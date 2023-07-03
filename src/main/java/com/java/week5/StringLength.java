package com.java.week5;

import java.util.Optional;

public class StringLength {
    public static void main(String[] args) {
        StringLen stingLen = new StringLen();
        String input = "Santosh Kumar";
        Optional<Integer> len = stingLen.getStringLen(input);
        System.out.println("Length of inout: " + len.orElse(-1));

        String inp = null;
        Optional<Integer> len1 = stingLen.getStringLen(inp);
        System.out.println("Length of inout: " + len1.orElse(-1));

    }}

    class StringLen {
        public Optional<Integer> getStringLen(String input) {
            if (input == null) {
                return Optional.empty();
            } else {
                return Optional.of(input.length());
            }
        }
    }

