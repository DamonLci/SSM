package org.wym.tank1_0_0.Bullet;

import org.wym.tank1_0_0.Character.Character;
import org.wym.tank1_0_0.Jframe.Jpanel;
import org.wym.tank1_0_0.Jframe.Map;

import java.util.Random;
import java.awt.*;

public class Tank extends Character implements Runnable {
    private int imgIndex = 0;
    private int direction = new Random().nextInt(4);
    private boolean islive = true;
    private int count = 0;
    private int countBullet = 0;

    public Tank(int x, int y) {
        this.x = x;
        this.y = y;
        new Thread(this).start();
    }
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
    public Tank() {
    }
    public boolean isIslive() {
        return islive;
    }

    public void setIslive(boolean islive) {
        this.islive = islive;
    }

    //画出敌方的坦克
    public void draw(Graphics g, Image npc, Image gas, Jpanel jp) {
        if (direction == 0) {
            g.drawImage(npc, x * Map.CELL, y * Map.CELL, (x + 1) * Map.CELL, (y + 1) * Map.CELL, 0, 56, 28, 84, jp);
        } else if (direction == 1) {
            g.drawImage(npc, x * Map.CELL, y * Map.CELL, (x + 1) * Map.CELL, (y + 1) * Map.CELL, 0, 28, 28, 56, jp);
        } else if (direction == 2) {
            g.drawImage(npc, x * Map.CELL, y * Map.CELL, (x + 1) * Map.CELL, (y + 1) * Map.CELL, 0, 0, 28, 28, jp);
        } else if (direction == 3) {
            g.drawImage(npc, x * Map.CELL, y * Map.CELL, (x + 1) * Map.CELL, (y + 1) * Map.CELL, 0, 84, 28, 112, jp);
        }
        //System.out.println(x);
        drawGrass(g, gas, jp);
    }

    //敌方的坦克移动
    public void moves() {
        if (direction == 0 && crashs(x, y + 1)) {
            y++;
        } else if (direction == 1 && crashs(x + 1, y)) {
            x++;
        } else if (direction == 2 && crashs(x, y - 1)) {
            y--;
        } else if (direction == 3 && crashs(x - 1, y)) {
            x--;
        }
    }

    //敌方坦克能否移动
    public boolean crashs(int x, int y) {
        if (Map.MAP[y][x] == Map.GAS || Map.MAP[y][x] == Map.DEFALUT) {
            return true;
        } else {
            return false;
        }
    }

    // 敌方的坦克方向
    public void changeDirection() {
        if (count == 8) {
            direction = newDirection(direction);
            count = 0;
        }
        if (direction == 0) {
            if (!crashs(x, y + 1)) {
                direction = newDirection(direction);
                count = 4;
            }
        } else if (direction == 1) {
            if (!crashs(x + 1, y)) {
                direction = newDirection(direction);
                count = 4;
            }
        } else if (direction == 2) {
            if (!crashs(x, y - 1)) {
                direction = newDirection(direction);
                count = 4;
            }
        } else if (direction == 3) {
            if (!crashs(x - 1, y)) {
                direction = newDirection(direction);
                count = 4;
            }
        }
    }

    // 新的方向
    public int newDirection(int dir) {
        int newDir;
       newDir=new Random().nextInt(4);
       while(newDir==dir) {
           newDir=new Random().nextInt(4);
       }
       return newDir;
    }

    //发射子弹
    public void shot() {
        //System.out.println(countBullet);
        if (countBullet < 5) {
            Bullet bullet = new Bullet(x, y, direction);
            Map.TankBullet.add(bullet);
            new Thread(bullet).start();
        } else if (countBullet == 6) {
            countBullet = 0;
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
                Thread.sleep(300);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            shot();
            countBullet++;
            changeDirection();
            count++;

            moves();


        }

    }


}
