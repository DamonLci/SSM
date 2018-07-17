package org.home.Thread;

public class BoyCard implements Runnable {
    public Card card;


    public BoyCard(Card card) {
        this.card = card;
    }



    @Override
    public void run() {
        // Card card=new Card(20000);
        //System.out.println(card.getMoney());
    synchronized (card){
        while (card.getMoney() > 0) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            card.setMoney(card.getMoney() - 200);
            System.out.println("卡是我的，我先来" + card.getMoney());
            System.out.println(Thread.currentThread().getName());
        }
    }
    }
}
