package my_pack;

public class Square {
	
	
	private double length;

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}
	
	public double ASquare(double length1) {
		
		setLength(length1);
		
		double area=(length*length);
		
		return area;
	}
	

}
