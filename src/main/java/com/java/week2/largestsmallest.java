package com.java.week2;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.net.SocketOption;

public class largestsmallest {
    public static void main(String[] args)
    {
        int a[]={100,5,99,66,3,1},temp;
        int size=a.length;
        for(int i=0;i<size;i++)
        {
            for(int j=i+1;j<size;j++)
            {
                if(a[i]>a[j])
                {
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
        System.out.println("Largest Number "+a[size-1]);
        System.out.println("Smallest Number "+a[0]);



    }
}
