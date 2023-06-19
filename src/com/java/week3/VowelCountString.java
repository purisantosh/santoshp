package com.java.week3;

import java.util.Arrays;
import java.util.stream.Stream;

public class VowelCountString {
    public static void main(String[] args) {
        String[] strArray = {"Red", "green", "Blue", "Yellow", "violet", "magenta", "pURPLE" };

        Stream.of(strArray).map(s->s.toLowerCase()).
                filter(s->s.matches(".*[aeiou].*")).
                forEach(s->{
                    System.out.print(s+" ");
                    int count = 0;
                    String vowels="aeiou";
                    for(int i=0;i<s.length();i++)
                    {
                        if(vowels.indexOf(s.charAt(i))!=-1)
                        {
                            count+=1;
                        }
                    }
                    System.out.println(count);
                });}
}
