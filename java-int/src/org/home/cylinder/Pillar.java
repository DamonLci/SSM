package org.home.cylinder;

public class Pillar {
    private double surface;
    private double high;

    public Pillar() {
    }

    public double getSurface() {
        return surface;
    }

    public void setSurface(double surface) {
        this.surface = surface;
    }

    public double getHigh() {
        return high;
    }

    public void setHigh(double high) {
        this.high = high;
    }

    public Pillar(double surface, double high) {
        this.surface = surface;
        this.high = high;
    }
    public double getAre(double surface,double high){
        double s=surface*high;
        return s;
    }
}
