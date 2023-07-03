package com.java.week3;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

import java.util.ArrayList;
import java.util.List;
class User
{
    int tickets = 100;
    public synchronized void getTickets() {
        if (tickets > 0) {
            tickets--;
            System.out.println(tickets + " " + Thread.currentThread().getName());
            try {
                notifyAll();
                wait(2000);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
        else
        {
            return;
        }
    }
}

public class TicketBooking {
    public static void main(String[] args) {
        List<Thread> threads = new ArrayList<>();
        User usr = new User();

        for (int i = 0; i < 5; i++) {
            threads.add(new Thread()
            {
                @Override
                public void run()
                {
                    while(usr.tickets>0)
                    {
                        usr.getTickets();
                    }
                }
            });
        }
        for(Thread t:threads)
        {
            t.start();
        }
    }
}