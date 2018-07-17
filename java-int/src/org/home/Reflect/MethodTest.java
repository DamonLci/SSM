package org.home.Reflect;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class MethodTest {
    public static void main(String[] args) {
        try {
            Class<?> cls=Class.forName("org.home.Reflect.UserPo");
            Method me=cls.getMethod("setUserName",String.class);
            Object obj=cls.newInstance();
            me.invoke(obj,"admin");
            Method usernameget=cls.getDeclaredMethod("getUserName");
            System.out.println(usernameget.invoke(obj));
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
        test();
    }


    public static void test(){
        try {
            Class<?> cls=Class.forName("org.home.Reflect.UserPo");

            System.out.println(Modifier.toString(cls.getModifiers()) +" class "+cls.getSimpleName()+" {");

            System.out.println();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}
