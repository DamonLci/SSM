package org.home.test;

public abstract class TestAbstract {
     void test(){
        System.out.println("i am pig");
    }

    abstract void m2();
}
 class B extends TestAbstract{
    public static void main(String[] args) {
        B b=new B();
        b.test();
        b.m2();
    }
    @Override
    void m2() {
        System.out.println("xixi");
    }
}
