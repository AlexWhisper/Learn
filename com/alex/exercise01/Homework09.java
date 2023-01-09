package com.alex.exercise01;

public class Homework09 {
    public static void main(String[] args) {
        LabeledPoint thursday = new LabeledPoint("Thursday", 1929, 230.08);

    }
}
class Point{
    private double x;
    private double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }
}

class LabeledPoint extends Point{
    private String label;

    public LabeledPoint(String label,double x, double y) {
        super(x, y);
        this.label = label;
    }
}