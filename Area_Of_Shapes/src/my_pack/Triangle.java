package my_pack;

public class Triangle {
	
	
	
	private double length;

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}
	
	public double ATriangle(double length1) {
		
		setLength(length1);
		double area=(length * length)*(0.433013);
		
		return area;
	}
	
	
	

}
