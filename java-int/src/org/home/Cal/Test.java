package org.home.Cal;

public class Test {
    public static void main(String[] args) {
        UseCompute us=new UseCompute();
        Add add=new Add();
        Red re=new Red();
        Mult mu=new Mult();
        Division dv=new Division();
        us.useCom(add,1,4);
        us.useCom(re,1,5);
        us.useCom(mu,1,6);
        us.useCom(dv,8,2);

    }


}
