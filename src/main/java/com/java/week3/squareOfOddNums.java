package com.java.week3;

import java.util.OptionalDouble;
import java.util.stream.IntStream;

public class squareOfOddNums {
    public static void main(String[] args) {
        int[] strArray =new int[]{1,2,3,4,5,6,7,8,9,10};
        OptionalDouble avg= IntStream.of(strArray)
                 .filter(num -> num % 2 != 0)
                 .map(num -> num * num).average();
        System.out.println(avg);
    }
}
