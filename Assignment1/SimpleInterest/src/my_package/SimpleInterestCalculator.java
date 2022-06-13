package my_package;

public class SimpleInterestCalculator {
	
	private double principal_amount;
	private int number_of_years;
	

	public double getPrincipal_amount() {
		return principal_amount;
	}


	public void setPrincipal_amount(double principal_amount) {
		this.principal_amount = principal_amount;
	}


	public int getNumber_of_years() {
		return number_of_years;
	}


	public void setNumber_of_years(int number_of_years) {
		this.number_of_years = number_of_years;
	}
	
	
	public double  calculateSimpleInterest(int n, double p) {
		
		setPrincipal_amount(p);
		setNumber_of_years(n);
		double lakh=100000;
		double intrest;
		
		if (principal_amount>lakh) {
			
			if(number_of_years>10) {
				
				intrest= principal_amount * number_of_years * 10/100;
				
			}
			else  {
				
				intrest= principal_amount * number_of_years * 9.5/100;
			}
			
		}
		else {
			
			if(number_of_years>10) {
				
				intrest= principal_amount * number_of_years * 5/100;
				
			}
			else  {
				
				intrest= principal_amount * number_of_years * 4.5/100;
			}
			
			
		}		
		
		return intrest;
	}

}
