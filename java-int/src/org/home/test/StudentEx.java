package org.home.test;

public class StudentEx extends Person{
    public StudentEx(String name) {
        super(name);
    }


    @Override
    public void eat() {
            System.out.println("学生" + name + "正在吃饭......");
    }
    @Override
    public void play() {
        System.out.println("嘻嘻"+name);

    }
}
