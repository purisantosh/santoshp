package com.java.week3;
import java.util.Scanner;
public class Convstringtointeger {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        try {
            int a = convertToInt(s);
            System.out.println("Integer value of "+ s + " : " +a);
        }catch (Exception e){
            System.out.println(e.toString());

        }
    }

    public static int convertToInt(String s){
        return Integer.parseInt(s);
    }
}