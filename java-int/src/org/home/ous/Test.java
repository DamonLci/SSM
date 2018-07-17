package org.home.ous;

public class Test  {
    public static void main(String[] args) {
        ClassB cb=new ClassB();
        System.out.println("1到100的偶数和"+cb.method(100));
        ClassA ca=new ClassA();
        System.out.println("1到100的和"+ca.method(100));

    }


}
