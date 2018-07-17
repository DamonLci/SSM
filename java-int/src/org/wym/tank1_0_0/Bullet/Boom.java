package org.wym.tank1_0_0.Bullet;

import org.wym.tank1_0_0.Character.Character;
import org.wym.tank1_0_0.Jframe.Jpanel;
import org.wym.tank1_0_0.Jframe.Map;

import javax.imageio.ImageIO;
import java.awt.*;

public class Boom extends Character implements Runnable{
    private int ImgIndex=0;
    private boolean BoomIsLive=true;

    public Boom(int x, int y) {
        this.x = x;
        this.y = y;
        this.ImgIndex = 0;
        this.BoomIsLive = true;
        new Thread(this).start();
    }

    public boolean isBoomIsLive() {
        return BoomIsLive;
    }

    public void setBoomIsLive(boolean boomIsLive) {
        BoomIsLive = boomIsLive;
    }
    //画出爆炸效果
    public void drawBoom(Graphics g, Image img, Jpanel jp ){
        g.drawImage(img,x * Map.CELL, y * Map.CELL, (x + 1) * Map.CELL, (y + 1) * Map.CELL,ImgIndex*192,0,(ImgIndex+1)*192,192,jp);
    }

    @Override
    public void run() {
        while(BoomIsLive){
            if(ImgIndex<9){
                ImgIndex++;
                //System.out.println(ImgIndex);
            }else{
                ImgIndex=0;
                BoomIsLive=false;
            }
            try{
                Thread.sleep(100);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }

    }
}
