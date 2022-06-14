package inheritance;

public abstract class Shape {
	public void acceptHeight()
	{
		System.out.println("Accepting height of Shape");
	}
	public void acceptWidth()
	{
		System.out.println("Accepting widht of Shape");
	}
	public abstract void calculateArea();
	

}