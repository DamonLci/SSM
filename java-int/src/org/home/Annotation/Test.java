package org.home.Annotation;

import java.util.concurrent.ThreadPoolExecutor;

public class Test {
    public static void main(String[] args) {
        UserDao u1 = new UserDao();
        u1.setUserId(9);
        //查询id为9的用户

        UserDao u2 = new UserDao();
        u2.setUserName("JTZeng");
        //模糊查询用户名为JTZeng的用户


        UserDao u3=new UserDao();


        String sql1 = Demo.query(u1);
        //查询id为9的用户
        String sql2 = Demo.query(u2);
        //查询用户名为JTZeng的用户


        System.out.println(sql1);
        System.out.println(sql2);



}
}
