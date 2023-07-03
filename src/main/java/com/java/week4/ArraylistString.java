package com.java.week4;
import java.util.ArrayList;
import java.util.*;
import java.util.stream.*;
public class ArraylistString {
    public static void main(String[] args)
    {
        ArrayList<String> Al=new ArrayList<>();
        Al.add("Santosh");
        Al.add("Kumar");
        Al.add("Puri");
        System.out.println("Print Array List values : "+Al);

        System.out.println("Print all Array List Using for loop : ");
        for(int i=0;i< Al.size(); i++)
        {
            System.out.print(Al.get(i)+", ");
        }
        System.out.println();
        System.out.println("Print all Array List Using enhanced for loop : ");
        for (String string:Al)
        {
            System.out.print(string+", ");
        }
        System.out.println();
        System.out.println("Print all Array List Using iterator : ");

        ListIterator<String> iterate = Al.listIterator();
        System.out.println("Iterating over ArrayList:");
        while(iterate.hasNext()) {
            System.out.print(iterate.next() + ", ");
        }

        System.out.println();
        System.out.println("Print all Array List Using forEach : ");
        Al.forEach(s -> System.out.print(s+" "));

        System.out.println();
        System.out.println("Print all Array List Using parallel Stream : ");

        Al.parallelStream().forEach(s -> System.out.print(s+" "));

    }
}
