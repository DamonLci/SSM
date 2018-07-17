package org.home.Thread;

public class ThreadA extends Thread {
    @Override
    public void run() {
        super.run();
        int i=0;
        while(i<10){
            i++;
            System.out.println(Thread.currentThread().getName()+"3");
            try{
                Thread.sleep(500);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
