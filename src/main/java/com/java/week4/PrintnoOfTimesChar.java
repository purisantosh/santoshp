package com.java.week4;
import java.util.ArrayList;
import java.util.*;
public class PrintnoOfTimesChar {
    public static void main(String[] args)
    {
        String string="test string";
        printnumbOfTimesShar(string);
    }
    public static void printnumbOfTimesShar(String string)
    {
        Map<Character, Integer> b=new HashMap<>();
        for(int i=0;i<string.length();i++)
        {
            char c=string.charAt(i);
            if(b.containsKey(c))
            {
                b.put(c,b.get(c)+1);
            }
            else
            {
                b.put(c,1);
            }
        }
        for (int i=0;i<string.length();i++)
        {
            char c=string.charAt(i);
            if(b.containsKey(c))
            {
                System.out.print(c+Integer.toString(b.get(c))+" ");
                b.remove(c);
            }
        }
    }
}
