package mypack;

public class Thread2 extends Thread {
	
	public void run()
	{
		for(int x=10;x>=1;x--)
		{
			System.out.println("Value of x is "+x);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	public static void main(String[] args) {
		Thread1 th1=new Thread1();
		Thread2 th2=new Thread2();
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
