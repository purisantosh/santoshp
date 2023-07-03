package com.java.week3;
class A
{
    public  void d1(B b) {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
        }
        System.out.println("Thread1 trying to call B's last() method");
        b.last();
    }
        public  void last()
        {
            System.out.println("Inside A,this is last() method");
        }
    }


class B
{
    public  void d2(A a) {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
        }
        System.out.println("Thread2 trying to call A's last() method");
        a.last();
    }
        public void last()
        {
            System.out.println("Inside B,this is last() method");
        }
    }


class Deadlock extends Thread{
    A a=new A();
    B b=new B();
    public void m1()
    {
        this.start();
        a.d1(b);
    }
    public void run()
    {
        b.d2(a);
    }
    public static void main(String[] args)
    {
        Deadlock d=new Deadlock();
        d.m1();
    }
}
