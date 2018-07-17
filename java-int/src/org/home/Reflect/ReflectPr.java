package org.home.Reflect;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class ReflectPr {
    public static <T> T encapsulation(Map<String, Object> map, Class<T> cl) {
        T po = null;
        try {
            Field[] f = cl.getDeclaredFields();
            Iterator iter = map.entrySet().iterator();
            while (iter.hasNext()) {
            for (int i = 0; i < f.length; i++) {

                    po = cl.newInstance();
                    Map.Entry entry = (Map.Entry) iter.next();
                    /*Object key = entry.getKey();
                    Object val = entry.getValue();
                    Class<?> t = f[i].getType();
                    String a = f[i].getName();
                    String c = a.substring(0, 1).toUpperCase();
                    String b = c + a.substring(1, a.length());
                    String d = f[i + 1].getName();
                    String e = d.substring(0, 1).toUpperCase() + d.substring(1, d.length());
                    Method me = cl.getMethod("set" + b, t.getSimpleName().getClass());
                    Method me1 = cl.getMethod("set" + e, f[i+1].getType());
                    //System.out.println(f[i + 1].getType());
                    po = cl.newInstance();
                    me.invoke(po, key);
                    me1.invoke(po, val);
                   *//* Method usernameget = cl.getDeclaredMethod("getUserName");
                    System.out.println(usernameget.invoke(po));*//*
                    return po;*/
                    if (entry.getKey().equals(f[i].getName())) {
                        // po=cl.newInstance();
                        String e = f[i].getName().substring(0, 1).toUpperCase() + f[i].getName().substring(1, f[i].getName().length());
                        Method me = cl.getMethod("set" + e, f[i].getType());

                        me.invoke(po, entry.getValue());


                    }
                }
            }


        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
        return po;

    }

    public static void main(String[] args) {
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("userName", "123");
        map.put("userPwd", "123");
        UsersPo po = encapsulation(map, UsersPo.class);
        System.out.println(po);
    }

}
