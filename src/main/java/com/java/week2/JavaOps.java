package com.java.week2;
import java.util.*;
import java.math.*;
public class JavaOps
{

    public static void main(String[] args)
    {
        int rem=0,reverse=0;
        int x=12345;
        while(x!=0)
        {
            rem=x%10;
            reverse=reverse*10+rem;
            x=x/10;
            System.out.println(reverse);
        }
        System.out.println(reverse);
    }
}
