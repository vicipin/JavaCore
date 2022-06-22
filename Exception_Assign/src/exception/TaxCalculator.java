package exception;

public class TaxCalculator {
	
	
	String empName;
	boolean isIndian;
	double empSal;
	
	
	public double  calculatetTax(){
		
		double taxAmount=0;
		
		try {
		
			if (isIndian=false) {
				
				throw new CountryNotValidException();
				
				
				}
		}catch(CountryNotValidException ex) {
			
			System.out.println(ex.getMessage());
			
		}
		
		try {
			if (empName.equals(" ")) {
				
				throw new EmployeeNameInvalidException();
			}
		}catch(EmployeeNameInvalidException ex) {
			System.out.println(ex.getMessage());
		}
		
		
		try {
			if (empSal>=100000 && isIndian ) {
				
				taxAmount=empSal*8/100;
				
			}else if (empSal>=50000 && empSal<100000 && isIndian) {
				
				taxAmount =empSal *6/100 ;
				
			}else if (empSal>=30000 && empSal<50000 && isIndian) {
				
				taxAmount =empSal *5/100 ;
	
			}else if (empSal>=10000 && empSal<30000 && isIndian) {
				
				 taxAmount =empSal *4/100 ;
			
			}else {
				
				throw new TaxNotEligibleException();
			}
		}catch(TaxNotEligibleException ex) {
			
			System.out.println(ex.getMessage());
		}
		
		
		
		
		
		
		return taxAmount;
	}

}
