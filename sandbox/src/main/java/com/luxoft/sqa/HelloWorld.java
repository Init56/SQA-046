package com.luxoft.sqa;

public class HelloWorld{
	public static void main(String[] args){
		Point p1 = new Point(2,3);
		Point p2 = new Point(7,8);
		Point p3 = new Point(10.,18);
		System.out.println(p1.sayArea(p2));
		System.out.println(p2.sayArea(p3));
		}

	}

