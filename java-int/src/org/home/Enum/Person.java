package org.home.Enum;

public class Person {
    private String name;
    private int age;
    private String birth;
    private Sex sex;


    public Person(String name, int age, String birth, Sex sex) {
       /* if (sex=="男" || sex=="女") {
            this.sex = sex;
        }else{
            System.out.println("错误");
            return ;
        }*/
       this.sex=sex;
        this.name = name;
        this.age = age;
        this.birth = birth;

    }
    public void add(){

    }

    public static void main(String[] args) {
        Person pe=new Person("王大",12,"1990/1/1",Sex.MAN);


    }
}
