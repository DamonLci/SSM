package org.home.Reflect;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

public class FieldTest {
    public static void main(String[] args) {
        try {
            Class<?> cls=Class.forName("org.home.Reflect.UserPo");
            String a=Modifier.toString(cls.getModifiers());
            String b=cls.getSimpleName();
            Field [] f=cls.getDeclaredFields();
            System.out.println(a+" class "+b+"{");
            for(int i=0;i<f.length;i++){
                Class<?> t=f[i].getType();
                System.out.println(Modifier.toString(f[i].getModifiers())+" "+t.getSimpleName()+" "+f[i].getName());
                System.out.printf("");

            }
            System.out.println("}");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
