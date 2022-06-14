package com.cognizant.shapes;

public class Circle {
	
	

	private float radius;
	protected float pi=3.5f;
	
	public Circle() {
		radius=1.5f;
		System.out.println("Radius " + radius);
		
	}
	
	protected Circle(float radius) {
		
		this.radius=radius;
		Circle circle=new Circle(radius,pi);
		
		
	}
	public Circle(float radius1,float pi) {
		
		this.radius=radius1;
		float area=pi*radius*radius;
		
		System.out.println("Area in  area class" + area);
		
	}
	
	public float calculateCircleArea(float radius){
		
		float area=pi*radius*radius;
		return area;
		
	}
	
	public float calculateCircumference(float radius){
			
			float circumference=2*pi*radius;
			return circumference;
			
		}
	
	public static void main(String args[]) {
		
		Circle circle=new Circle();
		float area=circle.calculateCircleArea(5);
		float circumfrence=circle.calculateCircumference(5);
		
		System.out.println("Area " + area);
		System.out.println("Circumfrence " + circumfrence);
		
	}
	
	
	

}
