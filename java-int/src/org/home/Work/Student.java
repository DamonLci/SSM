package org.home.Work;

public class Student extends UserData{
    private String sex;

    public Student(String name, int age, String sex) {
        super(name, age);
        this.sex = sex;
    }

    public Student(String sex) {
        this.sex = sex;
    }

    public Student() {
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }



    @Override
    public void showInfo() {
        System.out.println("年龄"+getAge()+"性别"+getSex()+"名字"+getName());

    }
}
