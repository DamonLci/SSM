package org.home.DayOne;

public class Student {
    private String userName;
    private int userId;
    private double java;
    private double html;
    private double sql;

    public String getUserName() {
        return userName;
    }

    public boolean setUserName(String userName) {
        if(userName!=null){
            this.userName = userName;
        }
        else{
            System.out.println("你输入的姓名为空");
            return false;
        }
        return true;

    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public double getJava() {
        return java;
    }

    public boolean setJava(double java) {
        if(java>0 && java <=100){
            this.java = java;
        }else {
            System.out.println("你输入的成绩不合法");
            return false;
        }
        return true;
    }

    public double getHtml() {
        return html;
    }

    public boolean setHtml(double html) {
        if(html>0 && html <=100){
            this.html = html;
        }else {
            System.out.println("你输入的成绩不合法");
            return false;
        }
        return true;
    }

    public double getSql() {
        return sql;
    }

    public boolean setSql(double sql) {
        if(sql>0 && sql <=100){
            this.sql = sql;
        }else {
            System.out.println("你输入的成绩不合法");
            return false ;
        }
        return true;
    }

    public Student() {
    }

    public Student(String userName, int userId, double java, double html, double sql) {
        setUserName(userName);
        setUserId(userId);
        setJava(java);
        setHtml(html);
        setSql(sql);

    }
}
