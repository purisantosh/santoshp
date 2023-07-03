package com.java.week3;
class myRunnable implements Runnable
{
    public void run()
    {
        for(int i=1;i<=10;i++)
        {
            System.out.println(i);
        }
    }
}
public class runnableInterface {
    public static void main(String[] args)
    {
        myRunnable r=new myRunnable();
        Thread t=new Thread(r);
        t.start();
    }

}

