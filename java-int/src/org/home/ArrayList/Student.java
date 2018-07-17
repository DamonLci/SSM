package org.home.ArrayList;

public class Student {
    private String name;
    private String className;
    private double testScore;

    public Student() {
    }

    public Student(String name, String className, double testScore) {
        this.name = name;
        this.className = className;
        this.testScore = testScore;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public double getTestScore() {
        return testScore;
    }

    public void setTestScore(double testScore) {
        this.testScore = testScore;
    }
}
