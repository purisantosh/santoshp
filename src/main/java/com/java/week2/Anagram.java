package com.java.week2;

import java.util.Arrays;

public class Anagram {
    public static void main(String[] args)
    {
        String a="Santosh";
        String a1="Kumar";
        int count=0;
        if(a.length()!=a1.length())
        {
            System.out.print("Not an Anagram");
        }
        else
        {
            char[] a11=a.toCharArray();
            Arrays.sort(a11);
            char[] a12=a1.toCharArray();
            Arrays.sort(a12);
            boolean flag=true;
            for(int i=0;i<a11.length;i++)
            {
                if(a11[i]!=a12[i])
                {
                    flag=false;
                    break;
                }
            }
            if (flag == false
            ) {

                System.out.print("Not an Anagram");

            }
            else
            {
                System.out.print("Anagram");
            }
        }
    }
}
