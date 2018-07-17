package org.wym.tank1_0_0.Jframe;

import org.wym.tank1_0_0.Bullet.Boom;
import org.wym.tank1_0_0.Bullet.Bullet;

import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Player implements Runnable {
    private int direction = 0;
    private int imgIndex = 0;
    private boolean islive = true;
    private  int x;
    private  int y;

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


    public Player() {
    }

    public Player(int x, int y) {
        this.x = x;
        this.y = y;
    }
    // 改变方向
    public void changeDirection(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_DOWN) {
            // System.out.println("下");
            if (direction == 0) {
                move('y', 1);
            } else {
                direction = 0;
            }

        } else if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
            if (direction == 1) {
                move('x', 1);
            } else {
                direction = 1;
            }

        } else if (e.getKeyCode() == KeyEvent.VK_LEFT) {

            if (direction == 3) {
                move('x', -1);
            } else {
                direction = 3;
            }
        } else if (e.getKeyCode() == KeyEvent.VK_UP) {
            //System.out.println("上");
            if (direction == 2) {
                move('y', -1);
            } else {
                direction = 2;
            }
        } else if (e.getKeyCode() == KeyEvent.VK_SPACE) {
            Bullet bullet = new Bullet(x, y, direction);
            new Thread(bullet).start();
            Map.bullets.add(bullet);
            Music.soundShot(Music.BGMOne);


        }else if(e.getKeyChar()=='c') {
            for (int i = Map.tanks.size() - 1; i >= 0; i--) {
                Map.boomVector.add(new Boom(Map.tanks.get(i).getX(), Map.tanks.get(i).getY()));
                Map.tanks.remove(i);
                Music.bigBoom(Music.bigBgm);
            }
        }


    }
    // 玩家移动方向
    public void move(char c, int i) {
        if (c == 'y' && crash(x, y + i)) {
            y += i;
        } else if (c == 'x' && crash(x + i, y)) {
            x += i;
        }
    }
    //判断玩家是否碰撞

    public boolean crash(int x, int y) {
        if (Map.MAP[y][x] == Map.GAS || Map.MAP[y][x] == Map.DEFALUT) {
            return true;
        }
        return false;
    }
    //画出玩家的方法
    public void drawPlayer(Graphics g, Image img, Image gas, Jpanel jp) {
        g.drawImage(img, x * Map.CELL, y * Map.CELL, (x + 1) * Map.CELL, (y + 1) * Map.CELL, imgIndex * 32, direction * 32, (imgIndex + 1) * 32, (direction + 1) * 32, jp);
        //System.out.println(imgIndex);
        //System.out.println(direction);
        drawGrass(g, gas, jp);

    }
    //画草的方法 一共写了两个 一个在Character 继承使用

    public void drawGrass(Graphics g, Image gas, Jpanel jp) {
        if (Map.MAP[y][x] == Map.GAS) {
            g.drawImage(gas, x * Map.CELL - 2, y * Map.CELL - 2, (x + 1) * Map.CELL, (y + 1) * Map.CELL, 0, 0, 87, 83, jp);
        }
    }

    @Override
    public void run() {
        while (islive) {
            if (imgIndex < 3) {
                imgIndex++;

            } else {
                imgIndex = 0;
            }
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            //System.out.println(imgIndex);
        }
    }
}
