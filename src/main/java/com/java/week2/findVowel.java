package com.java.week2;

public class findVowel {
    public static void main(String[] args)
    {
        int count=0;
        String vowels="aeiouAEIOUwdc";
        for(int i=0;i< vowels.length(); i++)
        {
            char c= vowels.charAt(i);
            if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u' ||c=='A' || c=='E' || c=='I' || c=='O' || c=='U')
            {
                count++;
            }
        }
        System.out.print(count);

    }
}
