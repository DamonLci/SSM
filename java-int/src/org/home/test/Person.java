package org.home.test;

public abstract class Person {
    public String name = null;
    public Person(String name ){
        this.name = name;
    }
    public abstract void eat();
    public abstract void play();


}
