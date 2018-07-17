package org.wym.tank1_0_0.Jframe;

import org.wym.tank1_0_0.Bullet.Boom;
import org.wym.tank1_0_0.Bullet.Bullet;
import org.wym.tank1_0_0.Bullet.Tank;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.Random;

public class Jpanel extends JPanel implements Runnable {
    Image gas = null;
    Image water = null;
    Image steels = null;
    Image brick = null;
    Image jp = null;
    Image boss = null;
    int imageIndex = 0;
    boolean c = false;
    Image user = null;
    Image bulle = null;
    Image boom = null;
    Image error = null;
   // Player p = new Player();
    public static Player player;

   // Bullet bu = new Bullet();
    Image npc=null;
    // Bullet bullet = new Bullet(p.x, p.y, p.direction);
    // Boom booms =new Boom(p.x,p.y);
    public Jpanel() {
        //设置背景颜色
        this.setBackground(Color.white);
        this.setVisible(true);
        try {
            //草
            gas = ImageIO.read(new File("img/grass.png"));
            //水
            water = ImageIO.read(new File("img/water.png"));
            //钢板
            steels = ImageIO.read(new File("img/steels.png"));
            //木头
            brick = ImageIO.read(new File("img/brick.png"));
            //边界
            jp = ImageIO.read(new File("img/jp.jpg"));
            //boss
            boss = ImageIO.read(new File("img/boss.gif"));
            //玩家
            user = ImageIO.read(new File("img/player.png"));
            //子弹
            bulle = ImageIO.read(new File("img/bullet.png"));
            //爆炸
            boom = ImageIO.read(new File("img/boom.png"));
            //失败
            error = ImageIO.read(new File("img/gameOver.jpg"));
            //小怪
            npc= ImageIO.read(new File("img/npc.gif"));

        } catch (IOException e) {
            e.printStackTrace();
        }
        this.setFocusable(true);
        this.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                super.keyPressed(e);
                player.changeDirection(e);
            }
        });
        //开启绘图线程
        new Thread(this).start();
        //开启玩家线程
        new Thread(player).start();
        //新建玩家的线程
        player=new Player(17,18);
        //背景BGM
        Music.playSound(Music.BGM);
        //设置可见性
        this.setVisible(true);
        //new Thread(booms).start();
    }
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        if(Map.boosLive==true){
        drawMap(g);
        if(Map.tanks.size()<4){
            addMore();
        }
        player.drawPlayer(g, user, gas, this);
        drawBullet(g);
        crash(player.getX(), player.getY());
        drawBoom(g);
        drawTank(g);
        paintNpcBullet(g);}
        else {
            g.drawImage(error, 0, 0, 1150, 1000, 0, 0, 961, 540, this);
        }

    }
    public void drawTank(Graphics g){
        for(int i=0;i<Map.tanks.size();i++) {
           // Tank t = Map.tanks.get(i);
            if(Map.tanks.get(i).isIslive()==true) {
                Map.tanks.get(i).draw(g, npc, gas,this);
            }else {
                Map.tanks.remove(i);
            }
        }
    }

    public void addMore(){
      //  System.out.println(Map.tanks.size());
        if(Map.tanks.size()==0){
            Map.tanks.add(new Tank(1,1));
            Map.tanks.add(new Tank(15,1));
            Map.tanks.add(new Tank(30,1));
        }
        else if (Map.tanks.size() >= 1) {
            int number = new Random().nextInt(3);
            if (number == 0) {
                Map.tanks.add(new Tank(1, 1));
            } else if (number == 1) {
                Map.tanks.add(new Tank(15, 1));
            } else if(number==2){
                Map.tanks.add(new Tank(30, 1));
            }
        }

    }

    public void drawBullet(Graphics g) {
        for (int i = 0; i <Map.bullets.size(); i++) {
            Bullet b = Map.bullets.get(i);
            if (b.isLive() == true) {
                Map.bullets.get(i).drawBullet(g, bulle, gas,this);
            } else {
                Map.bullets.remove(i);
            }
        }

    }
    public void drawBoom(Graphics g) {
        for (int i = 0; i < Map.boomVector.size(); i++) {
            Boom b = Map.boomVector.get(i);
            if (b.isBoomIsLive()) {
                b.drawBoom(g, boom, this);
            } else {
                Map.boomVector.remove(i);
            }
        }

    }

    public boolean crash(int x, int y) {
        if (Map.MAP[y][x] == Map.BORDER || Map.MAP[y][x] == Map.STEELS || Map.MAP[y][x] == Map.BOSS || Map.MAP[y][x] == Map.BRICK) {
            return true;
        }
        return false;
    }
    public void paintNpcBullet(Graphics g) {
        for (int i = 0; i < Map.TankBullet.size(); i++) {
           // System.out.println(Map.TankBullet.get(i).isLive);
            if (Map.TankBullet.get(i).isLive() == true) {
                Map.TankBullet.get(i).drawBullet(g, bulle, gas, this);
            } else if (Map.TankBullet.get(i).isLive() == false) {
                Map.TankBullet.remove(i);
                //System.out.println(Map.TankBullet.size());
            }
        }

    }


    public void drawMap(Graphics g) {
        // System.out.println(imageIndex);

        //System.out.println(bu.isBoosLive());
        if (Map.boosLive == true) {
            for (int y = 0; y < Map.MAP.length; y++) {
                for (int x = 0; x < Map.MAP[y].length; x++) {
                    if (Map.MAP[y][x] == Map.GAS) {
                        g.drawImage(gas, Map.CELL * x, Map.CELL * y,
                                Map.CELL * (x + 1), Map.CELL * (y + 1), 0, 0, 87, 83, this);
                    } else if (Map.MAP[y][x] == Map.BRICK) {
                        g.drawImage(brick, Map.CELL * x, Map.CELL * y,
                                Map.CELL * (x + 1), Map.CELL * (y + 1), 0, 0, 32, 32, this);
                    } else if (Map.MAP[y][x] == Map.WATER) {
                        g.drawImage(water, Map.CELL * x, Map.CELL * y,
                                Map.CELL * (x + 1), Map.CELL * (y + 1), 0, 0, 32, 32, this);
                    } else if (Map.MAP[y][x] == Map.STEELS) {
                        g.drawImage(steels, Map.CELL * x, Map.CELL * y,
                                Map.CELL * (x + 1), Map.CELL * (y + 1), 0, 0, 32, 32, this);
                    } else if (Map.MAP[y][x] == Map.BORDER) {
                        g.drawImage(jp, Map.CELL * x, Map.CELL * y,
                                Map.CELL * (x + 1), Map.CELL * (y + 1), 0, 0, 32, 32, this);
                    } else if (Map.MAP[y][x] == Map.BOSS) {
                        g.drawImage(boss, Map.CELL * x, Map.CELL * y,
                                Map.CELL * (x + 1), Map.CELL * (y + 1), 0, imageIndex * 34, 41, (imageIndex + 1) * 34, this);

                    }

                }
            }
        }

    }

    @Override
    public void run() {
        while (true) {
            if (imageIndex < 11) {
                imageIndex++;
            } else {
                imageIndex = 0;
            }
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            this.repaint();
            //System.out.println(imageIndex);

        }
    }
}
