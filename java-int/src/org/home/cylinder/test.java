package org.home.cylinder;

public class test extends Pillar{
    public static void main(String[] args) {
        circle cr=new circle();
        squared sq=new squared();
        Pillar pr=new Pillar();

        System.out.println("圆形面积是"+ cr.getArea(pr.getAre(3,4),6.0));
        System.out.println("矩形面积是"+ sq.getArea(pr.getAre(2,4),6.0));

    }
}
