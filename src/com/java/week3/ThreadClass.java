package com.java.week3;
class myThread extends Thread
{
    public void run()
    {
        for(int i=1;i<=10;i++)
        {
            System.out.println(i);
        }
    }
}
public class ThreadClass {
    public static void main(String[] args)
    {
        myThread t = new myThread();
        t.start();
    }
}
