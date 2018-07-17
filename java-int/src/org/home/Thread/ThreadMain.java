package org.home.Thread;

public class ThreadMain {
    public static void main(String[] args) {
        /*ThreadA ta=new ThreadA();
        //就绪
        ta.start();
        ta.run();*/
        ThreadB b=new ThreadB();
        Thread thread=new Thread(b);
        thread.start();


        //运行
        int i=0;
        while( i<100){
            i++;
            System.out.println(Thread.currentThread().getName()+"1");
            try{
                Thread.sleep(500);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }


}

