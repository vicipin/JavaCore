package threads;

import java.util.ArrayList;

public class Thread_1 extends Thread{
	
	




	private ArrayList<Integer> numbers1=new ArrayList<Integer>();
	private int number;
	private int lastnumber;
	
	public Thread_1(ArrayList<Integer> numbers1, int number, int lastnumber) {
	
		this.numbers1 = numbers1;
		this.number = number;
		this.lastnumber = lastnumber;
	}
	
	
	
	@Override
	public void run(){
		
		ListLoader listloader=new ListLoader();
		
		try {
			
			 
			listloader.loadList(numbers1, number, lastnumber);
			
			
			Thread.sleep(300);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}
	
	


}
