package Assignment;



public class Bonus {
	
	private double bonus;
	
	private double percentage=0.05;
	private double salary;
	private int years;
	
	public Bonus(double salary1, int years1) {
		super();
		this.salary = salary1;
		this.years = years1;
		bonus=netBonus(salary,years);
		
	}
	
	
	
	
	public double netBonus(double salary,int years) {
		
		double netbonus=0;
		try {
			
			if (years>=5) {
				
				netbonus=(percentage*(salary))+salary;
				
			}else {
				netbonus=salary;
				throw new LessThanFive();
			}
		}catch(LessThanFive ex) {
			
			System.out.println(ex.getMessage());
			
		}
		
		return netbonus;
		
	}




	public double getBonus() {
		return bonus;
	}
	

	

}
