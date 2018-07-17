package org.wym.tank1_0_0.Bullet;

import org.wym.tank1_0_0.Character.Character;
import org.wym.tank1_0_0.Jframe.Jpanel;
import org.wym.tank1_0_0.Jframe.Map;
import org.wym.tank1_0_0.Jframe.Player;

import java.awt.*;

public class Bullet extends Character implements Runnable {
    private int direction;
    public boolean isLive = true;
    private int imgIndex;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public Bullet() {
    }

    public boolean isLive() {
        return isLive;
    }

    public void setLive(boolean live) {
        isLive = live;
    }

    /**
     *
     */

    public Bullet(int x, int y, int direction) {
        this.x = x;
        this.y = y;
        this.direction = direction;
        this.isLive = true;
        this.imgIndex = 0;
       // new Thread(this).start();
    }
    //画子弹的方法

    public void drawBullet(Graphics g, Image img, Image gas, Jpanel jp) {
        switch (direction) {
            case 1:
                g.drawImage(img, x * Map.CELL, y * Map.CELL, (x + 1) * Map.CELL, (y + 1) * Map.CELL, 0, 0, 32, 32, jp);
                break;
            case 0:
                g.drawImage(img, x * Map.CELL, y * Map.CELL, (x + 1) * Map.CELL, (y + 1) * Map.CELL, 32, 0, 64, 32, jp);
                break;
            case 3:
                g.drawImage(img, x * Map.CELL, y * Map.CELL, (x + 1) * Map.CELL, (y + 1) * Map.CELL, 64, 0, 96, 32, jp);
                break;
            case 2:
                g.drawImage(img, x * Map.CELL, y * Map.CELL, (x + 1) * Map.CELL, (y + 1) * Map.CELL, 96, 0, 128, 32, jp);
                break;
            default:
                break;
        }
        //子弹穿过草丛的方法
        drawGrass(g, gas, jp);

    }
    //覆盖画草的方法
   @Override
    public void drawGrass(Graphics g, Image gas, Jpanel jp) {
        if (Map.MAP[y][x] == Map.GAS) {
            g.drawImage(gas, x * Map.CELL - 2, y * Map.CELL - 2, (x + 1) * Map.CELL, (y + 1) * Map.CELL, 0, 0, 87, 83, jp);

        }
    }
    // 子弹撞上其他的东西的方法
    public boolean crash(int x, int y) {

        if (Map.MAP[y][x] == Map.GAS || Map.MAP[y][x] == Map.WATER || Map.MAP[y][x] == Map.DEFALUT) {
            return true;
        } else if (Map.MAP[y][x] == Map.BRICK) {
            Map.MAP[y][x] = Map.DEFALUT;
            Map.boomVector.add(new Boom(x, y));
            isLive = false;
            return false;
        } else if (Map.MAP[y][x] == Map.BOSS) {
            isLive = false;
            Map.boomVector.add(new Boom(x, y));
            Map.boosLive = false;
            //System.out.println("1");
            //System.out.println(isBoosLive());
            return false;
        }
            Map.boomVector.add(new Boom(x, y));
            isLive = false;
            return false;

    }
    // 子弹移动的方法

    public void move() {
        if (direction == 0 && crash(x, y + 1)) {
            y++;
        } else if (direction == 1 && crash(x + 1, y)) {
            x++;
        } else if (direction == 2 && crash(x, y - 1)) {
            y--;
        } else if (direction == 3 && crash(x - 1, y)) {
            x--;
        }
    }

    // 子弹与坦克碰撞
    public void collision() {
        for (int i = 0; i < Map.tanks.size(); i++) {
            Tank tank = Map.tanks.get(i);
            for (int j = 0; j < Map.bullets.size(); j++) {
                if (tank.getX() == Map.bullets.get(j).getX()
                        && tank.getY() == Map.bullets.get(j).getY()) {
                    tank.setIslive(false);
                    this.isLive = false;
                    Map.boomVector.add(new Boom(x, y));
                    break;
                }
            }
        }
        // 敌方子弹击中玩家的方法
        for (int n=0;n<Map.TankBullet.size();n++){
            Bullet bullet=Map.TankBullet.get(n);

            if(bullet.getX()==Jpanel.player.getX()  && bullet.getY() ==Jpanel.player.getY()){
                bullet.isLive=false;
                Map.TankBullet.remove(n);
                Map.boomVector.add(new Boom(Jpanel.player.getX(),Jpanel.player.getY()));
                Jpanel.player=new Player(17,18);
                new Thread(Jpanel.player).start();
            }
        }

    }
    //子弹和子弹碰撞
    public void collisionBullet(){
        for(int i=0;i<Map.TankBullet.size();i++){
            Bullet b=Map.TankBullet.get(i);
            for(int j=0;j<Map.bullets.size();j++){
                if(b.getX()==Map.bullets.get(j).getX() && b.getY()==Map.bullets.get(j).getY()){
                    b.isLive=false;
                    this.isLive=false;

                    Map.boomVector.add(new Boom(x,y));
                    break;
                }
            }
        }
    }
    @Override
    public void run() {

        while (isLive) {
            move();
            collision();
            collisionBullet();
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.getMessage();
            }
            //System.out.println(imgIndex);
        }
    }

}


