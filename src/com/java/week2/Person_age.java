package com.java.week2;
import java.util.*;
public class Person_age {
    public static void main(String[] args)
    {
        System.out.print("Enter person age");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n>=13 && n<=19)
        {
            System.out.print("The person is teen age");
        }
        else if (n<13)
        {
            System.out.print("The Person is kid");
        }
        else
        {
            System.out.print("The person is adult");
        }
    }

}
