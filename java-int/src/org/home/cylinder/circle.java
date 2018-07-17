package org.home.cylinder;

public class circle implements Geometey {
    public static double bai=3.14;
    @Override
    public double getArea(double a, double b) {
        return (a*b*bai);
    }
}
