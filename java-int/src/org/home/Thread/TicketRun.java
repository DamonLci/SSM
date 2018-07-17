package org.home.Thread;

public class TicketRun implements Runnable{
    private String window;
    private Ticket ticket;

    public TicketRun(String window, Ticket ticket) {
        this.window = window;
        this.ticket = ticket;
    }

    @Override
    public void run(){
        while(ticket.soldTicket(window)){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }

    }
}
