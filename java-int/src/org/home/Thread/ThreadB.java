package org.home.Thread;

public class ThreadB implements Runnable {


    @Override
    public void run() {
        int i = 0;
        while (i < 10) {
            i++;
            System.out.println(Thread.currentThread().getName() + "B");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
