package threads;

import java.util.*;

public class ListLoader{
	
	


	private ArrayList<Integer> numbers = new ArrayList<Integer>();
	
	
	
	public  void loadList(ArrayList<Integer> numbers1, int number, int lastNumber ){
		
		
		//try {
		this.numbers=numbers1;
			for(int startNumber=number; startNumber<=lastNumber; startNumber++) {
				 
				 numbers.add(startNumber);
				 
				 
			 }
			 
			
				
		/*} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			Thread.currentThread().interrupt(); 
			e.printStackTrace();
		}*/

	
	
	
	}
	
	

}
