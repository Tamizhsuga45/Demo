package com.cognizant.shapes;

public class Circle {
	 private float radius;
	 float pi=3.5f;
	public Circle(){
		this.radius=1.5f;
		
	}
	 Circle(Float radius) {
		this.radius=radius;}
    public Circle(float radius,float pi) {
    	this.radius=radius;
    	this.pi=pi;    }
 
    public float calculateCircleArea(float radius) {
        return pi * radius * radius;
    }

    
    public  float calculateCircumference(float radius) {
        return 2 * pi * radius;
    }

    public static void main(String[] args) {
        Circle c4= new Circle(1.5f);

        
       c4.calculateCircleArea(1.5f);
       c4.calculateCircumference(1.5f); 
      
	System.out.println("Circle Area: " + c4.calculateCircleArea(1.5f));
	System.out.println("Circumference:"+c4.calculateCircumference(1.5f));
    }
}

