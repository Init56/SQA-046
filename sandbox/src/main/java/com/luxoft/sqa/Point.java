package com.luxoft.sqa;

public class Point {
    double x;
    double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;}

    public double sayArea(Point p){
        return Math.sqrt(((this.x - p.x)*(this.x - p.x))+((this.y - p.y)*(this.y - p.y)));
    }

}
