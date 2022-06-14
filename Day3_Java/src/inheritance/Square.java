package inheritance;

public class Square extends Shape{
	
	@Override
	public void calculateArea() {
		System.out.println("calculating area of Square");		
	}
	public static void main(String[] args) {
		
		Shape s1;//REference variable of Shape
		System.out.println("Calling rectangle");
		s1=new Rectangle();
		s1.acceptHeight();
		s1.acceptWidth();
		s1.calculateArea();
		s1=new Square();
		s1.acceptHeight();
		s1.acceptWidth();
		s1.calculateArea();
	}

}
