package com.java.week2;

public class reverseofarray {
public static void main(String[] args)
{
    int a[]={5,6,8,1,9,7,20};

    int n=a.length;
    for (int i=n-1 ;i>=0; i--)
    {
        System.out.print(a[i]+ " ");
    }
}
}
