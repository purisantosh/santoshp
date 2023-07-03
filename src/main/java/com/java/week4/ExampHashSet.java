package com.java.week4;

import java.util.HashSet;
import java.util.Iterator;

public class ExampHashSet {

    public static void main(String[] args)
    {
        HashSet<String> stringSet=new HashSet<>();
        stringSet.add("Santosh");
        stringSet.add("Kumar");
        stringSet.add("Puri");
        stringSet.add("sai");
        stringSet.add("kiran");
        stringSet.add("Nath");
        stringSet.add("Rohit");
        stringSet.add("pavan");
        stringSet.add("Mohan");
        stringSet.add("Lokesh");

        System.out.println("Iterate HashSet using Iterator: ");
        Iterator<String> iterator=stringSet.iterator();
        while (iterator.hasNext()){
            String a=iterator.next();
            System.out.println(a);
        }

        System.out.println("Iterate using forEach");

        for(String a:stringSet)
        {
            System.out.println(a);
        }

        System.out.println("Iterate using Streams ForEach");

        stringSet.stream().forEach(System.out::println);




    }
}
