package com.java.week4;
import java.util.ArrayList;
public class RemovelastObject {
    public static void main(String[] args)
    {
        ArrayList<String> abc=new ArrayList<>();
        abc.add("Santosh");
        abc.add("Kumar");
        abc.add("Puri");

        System.out.println("Original Array : "+abc);


        if(!abc.isEmpty()){
            abc.remove(abc.size()-1);
            System.out.println("last object is removed");
        }


        else
        {
            System.out.println("The array is empty");
        }
        System.out.println(abc);

    }
}
