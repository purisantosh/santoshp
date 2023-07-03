package com.java.week1;

final class Finalvar {
    final int a=200;
    final void accessed(){
        System.out.println(a);
    }
    public static void main(String[] args)
    {
        Finalvar obj=new Finalvar();
        obj.accessed();
    }

}
