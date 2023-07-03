package com.java.week2;

public class Reverseofstring {
    public static void main(String[] args){
        //Scanner scanner = new Scanner(System.in);
        //String Str = scanner.nextLine();
        

        String input="Java J2EE Reverse Me";
        String[] words=input.split(" ");
        String reverse="";
       for(int i=0; i< words.length; i++)
        {
            String word=words[i];
            String reverseword="";
            for(int j= word.length()-1;j>=0;j--)
            {
                reverseword=reverseword+word.charAt(j);
            }
            reverse=reverse+reverseword+" ";

        }
        System.out.print("Reverse of a string "+reverse);
    }
}
