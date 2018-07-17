package org.home.Reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Modifier;

public class UserPo {
    private int id;
    private String userName;
    private String userPwd;

    public UserPo() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPwd() {
        return userPwd;
    }

    public void setUserPwd(String userPwd) {
        this.userPwd = userPwd;
    }

    public UserPo(int id, String userName, String userPwd) {
        this.id = id;
        this.userName = userName;
        this.userPwd = userPwd;
    }

    public UserPo(String userName, String userPwd) {
        this.userName = userName;
        this.userPwd = userPwd;
    }

    public static void main(String[] args) {
        one();
        two();
        three();

    }
    public static void one(){
        try {
            Class<?> cls=Class.forName("org.home.Reflect.UserPo");
            UserPo userPo=(UserPo)cls.newInstance();
            userPo.setId(11);
            userPo.setUserName("李根");
            userPo.setUserPwd("ligen");
            System.out.println(userPo);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }
    }
    public static void two(){
        try {
            Class<?> cls=Class.forName("org.home.Reflect.UserPo");
            Constructor<?> c=cls.getConstructor(int.class,String.class,String.class);
            UserPo userPo=null;
            userPo=(UserPo)c.newInstance(11,"李根","ligen");
            System.out.println(userPo);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
    }
    public static void three(){
        try {
            Class<?> cls=Class.forName("org.home.Reflect.UserPo");
           // String a=cls.toString();
            String b=Modifier.toString(cls.getModifiers());
            //System.out.println(a);
            String c=cls.getSimpleName();
            System.out.println(b+c+"{}");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
