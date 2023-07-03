package com.java.week2;

public class rotateposition {
    public static void main(String[] args)
    {
        int [] arr = new int [] {1, 2, 3, 4, 5};
    int a=2;
    int b[]=new int[2];
            int n=arr.length;

        for(int i=0;i<a;i++)
        {
            b[i]=arr[i];
            //System.out.print(b[i]+ " ");
        }
        int k=0;
        for(int i=a;i<n;i++)
        {
            arr[k]=arr[i];
            k++;
            //System.out.print(arr[i]+ " ");
        }
        int c=0;
        for(int i=n-a;i<n;i++)
        {
            arr[i]=b[c];
            c++;


        }
        for(int i=0;i<n;i++) {
            System.out.print(arr[i]+ " ");
        }


    }
}
