package percentage_of_m;

public class B extends Marks {
	
	private double mark1;
	private double mark2;
	private double mark3;
	private double mark4;
	
	public B(double mark1, double mark2, double mark3,double mark4) {
		super();
		
		
		this.mark1 = mark1;
		this.mark2 = mark2;
		this.mark3 = mark3;
		this.mark4 = mark4;
				
		getPercentage();
		
		
		
	}
	
	
	
	@Override
	public void getPercentage() {
		
		double total=mark1+mark2+mark3+mark4;
		
		double average=(total/4);
		System.out.println("The Avrage is  " + average);
			
		
	}

}
