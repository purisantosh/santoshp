package com.java.week2;

public class Fibonacci
    {
        public static void main(String[] args)
        {
            int a=0, b=1, count=10,c;
            System.out.print(a+"  "+b);
            for(int i=2;i<count;++i)
            {
                c=a+b;
                System.out.print(" "+c);
                a=b;
                b=c;

            }
        }
    }

