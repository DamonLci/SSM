package org.home.Reflect;

public class Reflect {
    public static void main(String[] args) {
        try {
            Class<?> cl = Class.forName("java.lang.Number");
            System.out.println(cl);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        Class<?> cl = Integer.class;
        System.out.println(cl);
        cl=new Integer(11).getClass();
        System.out.println(cl);
    }
}
