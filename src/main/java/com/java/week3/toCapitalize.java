package com.java.week3;

import java.util.Arrays;

public class toCapitalize {
    public static void main(String[] args)
    {
        //String[] strings={"santosh","sai"."kumar","ravi""};
        String[] strArray = { "Red", "green", "Blue", "Yellow", "violet", "magenta", "pURPLE" };

        String[] capitalString=Arrays.stream(strArray).map(s->s.substring(0,1).toUpperCase()+s.substring(1)).toArray(String[]::new);

        Arrays.sort(capitalString);

        for (String string:capitalString){
            System.out.println(string);
        }
    }
}