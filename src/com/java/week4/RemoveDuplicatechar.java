package com.java.week4;
import java.util.HashSet;

public class RemoveDuplicatechar {
    public static void main(String[] args)
    {
        String a="Santosh kumar";
        String result=remDup(a);
        System.out.println("Result: "+result);
    }
    public static String remDup(String str)
    {
        HashSet<Character> set=new HashSet<>();
        StringBuilder s=new StringBuilder();
        for(int i=0;i<str.length();i++)
        {
            char c=str.charAt(i);
            if(!set.contains(c))
            {
                set.add(c);
                s.append(c);
            }
        }
        return s.toString();
    }
}
