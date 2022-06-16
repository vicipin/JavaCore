package multithread;


public class Multiple_of_10 extends Thread {
	
	
	public void run()
	{
		for(int x=1;x<=100;x++)
		{
			try {
				if((x % 10)== 0) {
					
					System.out.println(x + " Is a multiple of 10");
					
				}
				Thread.sleep(300);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public static void main(String[] args) {
		Multiple_of_10 th1=new Multiple_of_10();//New Thread Stage
		Multiple_of_4 th2=new Multiple_of_4();//New Thread Stage
		
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
		
		
	}
	
	
	

}
