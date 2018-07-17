import java.util.ArrayList;

public class Love  implements Runnable{

    public static void main(String[] args) {
        Love love=new Love();
        Thread thread=new Thread(love);
        thread.start();
    }
    public void loves(){
        int forever=1111111111;
        for(int i=0;i<forever;i++){
            System.out.println("forever love you 词词 ");
        }
    }

    @Override
    public void run() {
        loves();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
