package com.java.week4;
import java.util.ArrayList;
import java.util.Arrays;

public class ArrayList2Array {
    public static void main(String[] args)
    {
        ArrayList<String> a=new ArrayList<>();
        a.add("Sai");
        a.add("Nath");
        a.add("Santosh");
        a.add("Kumar");
       System.out.println("Original Array list");
       System.out.println(a+" ");
        System.out.println("Converted the Array list into Array");
        String[] array=a.toArray(new String[a.size()]);
        System.out.println(Arrays.toString(array));




    }
}
