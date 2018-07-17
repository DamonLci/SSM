package org.home.test;

import java.util.Scanner;

public class Student {
    public String name;
    public int age;

    public static void main(String[] args) {
        Student[] students= new Student[3];
        Scanner sc=new Scanner(System.in);
        for (int i=0;i<3;i++){
            System.out.println("请输入学生姓名");
            String name=sc.next();
            System.out.println("请输入学生年龄");
            int age=sc.nextInt();
            Student st=new Student();
            st.name=name;
            st.age=age;
            students[i]=st;
        }
        for(Student s:students){
            System.out.print("姓名"+s.name);
            System.out.println("年龄"+s.age);
        }
    }

    public void login(){
        String[][] arr=new String [2] [1];
        arr[0][0]="张三";
        arr[0][1]="1234";
        arr[1][0]="李四";
        arr[1][1]="1234";
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入账号");
        String name=sc.next();
        System.out.println("请输入密码");
        String pass=sc.next();

    }
}
