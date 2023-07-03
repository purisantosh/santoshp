package com.java.week1;

public class stvar {
    static int Stavar;
    static
    {
        Stavar = a();
    }
    static int a()
    {
        return 55;
    }
    static int getStaticvar( )
    {
        return Stavar;
    }
    public static void main(String[] args)
    {
        int val= stvar.getStaticvar();
        System.out.println("Static value " +val);
    }
}
