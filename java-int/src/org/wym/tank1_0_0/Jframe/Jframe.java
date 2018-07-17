package org.wym.tank1_0_0.Jframe;

import javax.swing.*;
import java.awt.*;

public class Jframe extends JFrame {
    public static void main(String[] args) {
        Jframe j = new Jframe();
        j.newFrame();
    }

    public void newFrame() {
        //设置大小
        this.setSize(1150, 1000);
        //背景颜色
        this.setBackground(Color.black);
        //设置关闭
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        //设置标题
        this.setTitle("Tank大战");
        //显示出当前屏幕的分辨率
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension dim = toolkit.getScreenSize();
        int he = (int) dim.getHeight();
        int wi = (int) dim.getWidth();
        //设置当前框体的位置
        this.setLocation(he - 1000, wi - 1700);
        //设置布局
        this.setContentPane(new Jpanel());
        //设置可见性
        this.setVisible(true);
    }
}

