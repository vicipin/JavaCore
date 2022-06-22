package threads;

import java.util.ArrayList;

public class Thread_Main_listLoader {
	
	 public static void main(String[] args) {
		 
		 	 ArrayList<Integer> numbers1 = new ArrayList<Integer>();
		 	 ListLoader numbers = new ListLoader();
			 
			 long lStartTime = System.nanoTime();
			 
			 	Thread_1 th1=new Thread_1(numbers1,0,50);//New Thread Stage
				Thread_2 th2=new Thread_2(numbers1,51,100);//New Thread Stage
				
				th1.start();
				try {
					th1.join();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				th2.start();
				try {
					th2.join();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			long lEndTime = System.nanoTime();
			long output = lEndTime - lStartTime;
			System.out.println("Elapsed time in milliseconds: " + output);
			System.out.println(numbers);
			for(Integer i:numbers1) {
				 
				System.out.println(numbers1.get(i));
				 
				 
			 }

			 
		 }
	 
	

}
