package org.home.Thread;

public class GrilCard implements Runnable {
    public Card card;

    public GrilCard() {
    }

    public Card getCard() {
        return card;
    }

    public void setCard(Card card) {
        this.card = card;
    }

    public GrilCard(Card card) {
        this.card = card;
    }

    @Override
    public void run() {
        // Card card=new Card(20000);
        synchronized (card) {
            while (card.getMoney() > 0) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                card.setMoney(card.getMoney() - 200);
                System.out.println("妹子先消费一手" + card.getMoney());
                System.out.println(Thread.currentThread().getName());
            }
        }
    }
}
