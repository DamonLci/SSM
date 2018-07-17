package org.home.Animal;

public class Dog extends Animail {
    private String furColor;

    public String getFurColor() {
        return furColor;
    }

    public void setFurColor(String furColor) {
        this.furColor = furColor;
    }

    public Dog(String name, String furColor) {
        super(name);
        this.furColor = furColor;
    }

    public Dog(String furColor) {
        this.furColor = furColor;
    }
    public Dog(){

    }

    @Override
    public void enjoy() {

        System.out.print(getName()+"我是一个狗，我很开心"+furColor);
    };
}
