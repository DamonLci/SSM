package org.home.Animal;

public  class Cat extends Animail{
    private String eyesColor;

    public String getEyesColor() {
        return eyesColor;
    }

    public void setEyesColor(String eyesColor) {
        this.eyesColor = eyesColor;
    }

    public Cat(String name, String eyesColor) {
        super(name);
        this.eyesColor = eyesColor;
    }

    public Cat(String eyesColor) {
        this.eyesColor = eyesColor;
    }
    public Cat() {

    }


    @Override
    public void enjoy() {
        System.out.print(getName()+"我是一个猫，我很开心"+eyesColor);

    };
}
