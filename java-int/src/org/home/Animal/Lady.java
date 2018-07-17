package org.home.Animal;

public class Lady {
    private String name;
    private Animail ami;

    public Lady(String name, Animail ami) {
        this.name = name;
        this.ami = ami;
    }

    public void myPetEnjoy(Animail ani,String name){
        System.out.println(name);
    }

    public Lady() {
    }

    public static void main(String[] args) {
        Cat ca=new Cat("lilis","黑色");
        Dog dg=new Dog("hh","白色");


        Lady l=new Lady();
        ca.enjoy();
        l.myPetEnjoy(ca,"lucy");
        dg.enjoy();
        l.myPetEnjoy(dg,"lilia");


    }

}
