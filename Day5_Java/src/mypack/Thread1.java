package mypack;

public class Thread1 extends Thread {
	
	 
		public void run()
		{
			for(int x=1;x<=10;x++)
			{
				try {
					System.out.println("Value of x is "+x);
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		public static void main(String[] args) {
			Thread1 th1=new Thread1();//New Thread Stage
			th1.start();//Runnable stage
			
			
		}
}
