package com.tns.Abstraction;

public class Rectangle extends Shape {
private float width, height;

public Rectangle() {
	super();
	this.width=0.5f;
	this.height=2.5f;
}

public Rectangle(float width, float height) {
	super();
	this.width = width;
	this.height = height;
}

@Override
void calArea() {
	// TODO Auto-generated method stub
	
}

@Override
public String toString() {
	return "Rectangle [width=" + width + ", height=" + height + "]";
}

   
}