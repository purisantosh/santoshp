package com.java.week2;

public class twosStringsRotate {
    public static void main(String[] args)
    {
        String s1="JavaJ2eeStrutsHibernate";
        String s2="StrutsHibernateJavaJ2ee";
        if(s1.length()!=s2.length())
        {
            System.out.println("false");
        }
        else
        {
            String s3=s1 + s2;
            if (s3.contains(s2))
            {
                System.out.print("true");
            }
            else
            {
                System.out.print("false");
            }
        }
    }
}
