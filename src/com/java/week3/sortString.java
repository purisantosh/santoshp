package com.java.week3;

import java.util.Arrays;

public class sortString {
    public static void main(String[] args)
    {
        String[] strArray = {"Red", "green", "Blue", "Yellow", "violet", "magenta", "pURPLE" };
        Arrays.sort(strArray,(s1, s2) -> {int len=Integer.compare(s1.length(),s2.length());
        if(len!=0){return len;}
        else {
        return Character.compare(s2.charAt(s2.length() - 1), s1.charAt(s1.length() - 1));
       }
      });

        for(String string:strArray)
        {
            System.out.println(string);
        }
    }
}


//Arrays.sort(strings, (s1, s2) -> {
//        int lengthComparison = Integer.compare(s1.length(), s2.length());
//        if (lengthComparison != 0) {
//        return lengthComparison;
//        } else {
//        return Character.compare(s2.charAt(s2.length() - 1), s1.charAt(s1.length() - 1));
//        }
//        });
//
//        // Print the sorted array
//        for (String string : strings) {
//        System.out.println(string);
//        }