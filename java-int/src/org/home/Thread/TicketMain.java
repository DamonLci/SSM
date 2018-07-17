package org.home.Thread;

public class TicketMain {
    public static void main(String[] args) {
        Ticket ticket=new Ticket(100);
        new Thread(new TicketRun("A",ticket)).start();
        new Thread(new TicketRun("B",ticket)).start();
        new Thread(new TicketRun("C",ticket)).start();
        new Thread(new TicketRun("D",ticket)).start();


    }
}
