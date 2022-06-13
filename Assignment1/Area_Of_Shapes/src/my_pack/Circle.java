package my_pack;

public class Circle {
	

	private double pi=3.14;
	private double diameter;
	
	public double getDiameter() {
		return diameter;
	}
	public void setDiameter(double diameter) {
		this.diameter = diameter;
	}
	
	public double ACircle(double diameter1) {
		
		setDiameter(diameter1);
		
		double radius=(diameter/2);
		
		double area=pi*(radius)*(radius);
		
		return area;
	}
	

}
