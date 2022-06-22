package assignment2;

public class Grade {
	

	private int score;
	

	public Grade(int score1) {
		
		this.score = score1;
		gRade(score);
	}
	
	public void gRade(int score) {
		
		if (score<=25) {
			
			System.out.println("You have a Grade of F");
			
		}else if(score>25 && score<=45) {
			
			System.out.println("You have a Grade of E");
			
		}else if(score>45 && score<=50) {
			
			System.out.println("You have a Grade of D");
			
		}else if(score>50 && score<=60) {
			
			System.out.println("You have a Grade of C");
			
		}
		else if(score>60 && score<=80) {
			
			System.out.println("You have a Grade of B");
			
		}else {
			
			System.out.println("You have a Grade of A");
			
		}
		
		
	}; 
	
	

}
