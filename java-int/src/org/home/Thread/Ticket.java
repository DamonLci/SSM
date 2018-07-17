package org.home.Thread;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Ticket {
    public int tickets;
    private Object ob=new Object();
    private final ReentrantLock lock = new ReentrantLock();

    public Ticket(int tickets) {
        this.tickets = tickets;
    }

    public boolean soldTicket(String window){
//        synchronized (ob){


        boolean re=false;
        lock.lock();
        int random=(int)(Math.random()*10);
            if(tickets>0 && random <tickets){

                tickets=tickets-random;
                System.out.println(window+"窗口卖了"+random+"张，还剩"+tickets);
                lock.unlock();
                re=true;
                return re;

            }else{
                System.out.println("票卖完了");
                lock.unlock();
                re=false;
                return re;
            }



    }

//    }
}
