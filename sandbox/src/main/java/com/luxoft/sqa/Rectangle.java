package com.luxoft.sqa;

public class Rectangle {
    private double a;
    private double b;


    public Rectangle(int a , int b){
        this.a = a;
        this.b = b;

    }

    public double sayArea() {
        return a * b;
    }
}