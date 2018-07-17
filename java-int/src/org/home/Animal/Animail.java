package org.home.Animal;

public abstract class Animail {
    private String name;
    public abstract void enjoy();
    public Animail(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Animail() {
    }
}
