package org.home.Thread;

public class CarMain {
    public static void main(String[] args) {
        Card card = new Card(2000);
        GrilCard gc = new GrilCard(card);
        Thread thread = new Thread(gc);
        BoyCard bc = new BoyCard(card);
        Thread thread1 = new Thread(bc);
        thread.start();
        thread1.start();
    }


}
